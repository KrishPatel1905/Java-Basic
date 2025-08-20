package EventManagement;

abstract class Event {
    int id;
    String ename;
    String date;
    String venue;

    Event(int id, String ename, String date, String venue) {
        this.id = id;
        this.ename = ename;
        this.date = date;
        this.venue = venue;
    }

    abstract void displayEventDetails();
}
