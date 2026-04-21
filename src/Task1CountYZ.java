public class Task1CountYZ {
    public static void main(String[] args){
        System.out.println("The count of word which ends with y or z is: "+ countYZ("hello from xy"));
        System.out.println("The count of word which ends with y or z is: "+ countYZ("fez day"));
        System.out.println("The count of word which ends with y or z is: "+ countYZ("fez day windy"));
    }
    public static int countYZ(String text){
        int count=0;
        String str= text.toLowerCase();
        for(int i=0; i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                if(str.charAt(i)=='y' || str.charAt(i)=='z'){
                    count++;
                }
            }
        }
        return count;
    }
}
