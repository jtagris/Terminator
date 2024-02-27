package TERMINATOR;

class T800 extends Terminator
{
    public boolean state;
    private int ID;
    
    T800(int id)
        {
            super(id);
            this.state = false;
        }


    void SetAmical()
        {
            this.state = false;
        }

    @Override
    public void Termine()
        {
            if(this.state == false)
                {
                    super.Termine(); 
                }
            else 
                {
                   System.out.println("Hasta la vista, Baby...");
                }
        }

}