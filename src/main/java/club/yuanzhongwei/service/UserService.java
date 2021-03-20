package club.yuanzhongwei.service;

import club.yuanzhongwei.dto.User;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/18 14:17
 * @Version 1.0
 * @Description
 */
public interface UserService {
    User getUserByUserName(String username);
}
