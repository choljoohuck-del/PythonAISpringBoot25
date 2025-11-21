package org.mbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // url 분기를 담당함 no usages
public class HomeController {

    @GetMapping("/") // http://localhost:8000/  반응하는 메서드 no usages
    public String home() {
        return "index";
    }
}