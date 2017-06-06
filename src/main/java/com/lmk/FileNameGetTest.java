package com.lmk;

import org.junit.Test;

/**
 * @author YaoZhidong
 * @version 1.0
 * @created 2017/5/14
 */
public class FileNameGetTest {
    private String fileName = "lmk.csv.xslx";


    @Test
    public void testFileNameGet(){

        int index = fileName.lastIndexOf(".");
        System.out.println(fileName.substring(0,index));
        System.out.println(fileName.substring(index+1));
    }
}
