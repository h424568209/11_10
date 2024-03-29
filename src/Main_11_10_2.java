import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class Main_11_10_2 {
       public static int bigThanHalf(Integer [] arr,int n){

           List<Integer> list=Arrays.asList(arr);//注意arr必须不能是int，需要传对象的包装类Integer
           HashSet<Integer> set = new HashSet<>(list);
           for(Integer i:set){
               int count=0;
               for(int j:list){
                   if(j==i){
                       count++;
                   }
               }
               if(count>=(n/2)){
                   return i;
               }
           }
           return 0;
       }
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           while (scanner.hasNextLine()){
               String s=scanner.nextLine();
               String [] str=s.split(" ");
               Integer [] arr= new Integer[str.length];
               for(int i=0;i<str.length;i++){
                   arr[i]=Integer.parseInt(str[i]);
               }
               System.out.println(bigThanHalf(arr,arr.length));
           }
       }
   }

