//Here we are creating number Pyramid 
public class spacedPyramid{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) {  //for printing spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){   //for printing stars
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}