/*class scanner
nextInt() -- used to enter the integer values,stores integers (whole numbers), without decimals, such as 123 or -123

nextFloat() --used to enter the float values,stores floating point numbers, with decimals, such as 19.99 or -19.99

nextDouble() --used to enter the large rational values,Stores fractional numbers. Sufficient for storing 15 decimal digits

next() --used to read string of single word

nextLine() --used to read string of many words

nextByte() --Stores whole numbers from -128 to 127

nextShort() --Stores whole numbers from -32,768 to 32,767

nextLong() --Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

nextBoolean() --Stores true or false values

hasNextInt() --used to confirm the data is interger or not it return boolean value(True/False)
hasNextFloat() --used to confirm the data is float or not it return boolean value(True/False)
 */
import java.util.*;
class keyboardRead
{
    public static void main(String arg[])
    {
        Scanner  s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a,b,c:");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);
        System.out.println("The value of c is "+c);


    }
}