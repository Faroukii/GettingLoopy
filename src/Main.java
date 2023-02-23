import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for(int cnt = 0; cnt <=30; cnt++)
        //counting up from 0 to 30 by 1
        {
            System.out.println(cnt);
        }
        {
            for(int cnt = 30; cnt >=0; cnt--)
            //counting down from 30 to 0 by 1
            {
                System.out.println(cnt);
            }
            {
                for(int cnt = 0; cnt <=18; cnt = cnt + 3)
                //counting up from 0 to 18 by 3
                {
                    System.out.println(cnt);
                }
                {
                    for(int cnt = 10; cnt >=0; cnt = cnt -2)
                    //counting down from 10 to 0 by 2
                    {
                        System.out.println(cnt);
                    }
                    {
                        for (int row = 1; row <= 5; row++)
                        //Nested looping of * in ascending order
                        {
                            for (int col = 1; col <= row; col++) System.out.print("*");
                            System.out.println();
                        }
                        for (int row = 5; row >=1; row--)
                        //Nested looping of * in descending order
                        {
                            for (int col = 1; col <= row; col++) System.out.print("*");
                            System.out.println();
                        }
                        {
                            for (int row = 1; row <= 5; row++)
                            //Nested looping of * in a 5x5 square
                            {
                                for (int col = 1; col <= 5; col++) System.out.print("*");
                                System.out.println();
                            }
                            {
                                        Scanner scanner = new Scanner(System.in);
                                        double celsius, fahrenheit;
                                        while (true) {
                                            try {
                                                System.out.println("Enter celsius temperature: ");
                                                //System asks user to enter a celsius amount
                                                celsius = Double.parseDouble(scanner.next());
                                                break;
                                            } catch (NumberFormatException e) {
                                                System.out.println("Error: invalid number");
                                                //When an invalid value is inputted
                                            }
                                        }
                                        fahrenheit = celsius*1.8 + 32;
                                        System.out.printf("%.2f C = %.2f F\n",celsius,fahrenheit);
                                        //formula to convert Celsius to Fahrenheit
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


