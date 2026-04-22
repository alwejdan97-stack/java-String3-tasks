public class Task9MaxBlock {
    public static void main(String[] args){
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock(""));
        System.out.println(maxBlock(" "));
    }
    public static int maxBlock(String text){
        int count = 1;
        int currentCount=1;
        if(text.length() ==0){
            return 0;
        }
        for(int i=1; i< text.length(); i++){
            char chr1 = text.charAt(i);
            char chr2 =text.charAt(i-1);
            if(chr1==chr2){
                currentCount++;
                if(currentCount > count){
                    count=currentCount;
                }
            }else{
                    currentCount=1;
                }
            }


    }
}
