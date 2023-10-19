public class FizzBuzz
{
    public static void main(String[] args)
    {//int does not allow to print or do math in decimals
        for (int i=1; i <= 100; i++) {// starts at one and for loop will be executed until reaches 100
            if (i / 15 * 15 == i) {// Is gonna start with 1, and check all if statements - takes priority that is why it goes first because it is devisible by 3 and 5. You dont want fizz and buzz you want FizzBuzz together
               System.out.println ("FizzBuzz"); // i =1 1 1/15 = 0 because integers
            } else if (i / 5 * 5 == i) {//When devide 1/5 is not gonna be 0.2, 1/5 is gonna gie you the whole number of 0
                System.out.println ("Buzz");
          } else if (i / 3 * 3 == i) {//gonna be 0 because they count in whole numbers so 0
               System.out.println ("Fizz");
            } else {
                System.out.println (i);
            }
        }
    }
}    