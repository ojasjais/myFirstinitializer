public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Printing Primitive Datatype");

       int num1 = 3;
       System.out.println("Integer: "+ num1);

        float num2  = 1.2f;
        String name ="ojasvi";
        char c='J';
        double d2=5.7;
        boolean b=true;

        System.out.println("Float: "+num2);
        System.out.println("Character: "+c);
        System.out.println("Double: "+d2);
        System.out.println("String: "+name);

        //TypeCasting
       int k= 10;
       double d=k;
        System.out.println("Widening: "+d);

        double d1=10.99;
        int num=(int)d1;
        System.out.println("Narrowing "+num);

        float f1=10.00f;
        float f2=10.00f;
        int result=(int)f1*(int)f2;
        System.out.println("Result: "+result);


        //operations : Arithmetic ,relational , logical
        int x=10,y=5;
        if(x>=y){
            System.out.println("Print x: "+ x);
        }
        else{
            System.out.println("Print y: " + y);
        }

        if(x<10 && y>=20 )
        {
            System.out.println("hello");
        }
        else{
            System.out.println("Bye");
        }


        //comparison btw threee we use else if
        int p=45,q=67,r=98;
        if(p> q && p>r)
            System.out.println(p);
        else if(q>r && q>r)
            System.out.println(q);
        else
            System.out.println(r);


        //check if even odd using TERNARY OPERATOR
        int m =9;
        int resultEvenOdd=0;
        resultEvenOdd = m % 2 == 0 ? 10 : 20;
        System.out.println(resultEvenOdd);


        //Switch case Statement
        int n=8;
//        if(n==1)
//            System.out.println("Monday");
//        else if(n==2)
//            System.out.println("Tuesday");
//        else if(n==3)
//            System.out.println("Wednesday");
//        else if(n==4)
//            System.out.println("Thursday");
//        else if(n==5)
//            System.out.println("Friday");
//        else if(n==6)
//            System.out.println("Saturday");
//        else if(n==7)
//            System.out.println("Sunday");


        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("Invalid value");

         }
    }
}
