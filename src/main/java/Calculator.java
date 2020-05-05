public class Calculator {
    public static void main(String[] args){
        System.out.println("1 + 2 = " + add(1,2));
        System.out.println("1 - 2 = " + subtract(1,2));
        System.out.println("1 * 2 = " + multiply(1,2));
        System.out.println("1 / 2 = " + divide(1,2));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static double divide(int a, int b){
        double result;
        if(b==0){
            throw new IllegalArgumentException("Divide by zero");
        }else{
            result = Double.valueOf(a)/Double.valueOf(b);
        }
        return result;
    }
}
