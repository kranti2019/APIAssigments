package JavaPractice;

public class Secondlargest {

	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60,70};
		int largest=0,secondlargest=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				secondlargest=largest;
				largest=a[i];
			}
			else
				if(a[i]>secondlargest)
				{
					secondlargest=a[i];
				}
		}
		
		System.out.println(largest);
        System.out.println(secondlargest);
	}

}
