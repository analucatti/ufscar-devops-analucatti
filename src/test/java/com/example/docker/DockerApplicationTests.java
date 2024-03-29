package com.example.docker;

import com.example.docker.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DockerApplicationTests {

    @Autowired
    private HelloController controller;

    @Test
    public void contexLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnWelcomeMessage() throws Exception {
        this.mockMvc.perform(get(Constants.URI.getType())).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString(Constants.WELCOME.getType())));
    }

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get(Constants.HOME.getType())).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString(Constants.APP.getType())));
    }
}
