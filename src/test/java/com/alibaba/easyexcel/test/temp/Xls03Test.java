package com.alibaba.easyexcel.test.temp;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.fastjson.JSON;

/**
 * 临时测试
 *
 * @author Jiaju Zhuang
 **/
@Ignore
public class Xls03Test {
    private static final Logger LOGGER = LoggerFactory.getLogger(Xls03Test.class);

    @Test
    public void test() {
        List<Object> list = EasyExcelFactory.read("D:\\test\\1.xls").sheet().doReadSync();
        for (Object data : list) {
            LOGGER.info("返回数据：{}", JSON.toJSONString(data));
        }
    }
}