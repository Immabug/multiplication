import java.util.Scanner;

public class process {
    public static int number;
    public void setNum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        number = sc.nextInt();

    }
    public void getNum(){
        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                int product = i * j;
                System.out.print(+j+" * "+i+" = "+product+"\t\t");
            }
            System.out.println("");
        }
    }
}
