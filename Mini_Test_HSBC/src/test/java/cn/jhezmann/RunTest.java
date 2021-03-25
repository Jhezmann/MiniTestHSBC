package cn.jhezmann;

import cn.jhezmann.config.MainJavaConfig;
import cn.jhezmann.core.MiniTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Scanner;

public class RunTest {

    private AnnotationConfigApplicationContext ioc;

    @Before
    public void before() {
        ioc = new AnnotationConfigApplicationContext(MainJavaConfig.class);
    }

    /**
     * Test 01
     * Get input digits and output letter combination
     */
    @Test
    public void letterCombination(){

        MiniTest mt = new MiniTest();
        System.out.println(mt.test(getDigitArray()));

    }

    /**
     * Test 02
     * Get input digits and output letter combination converting number;
     */
    @Test
    public void letterConvertNumber(){

        MiniTest mt = new MiniTest();
        mt.changeLETTERS();
        System.out.println(mt.test(getDigitArray()));
    }

    /**
     * Use scaner to get input digits
     * @return return digit array
     */
    private int[] getDigitArray(){
        Scanner input=new Scanner(System.in);
        String str = input.next();
        String[] strArr = str.split("");
        int[] digitArr = new int[0];
        for (int i = 0; i < strArr.length; i++) {
            try{
                int x = Integer.parseInt(strArr[i]);
                digitArr= Arrays.copyOf(digitArr, digitArr.length+1);
                digitArr[digitArr.length-1] = x;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return digitArr;
    }

    /**
     * main function for IDEA user who cannot input in the console during the test.
     * @param args
     */
    public static void main(String[] args){
        RunTest rt = new RunTest();
        rt.letterCombination();
        rt.letterConvertNumber();
    }

}
