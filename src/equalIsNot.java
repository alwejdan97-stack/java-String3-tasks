public class equalIsNot {
    public static void main(String[] args) {
        System.out.println("check if nmber of is and not is equal or not: " + equalIsNot("isnot"));
        System.out.println("check if nmber of is and not is equal or not: " + equalIsNot("isnotnot"));
        System.out.println("check if nmber of is and not is equal or not: " + equalIsNot("noisxxnotyynotxisi"));
    }
    public static boolean equalIsNot(String text){
        text = text.toLowerCase();
        int countIs=0;
        int countNot=0;
        for(int i=0; i<text.length()-1; i++){
            if(text.charAt(i)=='i' && text.charAt(i+1)=='s'){
                countIs++;
            }else if(text.charAt(i)=='n' && text.charAt(i+1)=='o' && text.charAt(i+2)=='t'){
                countNot++;
            }
        }
        if(countIs==countNot){
            return true;
        }
        return false;
    }
}
