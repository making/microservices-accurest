package io.pivotal.microservices.accurest.consumer

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.boot.test.TestRestTemplate
import org.springframework.boot.test.WebIntegrationTest
import spock.lang.Specification;

/**
 * Spock Version
 */
@SpringApplicationConfiguration(classes = Application)
@WebIntegrationTest(randomPort = true)
class ApplicationSpec extends Specification {
    @Value("\${local.server.port}")
    int port
    TestRestTemplate restTemplate = new TestRestTemplate()

    def 'request for foos'() {
        when:
        def foos = restTemplate.getForObject("http://localhost:${port}/foos", String)

        then:
        foos == """[{"value":42},{"value":100}]"""
    }
}
