/**  
* @Title: MyArrayUtilTest.java  
* @Package com.wzd.generic.test  
* @Description: 自定义数组工具类测试类
* @author wangzedong  
* @date 2018年11月15日上午7:20:57  
* @version V1.0  
*/    
package com.wzd.generic.test;

import java.util.Arrays;

import org.junit.Test;

import com.wzd.generic.demo.MyArraysUtil;

/**  
* @ClassName: MyArrayUtilTest  
* @Description:  自定义数组工具类测试类
* @author wangzedong  
* @date 2018年11月15日上午7:20:57  
*    
*/
public class MyArrayUtilTest {
    
    /**
     * 
    * @Title: testMyReverse  
    * @Description: 数组反转，测试方法 
    * @param     参数  
    * @return void    返回类型  
    * @throws
     */
    @Test
    public void testMyReverse() {
        MyArraysUtil util = new MyArraysUtil();
        String[] arr = {"sd","sf","dfg","fertr"};
//        Integer[] arr = {34,65,245,676,321,43,3};
        System.out.println("反转前数组为 :" + util.toString(arr));
        util.myReverse(arr);
        System.out.println("反转后数组为 :" + util.toString(arr));
    }
}
