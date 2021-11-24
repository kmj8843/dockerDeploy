package com.example.dockertest.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class sampleController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/")
    @ResponseBody
    public String index(HttpServletRequest request) {
        logger.info("CLI Hello, Docker");

        return "Hello, Docker!";
    }
}
