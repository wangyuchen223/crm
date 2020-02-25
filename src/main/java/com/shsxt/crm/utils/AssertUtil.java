package com.shsxt.crm.utils;

import com.shsxt.crm.exceptions.ParamsException;

public class AssertUtil {


    public  static void isTrue(Boolean flag,String msg){
        // 接收参数布尔类型参数 flag , 作出对应行为
        if(flag){
            throw  new ParamsException(msg);
        }
    }

}
