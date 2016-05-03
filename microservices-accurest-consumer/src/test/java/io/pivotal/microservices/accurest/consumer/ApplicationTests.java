package io.pivotal.microservices.accurest.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * JUnit Version
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest(randomPort = true)
public class ApplicationTests {
    @Value("${local.server.port}")
    int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void contextLoads() {
        assertThat(restTemplate.getForObject("http://localhost:" + port + "/foos", String.class), is("[{\"value\":42},{\"value\":100}]"));
    }

}
