package club.yuanzhongwei.service.impl;

import club.yuanzhongwei.dto.User;
import club.yuanzhongwei.mapper.UserMapper;
import club.yuanzhongwei.service.UserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/18 14:18
 * @Version 1.0
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByUserName(String username) {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.<User>lambdaQuery().eq(User::getUsername, username);
        return userMapper.selectOne(queryWrapper);
    }
}
