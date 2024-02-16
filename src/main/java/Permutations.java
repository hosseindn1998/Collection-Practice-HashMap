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



}