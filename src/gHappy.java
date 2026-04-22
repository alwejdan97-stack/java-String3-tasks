public class gHappy {
    public static void main(String[] args){
        System.out.println("check if gg appear in the text or not: "+ gHappy("egg"));
        System.out.println("check if gg appear in the text or not: "+ gHappy("xxggyygxx"));
        System.out.println("check if gg appear in the text or not: "+ gHappy("xxgxx"));
    }
    public static boolean gHappy(String text){
        text = text.toLowerCase();
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='g'){
                if(!(i> 0 && text.charAt(i-1)=='g') && !(i<text.length()-1&& text.charAt(i+1)=='g')){
                    return false;
                }
            }
        }
        return true;
    }
}
