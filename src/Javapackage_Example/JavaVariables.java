package Javapackage_Example;

import java.util.Scanner;

public class JavaVariables 
{
	static int Flag;
	public static void main(String[] args)
	{
		 
		//keywords in java
		    //int void;
		    //  String[] static;
		        //strongly typed language
		        //var i
		        // i=10;
		        int i, A;
		        //int a;
		    //  i="Paratus";
		        int y = 5;
		 
		    //  int i;
		        System.out.println(Flag);//0
		        //primitive data types 
		        //cannot start with number or special symbols
		        //cannot be a keyword already like void static or int
		        //int holds even negative numbers (non-decimal)
		        byte k; //declaration of variable
		    //  byte k;
		        byte s;//8 bits signed. saves memory in large array. Signed -128 to 127
		        //k=150;
		        short a; //16 bit signed
		    //  System.out.println(a);
		        int x;// 32 bit signed
		        long ab; //64 bit signed
		       // k= 129;
		        a =  (short) 59399;
		        //java is case sensitive, 
		        //strongly type - 
		        //you cannot redefine a variable
		        //variable name should start with small letters and then camelcase
		        //e.g. int googleLinkSize;
		    //  s.toString();
		        //long byte;
		        x=10;//initializing a variable
		        System.out.println(x);
		        x=15;
		        System.out.println(x);
		        int abc = 5;
		        //With this example we can say that java is case sensitive
		        int ABC,aBC,aBc;
		        abc = 10;
		        // Single Line
		        /*
		         * djasdajda
		         * asdjlajdla
		         * asdjlasjdas
		         * sjdlajsda
		         * 
		         */
		     
		        int sum = 10 ;
		        sum = 15;
		        System.out.println(sum); 
		        //System.out.println();
		        sum=11;
		        sum = sum + 15;
		        System.out.println(sum); 
		        boolean ifTrue, ifFalse, selenium;
		        selenium = true;
		        ifTrue = false;
		        ifTrue = true;
		        ifTrue = (x > 5);
		        System.out.println(ifTrue);
		         
		        //char holds single character. Enclosed by single quotes. It is 16 bit
		        char c, z, qtp,e; //16 bits - 0 to 65535
		        c='e';
		        qtp = 's';
		        z= c;//z = 'e', c='e'
		        c = 'l';//c='l' z='e'
		        z=c;
		        System.out.println(z);//e
		        z = 'z';
		        String f;
		        f = "London";
		        //f = 'l';
		        //c = "l";
		         
		        float height;//32 bit 
		        //64 bit. double holds decimal values including negative numbers
		        double weight;
		         
		         
		         
		         
		        //boolean
		        ifTrue = true;
		        ifFalse = false;
		        ifFalse = true;
		         
		        boolean flag = false;
		        //int flag;
		        //boolean flag;
		    //  int Flag = 0; //Flag and flag , fLag, flAG
		    //  flag = false;
		        System.out.println("Value of Flag is - " + flag);   
		         
		        flag = true;
		        System.out.println("Value of flag is - "+ flag);
		        //s = -129;
		        z = 'k';
		        String name = "Paratus";//paratus, PARATUS
		        String surname = "Niche";
		        String upper = name.toUpperCase();//upper = "PARATUS"
		        System.out.println(name);//Paratus
		        System.out.println(upper);//PARATUS
		        boolean checkThis = upper.equals("PARATUS1");
		         
		        boolean nameInUpperCase = name.toUpperCase().equals("PARATUS");
		         
		 
		        boolean isNameLastCharCorrect = ((name.toLowerCase()).toUpperCase()).endsWith("N");
		        //String whatIsThis = name.toLowerCase().toUpperCase().toLowerCase().toUpperCase().toLowerCase().toUpperCase();
		        //String nameInUpperCase = name.toLowerCase().toUpperCase();
		        //String nameInUpperCase = name.equals("Ketan").toUpperCase();
		     
		         
		        String lowerCase = name.toLowerCase();
		        System.out.println(lowerCase + "-" + name);
		        String finalValue = getScanner().next().toUpperCase();
		        System.out.println(2+2 + "-The sum of the number is-"+ 2+2+2);
		        String upperCase = lowerCase.toUpperCase();
		    //  boolean isNameLastCharCorrect = upperCase.endsWith("n");
		    //   boolean isNameLastCharCorrect = upperCase.endsWith("n").toUpperCase();
		        System.out.println(isNameLastCharCorrect);
		        //boolean output = name.toLowerCase().toUpperCase().toLowerCase().equals("ketan");
		        System.out.println("Surname is - " + name + " " + surname);
		        flag = surname.endsWith("J");
		        String fullName = createFullName(name,surname).trim().toUpperCase();
		         
		         
		        int o;
		    //  System.out.println(o);
		        System.out.println();
		        /*dasdsa
		        sdasdasda
		        'dasdasda's'
		        */
		        System.out.println(name + " " + surname.equals("J"));
		        /*
		         Data Type  Default Value (for fields)
		            byte    0
		            short   0
		            int     0
		            long    0L
		            float   0.0f
		            double  0.0d
		            char    '\u0000'
		            String (or any object)      null
		            boolean     false
		 
		         */
		         
		         
		         
		    }
		     
		    public static String  createFullName(String name, String surname) 
		    {
		         
		        return name + " " + surname;
		    }
		    public static void printMyName(String name)
		    {
		        System.out.println(name);
		    }
		     
		    public static Scanner getScanner() 
		    {
		        Scanner keyboard;
		        keyboard = new Scanner(System.in);
		        return keyboard;        
		    }
		     
		 
		
	}


