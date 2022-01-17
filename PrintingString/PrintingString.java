
public class PrintingString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     
        int T = 1;
        for(int i=1; i<= T; i++){
            String a ="Hacekrank";
            for(int j= 0; j < a.length() ; j++){
                if(j % 2 == 0) System.out.print(a.charAt(j));
            }
            
        
        System.out.println(" ");
        for(int j= 0; j < a.length() ; j++){
            if(j % 2 != 0) System.out.print(a.charAt(j));
        } System.out.println();
            
        }    
    }
}