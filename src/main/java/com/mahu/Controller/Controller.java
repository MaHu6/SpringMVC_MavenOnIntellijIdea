package com.mahu.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by simahu on 2017/3/18.
 */
@org.springframework.stereotype.Controller
@RequestMapping(value = "/hello")
public class Controller {
    @RequestMapping(value = "/mvc")
    /*   URL:   localhost:8080/hello/mvc    */
    public String CallBack(){
        System.out.println("调用 callback()");
        return "callback";
    }
}
