package cn.felord.kono.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author a
 * @since 12:26
 **/
@Data
public class UserInfoVO extends UserInfo {
    private static final long serialVersionUID = 6355694289388175815L;
    private LocalDateTime addTime;

}
