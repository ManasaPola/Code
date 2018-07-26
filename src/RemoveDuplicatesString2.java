public class RemoveDuplicatesString2 {
    public static void main(String[] args){
        RemoveDuplicatesString2 RD2 = new RemoveDuplicatesString2();
        String Input = "Sravan";
        System.out.println(RD2.RemoveDuplicates(Input));
    }
    public static String RemoveDuplicates(String Input){
        char[] data = Input.toCharArray();
        boolean[] hit = new boolean[256];
        int i;
        for (i=0; i<256; i++){
            hit[i] = false;
        }
        hit[data[0]] = true;
        int tail =1;
        for (i=1;i<data.length;i++){
            if(!hit[data[i]]){
                data[tail]= data[i];
                tail++;
                hit[data[i]]= true;
            }
        }
        data[tail]=0;
        String s = new String(data);
        return s;
    }
}
