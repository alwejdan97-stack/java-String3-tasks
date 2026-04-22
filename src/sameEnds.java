public class sameEnds {
    public static void main(String[] args){
        System.out.println(sameEnds("tooto"));
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xxx"));
    }
    public static String sameEnds(String text){
        String result = "";
        for(int i=1; i<=text.length()/2; i++){
            String  start= text.substring(0,i);
            String end = text.substring(text.length()-i);
            if(start.equals(end)){
                result = start;
            }
        }
        return result;
    }
}
