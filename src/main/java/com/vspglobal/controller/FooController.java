package com.vspglobal.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.vspglobal.domain.Foo;


@Controller
@RequestMapping("/foo")
public class FooController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    Foo process(@RequestParam(value = "content", required = false, defaultValue = "content") String content) {
        return new Foo(counter.incrementAndGet(), content );
    }

}