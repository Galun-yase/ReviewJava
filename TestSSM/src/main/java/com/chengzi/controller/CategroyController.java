package com.chengzi.controller;

import com.chengzi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/categroy")
public class CategroyController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("list",categoryService.findAll());
        return mv;
    }
}
