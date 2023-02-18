public class Calculator {
    private int a;
    private int b;

//    public Calculator(int a, int b){
//        this.a = a;
//        this.b = b;
//    }
    public Calculator(Object a, Object b){
        if(!(a instanceof Integer)){
            throw new NumberFormatException("non-integer value provided" + a.toString());
        }
        if(!(b instanceof Integer)){
            throw new NumberFormatException("non-integer value provided" + b.toString());
        }
        this.a = (Integer) a;
        this.b = (Integer) b;
    }
    public void add(){
        if(this.a < 0 || this.b <0){
            throw new ArithmeticException(String.format("One of the number is negative: %d %d", this.a, this.b));
        }
        System.out.println(this.a+this.b);
    }
    public void sub(){
        if(this.a < 0 || this.b <0){
            throw new ArithmeticException(String.format("One of the number is negative: %d %d", this.a, this.b));
        }
        System.out.println(this.a - this.b);
    }
    public void mul(){
        if(this.a == 0 || this.b == 0){
            throw new ArithmeticException(String.format("One of the number is zero: %d %d", this.a, this.b));
        }
        System.out.println(this.a * this.b);
    }
    public void div(){
        if(this.a == 0 || this.b == 0){
            throw new ArithmeticException(String.format("One of the number is zero: %d %d", this.a, this.b));
        }
        System.out.println(this.a / this.b);
    }

}
//second methot
//public class Calculator {
//    private int a;
//    private int b;
//    public Calculator(int a, int b){
//        this.a = a;
//        this.b = b;
//    }
//    public int Add()throws ArithmeticException{
//        if(this.a <0 || this.b <0 ){
//            throw new ArithmeticException("One of the numbers is negative");
//        }
//        return a +b;
//    }
//    public int Substract() throws ArithmeticException{
//        if(this.a < 0 || this.b < 0 ){
//            throw new ArithmeticException("One of the numbers is negative");
//        }
//        return a - b ;
//    }
//    public int Multiplication() throws ArithmeticException{
//        if(this.a == 0 || this.b==0){
//            throw new ArithmeticException("One of the numbers equal zero");
//        }
//        return a * b;
//    }
//    public int Division() throws ArithmeticException{
//        if(this.a ==0 || this.b == 0){
//            throw new  ArithmeticException("One of the numbers equal zero");
//        }
//        return a/b;
//    }
//}
