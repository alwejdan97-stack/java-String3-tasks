public class Task2WithoutString {
    public static void main(String[] args){
        System.out.println(withoutString("Oooman","oo"));
        System.out.println(withoutString("OO","oo"));
        System.out.println(withoutString("OOo","oo"));
        System.out.println(withoutString("Hello","lo"));
    }
    public static String withoutString(String base, String remove){
        base =base.toLowerCase();
        remove = remove.toLowerCase();
        String result= " ";
        for(int i=0; i< base.length(); i++){
            char chr=base.charAt(i);
            if(remove.length()>=1 && (i<= base.length() - remove.length()) && base.substring(i,i+remove.length()).equals(remove)){
                i=i+remove.length()-1;
            }else{
                result = result + chr;
            }
        }
        return result;
    }
}
