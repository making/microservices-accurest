package io.pivotal.microservices.accurest.provider;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;

import org.junit.Before;

public class MvcTest {

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new Application());
    }

}