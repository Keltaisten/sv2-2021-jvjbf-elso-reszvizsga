package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String s){
        String onlyEven = "";
        for(int i = 0; i < s.length(); i += 2){
            onlyEven = onlyEven + s.charAt(i);
        }
        return onlyEven;
    }
}
