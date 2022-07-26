package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Chris Yang
 * created 2022-07-19 21:24
 **/

@Controller
public class TestController {

    @GetMapping("/t") //localhost/t
    @ResponseBody // 直接向响应输出字符串数据，不跳转界面
    public String test(){
        return "SUCCESS";
    }
}
