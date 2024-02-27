package TERMINATOR;

public class Scenario 
{
    public static void main(String[] argv)
        {
            System.out.println("Dialogue entre machines....");

           // Terminator t1 = new Terminator(101);
           // t1.SePresenter();
           // t1.Termine();

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            T800 t2 = new T800(102);
            //t2.state = 1;
            t2.SePresenter();
            t2.Termine();
            
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            // Metamorphes t3 = new Metamorphes(103);
            //t3.SePresenter();
            //t3.Termine();

            //System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            //t3.SetApparence("Gros MEchant");
            //t3.SePresenter();
            //t3.Termine();

            //System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            TX t4 = new TX(104);
            t4.SetApparence("PAs gentil");
            t4.SePresenter();
            t4.Termine();

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            t4.reprogramme(t2);
            t2.SePresenter();
            t2.Termine();


            




        }    
}
