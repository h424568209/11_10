    import java.util.Scanner;
    public class Mains {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int kinds = scanner.nextInt();
            int[] nums = new int[kinds];
                for (int i = 0; i < kinds; i++) {
                    nums[i] = scanner.nextInt();
                }
                System.out.println(fun(nums, kinds, 40,0));
            }

        private static int fun(int[] nums, int n, int v, int st) {
            if (v == 0) {
                return 1;
            }
            if (n == 0) {
                return 0;
            }else {
                return fun(nums,n-1,v-nums[st],st+1)
                        +fun(nums,n-1,v,st+1);
            }
        }
    }

