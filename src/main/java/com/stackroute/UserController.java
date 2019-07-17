package com.stackroute;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stackroute.User;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping("/login")
    public ModelAndView greet(HttpServletRequest request, HttpServletResponse response){
        String str1=request.getParameter("name");
        String str2=request.getParameter("password");
        User u = new User(str1,str2);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("username",str1);
        mv.addObject("password",str2);
        return mv;
    }
}
