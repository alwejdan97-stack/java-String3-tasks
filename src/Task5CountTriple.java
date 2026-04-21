public class Task5CountTriple {
    public static void main(String[] args){
        System.out.println("the number of tripple is: "+ countTriple("abcXXXabc"));
        System.out.println("the number of tripple is: "+ countTriple("xxa"));
        System.out.println("the number of tripple is: "+ countTriple("xxxabyyyycd"));
    }
    public static int countTriple(String text){
        text = text.toLowerCase();
        int count=0;
        for(int i=0; i<text.length()-1;i++){
            if(text.charAt(i)==text.charAt(i+1) && text.charAt(i+1)==text.charAt(i+2)){
                count++;
            }
        }
        return count;
    }
}
