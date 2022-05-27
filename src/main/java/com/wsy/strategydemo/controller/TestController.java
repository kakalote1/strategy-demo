package com.wsy.strategydemo.controller;

import com.wsy.strategydemo.dto.NameDTO;
import com.wsy.strategydemo.service.CoderService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final CoderService coderService;

    public TestController(CoderService coderService) {
        this.coderService = coderService;
    }

    @RequestMapping("/test")
    public void test(@RequestBody NameDTO nameDTO) {
        coderService.active(nameDTO);
    }
}
