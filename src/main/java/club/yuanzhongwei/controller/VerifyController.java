package club.yuanzhongwei.controller;

import club.yuanzhongwei.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/20 13:44
 * @Version 1.0
 * @Description
 */
@RestController
@RequestMapping("verify")
public class VerifyController {

    @Autowired
    VerifyCodeService verifyCodeService;

    @RequestMapping(value = "getVerifyCode")
    public String getVerifyCode(@RequestParam String phoneNum) {
        return verifyCodeService.getVerifyCode(phoneNum);
    }
}
