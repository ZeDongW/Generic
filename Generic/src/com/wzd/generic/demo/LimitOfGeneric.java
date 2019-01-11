/**  
* @Title: LimitOfGeneric.java  
* @Package com.wzd.generic.demo  
* @Description: 泛型的上下限 
* @author Administrator  
* @date 2019年1月12日上午2:42:42  
* @version V1.0  
*/    
package com.wzd.generic.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**  
* @ClassName: LimitOfGeneric  
* @Description: 泛型的上下限
* 需求：定义一个函数可以接收任意类型的集合对象，要求接收的集合对象只能存储Integer或者是Interger的父类类型数据。
* 泛型中的通配符： ？
* super 表示父类
* extends 表示子类 
* @author Administrator  
* @date 2019年1月12日上午2:42:42  
*    
*/

public class LimitOfGeneric {

    /**  
    * @Title: main  
    * @Description: 泛型的上下限 
    * @param @param args    参数  
    * @return void    返回类型  
    * @throws  
    */
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Number> list2 = new ArrayList<Number>();
        
        HashSet<Object> set = new HashSet<Object>();
        
        print(list1);
        print(list2);
//        print(set);
    }

    /**  
    * @Title: print  
    * @Description: TODO(这里用一句话描述这个方法的作用)  
    * @param @param list1    参数  
    * @return void    返回类型  
    * @throws  
    */  
    private static void print(Collection<? extends Number> c) {
        
    }

}
