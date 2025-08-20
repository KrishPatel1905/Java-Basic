package Management.java;

abstract class Eventt {
     int id;
    String ename;
    String date;
    String venue;
    Eventt(int id,String ename,String date,String venue)
    {
        this.id=id;
        this.ename=ename;
        this.date=date;
        this.venue=venue;
    }   
    abstract void displayEventDetails();
}
