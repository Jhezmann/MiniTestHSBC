package cn.jhezmann;

import cn.jhezmann.config.MainJavaConfig;
import cn.jhezmann.core.MiniTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class RunTest {

    private AnnotationConfigApplicationContext ioc;

    @Before
    public void before() {
        ioc = new AnnotationConfigApplicationContext(MainJavaConfig.class);
    }

    @Test
    public void printLetterCombination(){

        Scanner input=new Scanner(System.in);
        String str = input.next();
        String[] strArr = str.split("");
        int index = 0;
        int[] nl = new int[index];
        for (int i = 0; i < strArr.length; i++) {
            try{
                int x = Integer.parseInt(strArr[i]);
                nl[index++] = x;
            }catch (Exception e){

            }
        }
        MiniTest mt = new MiniTest();
        System.out.println(mt.test(nl));

    }

    public static void main(String[] args){
        RunTest rt = new RunTest();
        rt.printLetterCombination();
    }


}
