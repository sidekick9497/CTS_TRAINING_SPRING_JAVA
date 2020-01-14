import java.io.*;
public class reverseNumber {
public static void main(String [] args)throws IOException {
BufferedReader br =new BufferedReader( new InputStreamReader(System.in));
System.out.println("Enter number");
int num=Integer.parseInt(br.readLine());
int rev=0;
while(num!=0) {
	int dig=num%10;
	rev = rev*10+dig;
	num=num/10;
}
System.out.println(rev);
}
}