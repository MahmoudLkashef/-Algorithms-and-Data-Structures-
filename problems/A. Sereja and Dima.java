import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n=input.nextInt();
        Deque<Integer>cards=new LinkedList<>();
        for(int i=0;i<n;i++){int num=input.nextInt();cards.offerLast(num);}
        int player1=0,player2=0;
        for(int i=0;i<n;i++)
        {
            if((i & 1)==1)player2+=getGreater(cards);
            else player1+=getGreater(cards);
        }
        System.out.print(player1+" "+player2);

    }
    public static int getGreater(Deque<Integer>cards)
    {
        int greater=0;
        if(cards.getFirst()>=cards.getLast()){greater=cards.getFirst();cards.pollFirst();}
        else{greater=cards.getLast();cards.pollLast();}
        return greater;
    }
}

/*
Time complexity : O(n)
Space complexity : O(n)

problem : https://codeforces.com/contest/381/problem/A
*/