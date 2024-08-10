import java.util.*;
public class Array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;

System.out.println("Enter size:");
n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter elements");
for(int i=0;i<arr.length;i++)
{
  arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum=sum+arr[i];
}
System.out.println("Sum " +sum);
}}