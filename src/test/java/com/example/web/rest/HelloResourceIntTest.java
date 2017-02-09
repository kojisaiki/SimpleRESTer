package com.example.web.rest;

import com.example.SimpleResTerApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by koji on 2017/02/09.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SimpleResTerApplication.class)
public class HelloResourceIntTest {

    private MockMvc restHelloMockMvc;

    @Before
    public void setup() {
        HelloResource helloResource = new HelloResource();
        this.restHelloMockMvc = MockMvcBuilders.standaloneSetup(helloResource).build();
    }

    @Test
    public void testHello() throws Exception {
        restHelloMockMvc.perform(get("/api/hello").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("hello!yahoo!"));
    }

}
