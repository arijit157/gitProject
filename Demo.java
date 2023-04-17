public class Demo {
    int num1;
    int num2;

    public Demo(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    public Demo(int num){
        this(num, num);   //invokes the two-argument constructor
    }

    public static void main(String args[]){
        Demo d1=new Demo(10, 20);
        Demo d2=new Demo(10);
        System.out.println(d1.num1+" "+d1.num2);
        System.out.println(d2.num1+" "+d2.num2);
    }
}
