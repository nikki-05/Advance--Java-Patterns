public class SolidRhombus{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)     //for printing spaces
                System.out.print(" ");

            for(int j=1;j<=5;j++)     //for printing stars
                System.out.print("*");
            
            System.out.println();
        }
    }
}