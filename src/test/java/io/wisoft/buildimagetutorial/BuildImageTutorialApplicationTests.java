package io.wisoft.buildimagetutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static net.minidev.asm.BeansAccess.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@WebMvcTest
class BuildImageTutorialApplicationTests {

    @Autowired
    MockMvc client;

    @Test
    void hello() throws Exception {
        client.perform(
                MockMvcRequestBuilders.get("/")
        ).andExpect(
         content().string("Hello Docker World")
        );
    }

}
