package club.yuanzhongwei.service;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/20 14:07
 * @Version 1.0
 * @Description
 */
public interface LoginService {
    boolean verifyUser(String userName, String password);
}
