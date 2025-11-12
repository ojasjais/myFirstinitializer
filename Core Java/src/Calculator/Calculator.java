package Calculator;

public class Calculator {
    public static void main(String[] args) {


                double num1 = 7;
                double num2 = 3;
                char operator = '+';
                String again = "y";

                // TODO: Run the loop while 'again' equals 'y'
                while(again.equals("y")){
                    double result =0;


                    // TODO: Use predefined numbers num1 = 7 and num2 = 3

                    // TODO: Use predefined operator '+'

                    if(operator=='+')
                        result=num1+num2;
                    else if(operator=='-')
                        result=num1-num2;
                    else if(operator=='*')
                        result=num1*num2;
                    else if(operator=='/')
                    {
                        if(num2==0)
                            System.out.println("Cannot divide by zero.");
                        else
                            result=num1/num2;
                    }
                    else
                        System.out.println("Invalid operator");

                    // TODO: Perform the calculation based on the operator using if-else conditions

                    // TODO: Check if num2 is zero before performing division and display a warning if true
                    if (!(operator == '/' && num2 == 0) && (operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                        System.out.println("Result: " + result);
                    }

                    // TODO: Set 'again' to 'n' to stop the loop after one execution

                    again="n";

                }
                System.out.println("Thank you for using the calculator.");

                // TODO: Display a thank you message after the loop ends

    }
}
