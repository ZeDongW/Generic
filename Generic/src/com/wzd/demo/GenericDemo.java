/**  
* @Title: GenericDemo.java  
* @Package com.wzd.demo  
* @Description: Java泛型演示 
* @author wangzedong  
* @date 2018年11月14日上午7:38:40  
* @version V1.0  
*/    
package com.wzd.demo;

import java.util.ArrayList;

/**  
* @ClassName: GenericDemo  
* @Description: Java泛型演示  
* @author wangzedong  
* @date 2018年11月14日上午7:38:40  
*    
*/
public class GenericDemo {
    /**  
    * @Title: main  
    * @Description: TODO(这里用一句话描述这个方法的作用)  
    * @param @param args    参数  
    * @return void    返回类型  
    * @throws  
    */  
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("adv");
        list.add("dgf");
        list.add("sdf");
        list.add("ert");
        //list.add(345);  //报错，泛型规定只能添加String类型
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toUpperCase());
        }
    }
}
