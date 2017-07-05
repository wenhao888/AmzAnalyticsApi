package com.lychee.amz.analytics.features.login;

import com.lychee.amz.analytics.advice.ISecurityAdvice;
import com.lychee.amz.analytics.features.authentication.model.AuthUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @Autowired
    private ISecurityAdvice securityAdvice;


    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String login(){
        AuthUser user = securityAdvice.getPrinciple();


        return "success";
    }
}