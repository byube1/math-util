/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import huy.util.MathUninity;

/**
 *
 * @author ADMIN
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Kỹ thuật test:  Nhìn bằng mắt
            long expected = 120;
            long actual = MathUninity.getFactorial(5);
            
            System.out.println("5! = ex= " + expected +": ac=" +actual);
            
            System.out.println(expected==actual?true:false); 
//            
            MathUninity.getFactorial(-5);
            
//            Nhược điểm:  cần phải dùng mắt để sao sánh từng trường hợp xài xàm

//    NÂNG CAO: gom lại vài chạy 1 lượt, máy test giùm
//                   ---> NẾU tất cả case đúng: Màu xanh
//                   ---> NGƯỢC: Màu đỏ
//                   ==> 1 sai, sai hết
//   * Thay vì nhìn từng case, chỉ cần nhìn màu
//   Dùng thư viện: So sánh ACTUAL và EXPECTED 
//                        TRUE = xanh, FALSE = đỏ ==> chỉ cần nhìn màu
//    THƯ VIỆN: .JAR, .DLL đc thêm vào Project
//    UNIT TEST: Tên thư viện chung cho mọi ngôn ngữ
//    Java: JUnit, TestNG | C#: NUnit | PHP : PHPUnit
                    
    }
    
}
