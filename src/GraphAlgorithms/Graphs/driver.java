package GraphAlgorithms.Graphs;

/**
 * Created by Elias on 2/2/2015.
 */
import java.util.*;
import java.lang.*;
public class driver {

    public static void main(String [] args)
    {
//        PriorityQueue<Integer> pr=new PriorityQueue<Integer>();
//
//        for(int i=10;  i>0; i--)
//        {
//            pr.add(i);
//        }
//        System.out.println(pr.poll());

         int[][] solved = { { 1, 2, 3 }, { 4, 0, 6 },
                { 7, 8, 5 } };

        int[][] solved1 = { { 1, 2, 3 }, { 4, 5, 6 },
                { 8, 7, 0 } };

        int[][] solved2 = { { 2, 1, 3 }, { 4, 5, 6 },
                { 8, 0,7 } };

        Board myBoard=new Board(solved);
      //  System.out.println(myBoard) ;

        LinkedList<puzzleNode> myBoards=myBoard.neighbors();

        for(puzzleNode curBoard : myBoards)
        {
            System.out.println(curBoard);
        }




    }
}
