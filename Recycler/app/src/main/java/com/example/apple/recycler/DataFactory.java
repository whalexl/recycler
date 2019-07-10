package com.example.apple.recycler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Apple on 2019/7/9.
 */

public class DataFactory {
    public static  final  String[]NUMBERS={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
    public static final String[] DATAS = {
            " 郑爽回应收视暴跌",
            "教育部谈家长作业",
            "安踏市值蒸发百亿",
            "一年借阅926本新",
            "埃尔克森回归恒大新",
            "良渚古城遗址开园",
            "大狗咬伤日籍女子",
            "武汉酒店大楼坍塌",
            "人类环境易致肥胖",
            "七七事变82周年",
            "滴滴上调价格新",
            "英驻美大使备忘录",
            "非洲准宇航员丧生",
            "深圳体育中心坍塌",
            "中国女排无缘决赛"
    };
    public static  final  String[]COUNT={"908万","667万","644万","599万","497万","462万","404万","387万","371万","363万","344万","333万","323万","321万","308万"};
    public static final int default_size=15;
     public static List<Data> getData(int size) {
               if (size > 15) {
                        size = 15;
                    }
                List<Data> list = new ArrayList<>();
                 for (int i = 0; i < size; ++ i) {
                         Data data = new Data(NUMBERS[i],DATAS[i],COUNT[i]);
                         list.add(data);
                     }
                 return list;
             }

}
