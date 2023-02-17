/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.test.core;


import com.giaolang.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author giao.lang
 */
public class MathUtilityTest {
    
    //Hàm getF() còn đc thiết kế rằng: nếu đưa n cà chớn
    //tham số ko đúng chuẩn, n < 0 | n > 20 thì
    //HÀM ĐC THIẾT KẾ LÀ NÉM RA NGOẠI LỆ
    //TỨC LÀ: NẾU ĐƯA N < 0, VÍ DỤ N = -5 THÌ SẼ NHẬN
    //VỀ - EXPECTED LÀ EXCEPTION
    //TA SẼ DÙNG JUNIT ĐỂ TEST XEM HÀM CÓ NÉM RA NGOẠI LỆ
    //NHƯ THIẾT KẾ HAY KO
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        //nguyên tắc kiểm thử: so sánh giữa expected vs. actual
        //Test case #4: test getF() with n < 0
        //Expected: an Exception is thrown. In this case
        //          Illegal Argument Exception is thrown
        //JUnit 4 ko có hàm assert() Exception
        //JUnit 5 thì có!!!
        MathUtility.getFactorial(-5);
        //Nếu chỉ viết lệnh này đứng 1 mình thì
        //có nghĩa là ta chưa bắt, ta chưa đo lường, ta chưa so 
        //sánh liệu rằng có ngoại lệ như kì vọng hay ko
        //xanh đỏ trong tình huống này ko phản ánh ý nghĩa đúng
        //vậy ta phải bắt/đo xem ngoại lệ đã có chưa
        //nếu có thì XANH
        //nếu chưa có thì ĐỎ
    }
    
    
    @Test  //biến hàm ở dưới này thành public static void main()
    //hình thức của framework, dàn khung viết code
    //viết code phải theo định dạng yêu cầu trước
    public void testRedGreenSignal() {
        Assert.assertEquals(6789, 6789);
    }
        
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1: test getF() with n = 0;
        //expected: 1
        //test hàm getF() với n = 0, hy vọng trả về 1, tức là 0! = 1
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        //Test case #2: test getF() with n = 1;
        //expected: 1
        //test hàm getF() với n = 1, hy vọng trả về 1, tức là 1! = 1
        Assert.assertEquals(1, MathUtility.getFactorial(1));
    
        //Test case #3: test getF() with n = 6
        //expecte: 720, hy vọng 6! = 720
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
        Assert.assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //VIẾT KIỂU ASSERTEQUALS(EXPECTED, ACTUAL) 
    //LẶP ĐI LẶP LẠI -> CODE BỐC MÙI BAD SMELL
    //NHƯỢC ĐIỂM ĐOẠN CODE TRÊN:
    //Trộn lẫn giữa lệnh so sánh và các data dùng để test
    //Vì trộn lẫn nên ta khó nhìn hết đầy đủ các test case
    //nguyên lí nghịch lí thuốc trừ sâu có khả năng xuất hiện
    //TA SẼ FIX CODE BỐC MÙI LẶP LẠI BẰNG 1 KĨ THUẬT MỚI
    //DDT - DATA DRIVEN TESTING
}
