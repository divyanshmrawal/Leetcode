//QUESTION-->
//Find Words Containing Character

//ANSWER-->
import java.util.*;
class Find_Words_Containing_Character__1 {
    public static void main() {
        String[] words; 
        char x;

        List<Integer> count=new ArrayList<>();

        for(int i=0;i<words.length;i++){
        for(int j=0;j<words[i].length();j++){
            if(words[i].charAt(j)==x){
                count.add(i);
                break;
            }
        }
        }
        return count;
    }
}