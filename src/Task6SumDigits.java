public class Task6SumDigits {
    public static void main(String[] args){
        System.out.println("the sum of digit is: "+ sumDigits("w3ejda7n1"));
    }
    public static int sumDigits(String text){
        //text= text.toString();
        int sum=0;
        for(int i=0; i<text.length(); i++){
            char chr=text.charAt(i);
            if(Character.isDigit(chr)){
                sum= sum+ chr - '0';
            }
        }
        return sum;
    }
}
