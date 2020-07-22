/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanghv.util;

/**
 *
 * @author USER
 */
//đây là class chứa các hàm toán học tính toán với mục tiêu để xài chung cho các nơi khác, phàm cái gì mang tính chất xài chung, ta sẽ dùng static
public class MathUtil {
    //tính n gia thừa: 1*  2 * 3 * 4 .... --> tràn miền Integer (2tỷ 1)---> xài long ---> xài từ 15 trở lại

    public static long computeFactorial(int n) {
        if(n < 0 || n > 15)
        {
            throw new IllegalArgumentException("Invalid number, must be above 0 and below 16");
        }
        if (n == 0 || n == 1) {
            return 1; //điều kiện dừng nhen
        }
        //sống sót tới đây thì n trong vùng từ 2 - 15 ---> ko cần else
        return n * computeFactorial(n - 1);
    }

}
