package Test;


import com.alibaba.fastjson.JSONObject;

import java.util.GregorianCalendar;

public class Domain {

    public static void main(String[] args) {

        String jsonStr = "{\"name\":\"三班\",\"students\":[{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"露西\",\"score\":{\"网络协议\":98,\"JavaEE\":92,\"计算机基础\":93},\"weight\":51.3},{\"age\":26,\"gender\":\"male\",\"grades\":\"三班\",\"name\":\"杰克\",\"score\":{\"网络安全\":75,\"Linux操作系统\":81,\"计算机基础\":92},\"weight\":66.5},{\"age\":25,\"gender\":\"female\",\"grades\":\"三班\",\"name\":\"莉莉\",\"score\":{\"网络安全\":95,\"Linux操作系统\":98,\"SQL数据库\":88,\"数据结构\":89},\"weight\":55}]}";

        JSONObject jsonObject = JSONObject.parseObject(jsonStr);

        Grades grades = (Grades) JSONObject.toJavaObject(jsonObject, Grades.class);
        System.out.println(jsonStr);
    }
}