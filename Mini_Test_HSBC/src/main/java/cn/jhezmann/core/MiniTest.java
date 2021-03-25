package cn.jhezmann.core;

import org.springframework.stereotype.Component;

@Component
public class MiniTest {
    private final String[] LETTERS = {"","","abc","def","ghi","jkl","mmo","pqrs","tuv","wxyz"};

    private int length = -1;

    private String[] strArray;

    public String test(int[] digits){

        /*for (int i = 0; i < digits.length; i++) {
            if(digits[i]==0||digits[i]==1){

            }
        }*/

        length = digits.length;

        strArray = new String[length];

        for (int i = 0; i < length; i++) {
            String letters = LETTERS[digits[i]];
            strArray[i] = letters;
        }

        return conbinator("",0);


    }
    
    private String conbinator(String s, int index) {
        int count = 0;
        String[] arrStr;
        for (int i = index; i < length; i++) {
            String str = strArray[i];
            String[] arr1= s.split(",");
            String[] arr2= str.split("");
            arrStr = new String[arr1.length*arr2.length];
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    arrStr[count] = arr1[j]+arr2[k];
                    count++;
                }
            }
            s = "";
            for (int j = 0; j < arrStr.length; j++) {
                if(!s.equals("")){
                    s += ",";
                }
                s += arrStr[j];
            }
            if(i+1==length){
                return s;
            }else{
                return conbinator(s,i+1);
            }
        }
        return "";
    }
}
