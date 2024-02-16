import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Permutations {

    HashMap<Integer,String> permutationHashMap = new HashMap<>();
    int stringCounter=0;

    public HashMap<Integer,String> getPermutationHashMap() {
        return permutationHashMap;
    }

    public void setPermutationHashMap(int i,String permutationHashMap) {
        this.permutationHashMap.put(i,permutationHashMap);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter Word 1: ");
        String word1 = scanner.next();
        Permutations permutations=new Permutations();
        permutations.printPermutations(word1);
        System.out.println("Permutation HashMap : \n"+permutations.getPermutationHashMap());
        System.out.println("please enter Word 2: ");
        String word2 = scanner.next();
        if(permutations.getPermutationHashMap().containsValue(word2)) {
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }

    }
    public void printPermutations(String word) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        printPermutationsHelper(charCount, "", word.length());
    }

    public void printPermutationsHelper(HashMap<Character, Integer> charCount, String prefix, int remaining) {

        if (remaining == 0) {
            System.out.println(prefix);
            setPermutationHashMap(stringCounter,prefix);
            stringCounter++;
            return ;
        }

        for (char c : charCount.keySet()) {
            int count = charCount.get(c);
            if (count > 0) {
                charCount.put(c, count - 1);
                printPermutationsHelper(charCount, prefix + c, remaining - 1);
                charCount.put(c, count);
            }
        }
    }


}