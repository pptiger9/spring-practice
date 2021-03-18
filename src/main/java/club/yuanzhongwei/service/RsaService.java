package club.yuanzhongwei.service;

import java.util.Map;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/18 18:32
 * @Version 1.0
 * @Description
 */
public interface RsaService {
    public Map<String, String> createKeys(int keySize);
}
