import java.util.Scanner;

  class Main{
   public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr=new int[n];
      for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      }

      for(int i=0;i<n;i++){
         int m=arr[i];
         int b=0;
         int pow2=1;
         while(m!=0){
         b=b+(m%10)*pow2;
         pow2*=2;
         m=m/10;
         }
         System.out.println(b);
      }
   }
}