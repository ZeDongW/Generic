/**  
* @Title: MethodGeneric.java  
* @Package com.wzd.generic.demo  
* @Description: 在方法上定义泛型 
* @author wangzedong  
* @date 2018年11月15日上午6:43:14  
* @version V1.0  
*/    
package com.wzd.generic.demo;  
  
/**  
* @ClassName: MethodGeneric  
* @Description: 在方法上定义泛型
* @author wangzedong  
* @date 2018年11月15日上午6:43:14  
*    
*/
public class MethodGeneric {

    public static void main(String[] args) {
        String str = getGeneric("asdgf");
        Integer a = getGeneric(123);
        Double double1 = getGeneric(12.43);
        Boolean generic = getGeneric(true);
    }
    
    public static <T>T getGeneric(T t){
        return t;
    }

}
