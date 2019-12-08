package Test;

public class Google extends Generics<TestRequest>
{
    @Override
    public void processRequest( TestRequest value )
    {
        this.addItem(value);
    }

    public static void main( String[] args )
    {
        new Google().processRequest( new TestRequest() );

    }
}
