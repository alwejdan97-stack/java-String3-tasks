public class Task11NotReplace {
    public static void main(String[] args){
        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
    }

    public static String notReplace(String text){
        String result = "";
        for(int i = 0; i < text.length(); i++){
            if(i < text.length() - 1 &&
                    text.charAt(i) == 'i' &&
                    text.charAt(i + 1) == 's' &&
                    (i == 0 || !Character.isLetter(text.charAt(i - 1))) &&
                    (i + 2 >= text.length() || !Character.isLetter(text.charAt(i + 2)))){
                result = result + "is not";
                i++;
            } else {
                result = result + text.charAt(i);
            }
        }
        return result;
    }
}