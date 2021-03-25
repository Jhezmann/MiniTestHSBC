package cn.jhezmann.core;

import org.springframework.stereotype.Component;

@Component
public class MiniTest {
    //using index to cover income digits
    private String[] LETTERS = {"","","abc","def","ghi","jkl","mmo","pqrs","tuv","wxyz"};

    private int length = 0;
    private String[] strArray;

    public String test(int[] digits){

        length = digits.length;
        strArray = new String[length];

        //Build up strArray
        for (int i = 0; i < length; i++) {
            String letters = LETTERS[digits[i]];
            strArray[i] = letters;
        }

        return conbinator("",0);

    }

    public void changeLETTERS(){
        for (int i = 0; i < LETTERS.length; i++) {
            LETTERS[i] = i + LETTERS[i];
        }
    }

    private String conbinator(String s, int index) {
        int count = 0;
        String[] arrStr;
        String str = strArray[index];

        //Split original arr and combiner;
        String[] arr1= s.split(" ");
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
                s += " ";
            }
            s += arrStr[j];
        }
        if(index+1==length){
            return s;
        }else{
            return conbinator(s,index+1);
        }
    }
}
