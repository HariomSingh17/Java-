package summervacation.String;

public class reversethesentence {
    static String reveString(String sentence){
        String result ="";// empty 
        for(int i =sentence.length()-1; i>=0; i--){
            result+= sentence.charAt(i);
        } return result;
    }
    public static void main(String[] args) {
        
    
    String sentence ="I am hariom singh";
    System.out.println("The original is :"+sentence);

    String reversed =reveString(sentence);
    System.out.println("The result is :"+reversed);

    }
}
