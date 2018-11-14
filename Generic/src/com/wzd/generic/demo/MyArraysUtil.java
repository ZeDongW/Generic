/**  
* @Title: MyArraysUtil.java  
* @Package com.wzd.generic.demo  
* @Description: TODO(用一句话描述该文件做什么)  
* @author wangzedong  
* @date 2018年11月15日上午7:07:08  
* @version V1.0  
*/    
package com.wzd.generic.demo;  
  
/**  
* @ClassName: MyArraysUtil  
* @Description: 自定义数组工具类  
* @author wangzedong  
* @date 2018年11月15日上午7:07:08  
*    
*/
public class MyArraysUtil {
    
    /**
     * 
    * @Title: myReverse  
    * @Description: 数组反转方法，可以反转任意类型的数组。 
    * @param @param arr    参数  
    * @return void    返回类型  
    * @throws
     */
    public <T>void myReverse(T[] arr) {
        for(int startIndex = 0, endIndex = (arr.length - 1); startIndex < endIndex; startIndex++, endIndex--) {
            T temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
    }
    
    /**
     * 
    * @Title: toString  
    * @Description: 打印数组
    * @param @param arr
    * @param @return    参数  
    * @return String    返回类型  
    * @throws
     */
    public <T>String toString(T[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(i == 0) {
                sb.append("[" + arr[i] + ", ");
            } else if (i == (arr.length - 1)) {
                sb.append(arr[i] + "]");
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        return sb.toString();
    }

}
