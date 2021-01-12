package OSN.ASSESSMENT.PART_B;

public class B2 {
    public void possibleSixNumberSum(int sum)
    {
        long counter = 0, possible_combination=0;
        for(int a = 1; a <= 50; a++)
        {
            for(int b=a+1; b<= 50; b++)
            {
                for(int c=b+1; c<= 50; c++)
                {
                    for(int d=c+1; d<= 50; d++)
                    {
                        for(int e=d+1; e<= 50; e++)
                        {
                            for(int f=e+1; f<= 50; f++)
                            {
                                counter++;
                                if( (a+b+c+d+e+f) == sum)
                                {

                                    System.out.println("Sum Counter:" +counter+" "+ "a=" +a+" "+ "b=" +b
                                            +" "+ "c=" +c+" "+ "d=" +d+" "+ "e=" +e+" "+ "f=" +f+" "+ "Sum:" +(a+b+c+d+e+f));
                                    possible_combination++;


                                }

                            }
                        }
                    }
                }


            }

        }
        System.out.println(counter+" combinations are possible for the sum of the numbers between 1 to 50, where "+possible_combination+" have the desired same sum "+ "(" +sum+ ")" + ".");
    }

    public static void main(String s[])
    {
        B2 b = new B2();
        b.possibleSixNumberSum(150);
    }
}
