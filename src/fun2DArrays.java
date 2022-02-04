import java.awt.*;

public class fun2DArrays
{
    public static void main (String[] args) {
        int r = 0;

        int[][] scores = {{1, 2, 3, 4, 5},
                          {1, 2, 3, 4, 5},
                          {1, 2, 3, 4, 5},
                          {1, 2, 3, 4, 5},
                          {1, 2, 3, 4, 5}};

//        for(int i = scores.length; i <= 26; i++)
//        {
//            if((i == 6 || i == 11 || i == 16 || i == 21))
//            {
//                System.out.println();
//            }
//            System.out.print(i + " ");
//        }

//        for (int i = scores.length-4; i <= 25; i++)
//        {
//            System.out.print(i + " ");
//        }

System.out.println("\n");

        for(int i = scores[0].length; i >= 1; i--)
        {
            if((i == 5 || i == 10 || i == 15 || i == 20))
            {
                System.out.println();
            }
            System.out.print(i + " ");
        }

        for(int i = scores.length; i <= 10 ; i--)
        {
            System.out.print(i + " ");
        }



        System.out.println("\n");

        //run the second problem
        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + " " + i + " " + i + " " + i + " " + i);
        }


        System.out.println();
        while (r != 25) {
            for (int i = 0; i < scores.length; i++) {
                System.out.print(i + " ");
                if ((r == 4) || (r == 9) || (r == 14) || (r == 19) || (r == 24))
                {
                    System.out.println();
                }
                r++;
            }
        }
    }
}