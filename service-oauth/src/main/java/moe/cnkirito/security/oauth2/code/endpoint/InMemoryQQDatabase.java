package moe.cnkirito.security.oauth2.code.endpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 徐靖峰[OF2938]
 * company qianmi.com
 * Date 2018-04-25
 */
public class InMemoryQQDatabase {

    public static Map<String, QQAccount> database;

    static {
        database = new HashMap<>();
        QQAccount temp1 = new QQAccount("250577914","鱼非渔","54");
        QQAccount temp2 = new QQAccount("920129126","下一秒升华","31");
        database.put("250577914",temp1 );
        database.put("920129126", temp2);
    }

}
