// example to explain while for , if, else, switch, continue, break

// 1.continue with for loop & if else statement
import java.util.*;
 
class ContinueDemo {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;
 
            // If number is odd, print it
            System.out.print(i + " ");
        }
    }
}


class BreakDemo{
    public static void main(String args[])
    {
        int i=0;
        int x=6;
        int count=0;
        while (i < 10) {
            count++;
            if (i  == x) //will break if condn satisfied
                break;
        }
        // Print value of count
        System.out.print("count "+count);
    }
}

// switch case

switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  .
  .
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}
