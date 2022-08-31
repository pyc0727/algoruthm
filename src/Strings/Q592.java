package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/30 16:44
 * @Description:
 **/
public class Q592 {
    public String fractionAddition(String expression) {
        if(!expression.startsWith("-")){
            expression = "+" + expression;
        }
        int top = 0;
        for (int i = 0; i < (expression.length()+1)/4; i++) {
            if(expression.charAt(i*4) == '+'){

            }
        }


        return null;
}
}
