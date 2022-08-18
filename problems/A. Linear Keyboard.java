import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t;
        t=input.nextInt();
        Hashtable<Character,Integer>map=new Hashtable<>();
        while (t-- >0) {
            String characters = input.next();
            for (int i = 0; i < 26; i++) {
                map.put(characters.charAt(i),i);
            }
            String word = input.next();
            int sum = 0;
            for (int i = 0; i < word.length(); i++) {
                if (i + 1 < word.length()) sum += Math.abs(map.get(word.charAt(i)) - map.get(word.charAt(i + 1)));
            }
            System.out.println(sum);
        }

    }
}

/*

Time complexity : O(n)
Space complexity : O(n)

problem :https://codeforces.com/contest/1607/problem/A
*/