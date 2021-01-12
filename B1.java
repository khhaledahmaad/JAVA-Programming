package OSN.ASSESSMENT.PART_B;

        public class B1 {

            public void possibleSum(int sum)
            {
                int counter = 0, possible_combination = 0;

                for(int k = 1; k <= 10; k++)
                {

                    for(int m=k+1; m<= 10; m++)
                    {
                        //if( k != m && k < m)
                        //{
                        counter++;
                        if( (k+m) == sum)
                        {
                            System.out.println("Sum Counter:" +counter+" "+ "k=" +k+" "+ "m=" +m+" "+"Sum:" +(k+m));
                            possible_combination++;
                        }
                    }

                }

                System.out.println(counter+" combinations are possible for the sum of the numbers between 1 to 10, where "+possible_combination+" have the desired same sum "+ "(" +sum+ ")" + ".");
            }

            public static void main(String s[])
            {

                B1 b = new B1();

                b.possibleSum(10);
            }
        }
