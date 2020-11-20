/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy.util.test;

import static huy.util.MathUninity.*;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

//import static, mọi hàm static trong class thì khi gọi không cần tên class vì đã chấm

/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
//    Class này là class xài thư viện JUnit dùng để test code
//    Màu xanh đỏ, thay vì nhìn bằng mắt
//    2file .jar đã đc add vào, dùng thoải mái
//    Có n hàm đặc biệt trong thư viện điều có tên (assertX)-(expected và actual đưa vào)
//    Nếu expected != actual --> đỏ
//     Nếu expected = actual --> xanh
//    Đảm bảo hàm chạy đúng mọi case
    
    @Test   // biến hàm thành public static void main, muốn chạy ấn SHIFT -F6
//    Quy tắc đặt tên của nghê Tester,QC (con rắn)
   public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120,getFactorial(5));
        assertEquals(720, getFactorial(6));
   }
   
   @Test(expected = IllegalArgumentException.class)
   public void getFactorial_ThrowException_IfInvalidArgument() {
//       Ngoại lệ không phải value không thể assert, chỉ có thể bắt
        getFactorial(-5);       
   }
       
    
}
