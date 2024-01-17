public enum Color
{
     RED("red"), GREEN("green");
    private String val;
    Color(String val)
    {
        this.val = val;
    }
    public String getval()
    {
        return this.val;
    }
}