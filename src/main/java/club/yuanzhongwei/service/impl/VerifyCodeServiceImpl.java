package club.yuanzhongwei.service.impl;

import club.yuanzhongwei.service.RedisService;
import club.yuanzhongwei.service.VerifyCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/20 13:36
 * @Version 1.0
 * @Description
 */
@Service
public class VerifyCodeServiceImpl implements VerifyCodeService {

    @Autowired
    RedisService redisService;

    @Override
    public String getVerifyCode(String phoneNum) {
        if (redisService.get("spring-practice:" + phoneNum) != null) {
            return (String) redisService.get("spring-practice:" + phoneNum);
        }
        String verifyCode = createVerifyCode();
        redisService.set("spring-practice:" + phoneNum, verifyCode);
        redisService.expire("spring-practice:" + phoneNum, 60);
        return verifyCode;
    }

    private String createVerifyCode() {
        return String.valueOf(new Random().nextInt(1000000));
    }
}
