class Demo
{
    public int i;
    public static int j;

    static
    {
        j=21;
    }

    public Demo()
    {
        this.i=11;                  //first use
        System.out.println("Inside Default ");
    }
    
    public Demo(int A)
    {
        this();             //Second use
        System.out.println("Inside parameterised ");
        
    }

    public void Display()
    {
        System.out.println("Inside Display:"+this.i);           //third use
    }
}
class ThisDemo
{
    public static void main(String Arr[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}