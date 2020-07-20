/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;
import static khanghv.util.MathUtil.computeFactorial;
/**
 *
 * @author USER
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hi vọng hàm trả dìa 120 nếu tính 5!
        
        System.out.println("5! = " + computeFactorial(5));
        
        //hi vọng hàm trả về 1 nếu tính 1 !
        System.out.println("1! = " + computeFactorial(1));
        
        //hi vọng hàm trả về 1 nếu tính  0!
        System.out.println("0! = " + computeFactorial(0));
        
        //expected Exception nếu -5!
//        System.out.println("-5! = " + computeFactorial(-5));
        
        System.out.println("16! = " + computeFactorial(16));
    }
    
}
