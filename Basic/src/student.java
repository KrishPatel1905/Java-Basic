

public class student {
    public int id;
    public String name;
    public void getvalue(int Id,String Name)
    {
        this.id=Id;
        this.name=Name;
        setvalue();
    }
    public void setvalue()
    {

        System.out.println("Name :"+name);
        System.out.println("id :"+id);
    }
}
