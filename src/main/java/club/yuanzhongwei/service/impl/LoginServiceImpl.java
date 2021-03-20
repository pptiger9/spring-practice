package club.yuanzhongwei.service.impl;

import club.yuanzhongwei.dto.User;
import club.yuanzhongwei.mapper.UserMapper;
import club.yuanzhongwei.service.LoginService;
import club.yuanzhongwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/20 14:07
 * @Version 1.0
 * @Description
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    UserService userService;

    @Override
    public boolean verifyUser(String userName, String password) {
        User user = userService.getUserByUserName(userName);
        if (user == null){
            return false;
        }else {
            return user.getPassword().equals(password);
        }
    }
}
