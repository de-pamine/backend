package com.depamine.depamine.user.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {
    @RequestMapping("/doTest")
    public  String doTest() {

        System.out.println("@@@ doTest로 이동!");
        return "go.html";
    }


}
