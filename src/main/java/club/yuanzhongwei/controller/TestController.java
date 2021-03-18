package club.yuanzhongwei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/18 00:23
 * @Version 1.0
 * @Description
 */
@RestController
public class TestController {
    @RequestMapping(value = "hello")
    public String sayHello(){
        return "hello";
    }
}
