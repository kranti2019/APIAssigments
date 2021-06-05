package Examplepolysubstitubality;

public class TestPoly {
		 
	     public static void main ( String ary[ ] ) throws InterruptedException
	        {
	         Box x = null ;
	         x = new Box();//Simple
	        // x.info();
	         Box x1 = new WoddenBox();
	        // WoddenBox wewqe1 = new Box();
	     
	         WoddenBox WBWBC = new WoddenBox();
	        /* WBWBC.info1();
	         WBWBC.info2();*/
	        // x1.info2();
	        // x1.info1();
	        //WoddenBox wb1 = new Box();
	        //WBWBC = (WoddenBox)x;
	         
	        //WBWBC.info3();
	        Box b1 =new Box( );
	        WoddenBox wb=new WoddenBox( );
	        SteelBox s1=new SteelBox( );
	        LargeWoddenBox p1=new LargeWoddenBox( );
	        b1.info( );
	        wb.info( );
	        s1.info( );
	        p1.info( );
	         
	        //Dynamic Binding example
	     //   x =b1;
	      //  x.info();
	        x =wb;// x = new WoddenBox( );
	       System.out.println("Before");
	        x.info();//Wooden Box
	        System.out.println("After");
	     //   x.info1(); 
	        wb.info1();
	        x.info3();
	      // wb.info1();
	        x =s1;
	        x.info();//Steel Box 
	        x =p1;
	        x.info();
	        x.info3();
	        //x.info50();
	      //  p1.info50();
	        x.info();
	         
	        callTwoMethodsTogether4(s1);
	        callTwoMethodsTogether4(wb);
	        callTwoMethodsTogether4(p1);
	        }
	     public static void callTwoMethodsTogether4(Box b) {
	         b.info();
	         b.info3();
	     }
	      
	    /* public static void callTwoMethodsTogether(WoddenBox w1) {
	         w1.info();
	         w1.info3();
	     }
	      
	     public static void callTwoMethodsTogether1(SteelBox w1) {
	         w1.info();
	         w1.info3();
	     }
	      
	     public static void callTwoMethodsTogether1(LargeWoddenBox w1) {
	         w1.info();
	         w1.info3();
	     }*/
	      
	      
	}