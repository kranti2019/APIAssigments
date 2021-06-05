package Examplepolysubstitubality;

class WoddenBox extends Box
{
  //each "child" can have it's own attributes
    int life;
     
    @Override
    void info( )
    {
        System.out.println("This is a Wodden box");
         
    }
     
    void info1()
    {
        System.out.println("I am only in WoddenBox");
        life = 10;
    }
     
    @Override  
    void info3()
    {
        System.out.println("I am in WoddenBox and Box but not in LWB but I am WB");
    }
}