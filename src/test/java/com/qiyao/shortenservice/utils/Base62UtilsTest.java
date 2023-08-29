package com.qiyao.shortenservice.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Base62UtilsTest {
    /**
     * 短链接键值转化为 id
     */
    @Test
    void testShortKeyToId() {
        System.out.println(Base62Utils.shortKeyToId("000001"));
        System.out.println(Base62Utils.shortKeyToId("00fxSJ"));
        System.out.println(Base62Utils.shortKeyToId("Aiq5v2IOhhA"));


    }

    /**
     * id 转化为短链接键值
     */
    @Test
    void testIdToShortKey() {
        System.out.println(Base62Utils.idToShortKey(1));
        System.out.println(Base62Utils.idToShortKey(9999999));
        System.out.println(Base62Utils.idToShortKey(9000000000000000000L));
    }
}