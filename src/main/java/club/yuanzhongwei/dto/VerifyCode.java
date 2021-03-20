package club.yuanzhongwei.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/20 13:35
 * @Version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VerifyCode {
    int id;
    int code;
}
