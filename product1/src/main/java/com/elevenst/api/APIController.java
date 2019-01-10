package com.elevenst.api;

import com.elevenst.config.ClientConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    ClientConfiguration clientConfiguration;

    @GetMapping(path = "version")
    public String getAPIVersion() {

        return String.format("The current API Version is %s.",clientConfiguration.getAPIVersion());
    }
}
