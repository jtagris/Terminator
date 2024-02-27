package TERMINATOR;
class TX extends Metamorphes 
{
    public TX(int id)
        {
            super(id);
        }
    public boolean reprogramme(T800 Terminator)
        {
            return Terminator.state = true;
        }
}