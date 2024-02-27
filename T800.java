package TERMINATOR;

class T800 extends Terminator
{
    private int state;
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

}