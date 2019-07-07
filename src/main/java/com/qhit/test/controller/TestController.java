package com.qhit.test.controller;

import com.qhit.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Date:2019/7/7
 * @Description:
 * @version:1.0
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;

//    @ResponseBody
    @RequestMapping("/tests")
    public String selAll(ModelAndView modelAndView){

        return  "index";
    }

}
