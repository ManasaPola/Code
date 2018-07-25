public class CStyleString {
    public static void main(String[] args){
        String str = "Manasa ";
        CStyleString CSS = new CStyleString();
        System.out.println(CSS.Reverse(str));
    }

    public static String Reverse(String str)
    {
        char[] data = str.toCharArray();
        char temp;
        int i=0;
        int l = data.length-2;

        while(i<l)
        {
            temp = data[i];
            data[i] = data[l];
            data[l] = temp;
            i++;
            l--;
        }
        String s = new String(data);
        return s;
    }
}
