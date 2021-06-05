package JavaPractice;

import java.util.Arrays;

public class equalityCheck {
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [] arr1 = new int [] {20, 5, -95, 43, 17};
        int [] arr2 = new int [] {20, 5, -95, 43, 17};
        System.out.println(Arrays.equals(arr1, arr2));*/
        String s1="abc";
        String s2=new String("abcd");
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1==s2);
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));
       
        
				

	}
	public static void boo()
	{
		
		i=i+1;
		
	}

}
