package JavaPractice;

public class Searchchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="adasdasdasdasdasda";
		char search='a';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==search)
			{
				count++;
			}
		}
System.out.println(count);
	}
	

}
