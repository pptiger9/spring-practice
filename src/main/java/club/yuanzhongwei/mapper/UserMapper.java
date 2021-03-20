package club.yuanzhongwei.mapper;

import club.yuanzhongwei.dto.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/20 14:15
 * @Version 1.0
 * @Description
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
