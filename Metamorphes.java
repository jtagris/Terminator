package TERMINATOR;



abstract class Metamorphes extends TERMINATOR.Terminator
{
    public Metamorphes(int id)
    {
        super(id);
    }



    private String apparence = "personne";



    @Override
    public void SePresenter()
        {
            super.SePresenter();
            System.out.println("Je suis sous l'apparence de..." + this.apparence);
        }

    public void SetApparence(String app)
        {
            this.apparence = app;
        }
}