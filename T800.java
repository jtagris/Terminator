package TERMINATOR;

class T800 extends Terminator
{
    public int state;
    private int ID;
    
    T800(int id)
        {
            super(id);
            this.state = 0;
        }


    void SetAmical()
        {
            this.state = 0;
        }

    @Override
    public void Termine()
        {
            if(this.state == 1)
                {
                    super.Termine(); 
                }
            else 
                {
                   System.out.println("Hasta la vista, Baby...");
                }
        }

}