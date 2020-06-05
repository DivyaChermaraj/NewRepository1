package practise_Jun;

public class SumofDigits {

public static void main(String[] args)
{
	int input =246789, SumOfDigits=0;
String val= String.valueOf(input);
char[] c = val.toCharArray();
for(char ch : c)
	SumOfDigits=SumOfDigits+Integer.parseInt(""+ch);
System.out.println(SumOfDigits);
}

}
