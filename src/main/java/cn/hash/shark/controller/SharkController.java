package cn.hash.shark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SharkController {

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

//    @GetMapping("/login")
//    public ModelAndView login(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("login");
//        return mv;
//    }
//
//    @GetMapping("/register")
//    public ModelAndView register(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("register");
//        return mv;
//    }

    @GetMapping("/blog")
    public ModelAndView blog(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("blog");
        return mv;
    }

}
