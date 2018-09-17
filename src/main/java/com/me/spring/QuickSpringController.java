package com.me.spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class QuickSpringController {

    @GetMapping(path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping(path = "/")
    public String root() {
        return "Hello, Thompson! Add /hello/there to the URL to get a friendly reply.";
    }

    @GetMapping(path = "/blah")
    public String blah() {
        return "Hello, blah!";
    }

}
