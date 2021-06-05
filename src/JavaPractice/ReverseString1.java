package JavaPractice;

public class ReverseString1 {

	public static void main(String[] args) {
	String st="Kranti Patil";
	char a[]=st.toCharArray();
	int length=st.length();
	System.out.println(length);
	for(int i=length-1;i>=0;i--)
	{
System.out.println(a[i]);
	}

}
}
