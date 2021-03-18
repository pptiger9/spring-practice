package club.yuanzhongwei.dto;

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
public class User implements Serializable {
    String username;
    String password;
}
