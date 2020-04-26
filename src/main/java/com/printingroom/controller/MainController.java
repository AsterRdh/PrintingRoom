package com.printingroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @RequestMapping("/index")
    public ModelAndView indexHandleRequest(javax.servlet.http.HttpServletRequest httpServletRequest){
        ModelAndView mav=new ModelAndView("index.jsp");
        return mav;
    }
}
