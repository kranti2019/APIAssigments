package Examplepolysubstitubality;

class LargeWoddenBox extends WoddenBox
{
    @Override
    void info()
    {
        System.out.println("This is a Huge Wodden box");
    }
     
    @Override
    void info1()
    {
        System.out.println("This method is not present in the baseclass box");
    }
     
    void info50()
    {
        System.out.println("This method is only for me, not for WB and B");
    }
}