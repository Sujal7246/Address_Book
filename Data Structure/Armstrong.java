public class Armstrong {
    public static void main(String[] args) {
        int ori=153;
        
       int num=ori;
        int sum=0;
        while(num>0){
        int digit=num%10;
         sum =+ digit*digit*digit;
        digit=num/10;
        }
        System.out.println(sum);
    if(sum==ori){
        System.out.println("armstrong");
    }else
        System.out.println("not armstrong");
}
}