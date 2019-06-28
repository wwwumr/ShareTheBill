package moe.cnkirito.security.oauth2.code.endpoint;

import lombok.*;

import java.util.List;

/**
 * @author 徐靖峰[OF2938]
 * company qianmi.com
 * Date 2018-04-25
 */
@Data
@EqualsAndHashCode(of = "qq")
@ToString(exclude = "fans")
@Builder(toBuilder = true)
public class QQAccount {
    QQAccount(String qq1,String nickname1,String level1){
        qq = qq1;
        nickName = nickname1;
        level = level1;
    }
    private String qq;
    private String nickName;
    private String level;

}
