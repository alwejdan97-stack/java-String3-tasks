public class Task10SumNumbers {
    public static void main(String[] args){
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("7 11"));
    }
    public static int sumNumbers(String text){
        int sum=0;
        String number= "";
        for(int i=0; i<text.length(); i++){
                char chr=text.charAt(i);
                if(Character.isDigit(chr)){
                    number = number + chr;
                }else if(!number.equals("")){
                    sum=sum + Integer.parseInt(number);
                    number="";
                }
        }
        if(!number.equals("")){
            sum=sum + Integer.parseInt(number);
            number="";
        }
        return sum;
    }
}
