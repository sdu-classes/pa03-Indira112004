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
// second methot 
//public class Main {
//    public static void main(String[] args) throws NumberFormatException{
//        Scanner scan  = new Scanner(System.in);
//        try{
//            int a = scan.nextInt();
//            int b = scan.nextInt();
//            Calculator obj1 = new Calculator(a, b);
//            Calculator obj2 = new Calculator(a, b);
//            Calculator obj3 = new Calculator(a, b);
//            Calculator obj4 = new Calculator(a, b);
//            System.out.println(obj1.Add());
//            System.out.println( obj2.Substract());
//            System.out.println( obj3.Multiplication());
//            System.out.println(obj4.Division());
//        }
//        catch(NumberFormatException n){
//            System.out.println("Your input is non-integer");
//        }
//
//    }
//}


