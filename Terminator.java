package TERMINATOR;

public abstract class Terminator 
{
    private int ID;

    public Terminator(int id)
        {
            this.ID = id;
        }

    public void SePresenter()
        {
            System.out.println("Je suis un Terminator et mon numéro de série est ..." + this.ID);
        }

    public void Termine()
        {
            System.out.println("Vous etes terminés!!");
        }
}



