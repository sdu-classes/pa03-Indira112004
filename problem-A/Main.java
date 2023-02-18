public class Main {
   
    public static void main(String[] args) {
        Calculator calc = null;
        try {
             calc = new Calculator(1, -2);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
       
        try{
            calc.add();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            calc.sub();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            calc.mul();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            calc.div();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
