package TERMINATOR;

public class Scenario 
{
    public static void main(String[] argv)
        {
            System.out.println("Dialogue entre machines....");

            Terminator t1 = new Terminator(101);
            t1.SePresenter();
            t1.Termine();

            T800 t2 = new T800(102);
            //t2.state = 1;
            t2.SePresenter();
            t2.Termine();

        }    
}
