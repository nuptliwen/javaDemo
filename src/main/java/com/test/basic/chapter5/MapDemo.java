package com.test.basic.chapter5;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by beigui on 2016/2/15.
 * 功能：简单介绍HashMap的使用
 * 向一个Map集合中插入元素并根据key的值打印集合中的元素
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "apple");
        map.put("2", "pear");
        map.put("3", "orange");
        for (int i = 1; i < map.size() + 1; i++) {
            System.out.println("第" + i + "个元素是：" + map.get(i + ""));
        }

        for (String item : map.keySet()) {
            System.out.println("key=" + item + ", value=" + map.get(item));
        }
    }
}
