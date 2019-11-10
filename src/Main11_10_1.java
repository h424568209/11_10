import java.util.Scanner;

public class Main11_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int D = scanner.nextInt();
            float a = (A+C)/2;
            float b = (C-A)/2;
            float c = (D-B)/2;
            if(a-(A+C)/2!=0 || b-(C-A)/2!=0 || b!=(B+D)/2|| c-(D-B)/2!=0){
                System.out.println("No");
                return;
            }
            System.out.println((int)a +" "+(int)b+" "+(int)c);
        }
    }

