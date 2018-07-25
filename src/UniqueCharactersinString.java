import java.util.Hashtable;

public class UniqueCharactersinString {
    public boolean Unique(String Input){
        boolean[] charset = new boolean[256];
        for (int i=1; i<Input.length();i++){
            int var = Input.charAt(i);
            if(charset[var])return false;
            else return true;
        }
        return true;
    }
    public static void main(String[] args) {
        UniqueCharactersinString obj = new UniqueCharactersinString();
        String Input = "abcd";
        boolean a = obj.Unique(Input);
        System.out.println(a);
    }
}
