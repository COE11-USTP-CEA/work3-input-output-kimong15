import java.io.*;

class project3ioBonus{
    public static void main(String[]args){
        System.out.println("Hi Timangs! :)");
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader p = new BufferedReader(r);
        System.out.println("Enter height of triangle:");
        int num =0;
        try{
            num=Integer.valueOf(p.readLine());
        }
        catch(Exception j){
            System.out.println("Invalid Number!");

        }
        for(int k=1; k<=num; k++){
            for( int l=1; l<num -(l-1); l++){
                System.out.print(" ");
            }
            for( int o=1; o<=k; o++){
                System.out.print("*");
                for( int o1=1; o1<o; o1+=o){
                System.out.print("*");
                }
            }
            System.out.println(" ");
        }
        System.out.println();
        
    }
}