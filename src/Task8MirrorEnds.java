public class Task8MirrorEnds {
    public static void main(String[] args){
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }
    public static String mirrorEnds(String text){
        String result = "";
        for(int i=0; i<text.length(); i++){
            char chr1 = text.charAt(i);
            char chr2 = text.charAt(text.length()-1-i);
            if(chr1==chr2){
                result = result + chr1;
            }else{
                break;
            }
        }
        return result;
    }
}
