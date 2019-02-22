package com.hjr.framework.appollo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2018/5/6 下午6:40
 */
@Controller
@RequestMapping({"/demo"})
public class DemoController {
    public DemoController() {
    }

    @RequestMapping
    @ResponseBody
    public String init() {
        return "Hello World!!!";
    }

    @RequestMapping({"/index"})
    public String index(Model view) {
        view.addAttribute("test", "Hello world!!!!");
        return "demo/index";
    }

    @RequestMapping({"/show"})
    @ResponseBody
    public String show() {
        return "OK!";
    }
}

