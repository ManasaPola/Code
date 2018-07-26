public class RemoveDuplicatesString {
    public static void main(String[] args){
        RemoveDuplicatesString RD = new RemoveDuplicatesString();
        String str = "Sravan";
        RD.RemoveDuplicates(str);
    }
    public static void RemoveDuplicates(String str){
        char[] data = str.toCharArray();
        int len = data.length;
        int tail=1;
        for(int i=1;i<len;++i){
            int j;
            for(j=0;j<tail;++j){
                if(data[i]==data[j])
                    break;
            }
            if(j==tail){
                    data[tail]=data[i];
                    ++tail;
                }
            }
        data[tail]=0;
        System.out.println(data);
    }
}