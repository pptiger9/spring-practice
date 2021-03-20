package club.yuanzhongwei.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/18 00:25
 * @Version 1.0
 * @Description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@TableName("user")
public class User implements Serializable {
    @TableId
    Integer id;
    @TableField("username")
    String username;
    @TableField("password")
    String password;
}
