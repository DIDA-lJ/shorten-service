package com.qiyao.shortenservice.utils;

/**
 * @ClassName Base62Utils
 * @Description Base62 算法实现工具类
 * @Version 1.0.0
 * @Date 2023/08/29
 * @Author LinQi
 */
public class Base62Utils {
    /**
     *  Base62 字符串 A-Z a-z 0-9
     */
    private static final String BASE62 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private Base62Utils() {}

    /**
     * Base 62 算法 id 转为短链接 key 实现
     * @param id 长链接 id
     * @return  长链接对应的短链接键值
     */
    public static String idToShortKey(long id){
        StringBuilder stringBuilder = new StringBuilder();

        // 当 id 大于 0 的时候，一致执行stringBuilder 添加操作，不断添加字符串
        while (id > 0){
            stringBuilder.append(BASE62.charAt((int)(id % 62)));
            id = id / 62;
        }

        while(stringBuilder.length() < 6){
            stringBuilder.append(0);
        }

        return stringBuilder.reverse().toString();
    }

    /**
     * Base 62 算法 id 短链接键值 转化为 ID
     * @param shortKey
     * @return
     */
    public static long shortKeyToId(String shortKey){
        long id = 0;

        for(int i = 0;i < shortKey.length() ;i++){
            id = id * 62 + BASE62.indexOf(shortKey.charAt(i));
        }

        return  id;
    }
}
