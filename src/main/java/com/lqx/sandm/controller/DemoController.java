package com.lqx.sandm.controller;

import com.lqx.sandm.pojo.User;
import com.lqx.sandm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DemoController {

    @Autowired
    private DemoService demoService;

    @Autowired
    private HttpServletRequest request;

    /**
     * Controller层
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(){
        List<User> userList = demoService.findAll();
        request.setAttribute("userList", userList);
        return "index";
    }
}
