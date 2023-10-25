package lccfcode.data_structure.stacks;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class calculate_expr1 {
    /*
    * 题意：输入一个字符串，求其值，字符串仅包括数字，'+','-','*','/'和小数点'.'
    *      第一个数字前可能包含正负号，最后结果若为小数需四舍五入为整数。
    */
    private static Stack<Double> num = new Stack<>();
    private static Stack<Character> op = new Stack<>();

    public static void eval(){
        // System.out.println(op.toString() + ", " + num.toString());
        char c = op.peek();
        op.pop();
        double b = num.peek();
        num.pop();
        double a = num.peek();
        num.pop();
        if(c == '+')
            num.push(a + b);
        else if (c == '-')
            num.push(a - b);
        else if(c == '*')
            num.push(a * b);
        else
            num.push(a / b);
    }
    public static int exprCal(String expr){
        if(expr.charAt(0) != '+' && expr.charAt(0) != '-')
            expr = "0+" + expr;
        else
            expr = "0" + expr;

        HashMap<Character, Integer> pri = new HashMap<>();
        pri.put('+', 1);
        pri.put('-', 1);
        pri.put('*', 2);
        pri.put('/', 2);

        for(int i = 0; i < expr.length(); i++){
            char c = expr.charAt(i);
            if(Character.isDigit(c)){
                String temp = "";
                int j = i;
                while(j < expr.length() && (Character.isDigit(expr.charAt(j)) || expr.charAt(j) == '.')){
                    temp += expr.charAt(j);
                    j++;
                }
                // System.out.println("temp: " + temp);
                num.push(Double.parseDouble(temp));
                i = j - 1;
            }else if("+-*/".contains(String.valueOf(c))){
                while(!op.isEmpty() && pri.getOrDefault(c, 0) < pri.getOrDefault(op.peek(), 0)){
                    eval();
                }
                op.push(c);
            }
        }
        while(!op.isEmpty())
            eval();
        // System.out.println(Math.round(num.peek()));

        return (int) Math.round(num.peek());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        System.out.println(exprCal(in));
    }
}
