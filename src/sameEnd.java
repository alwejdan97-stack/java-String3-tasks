public class Task7SameEnd {
    public static void main(String[] args){
        System.out.println(sameEnd("tooto"));
        System.out.println(sameEnd("abXYab"));
        System.out.println(sameEnd("xxx"));
    }
    public static String sameEnd(String text){
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
