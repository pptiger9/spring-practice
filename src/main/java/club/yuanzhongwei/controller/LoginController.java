package club.yuanzhongwei.controller;

import club.yuanzhongwei.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/20 13:59
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "login")
    public String getVerifyCode(@RequestParam String username,@RequestParam String password) {
        if (loginService.verifyUser(username,password)){
            return "true";
        }else {
            return "false";
        }
    }
}
