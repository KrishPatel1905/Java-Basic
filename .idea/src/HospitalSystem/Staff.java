public abstract class Staff // ← make sure this is abstract
{
    int id;
    String dp;
    String name;

    public Staff(int id, String dp, String name)
    {
        this.name = name;
        this.id = id;
        this.dp = dp;
    }

    public abstract void performDuties(); // ← fixed name
}

abstract class MedicalStaff extends Staff
{
    public MedicalStaff(int id, String dp, String name)
    {
        super(id, dp, name);
    }
}

public class Doctor extends MedicalStaff {
    public Doctor(int id, String dp, String name) {
        super(id, dp, name);
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor " + name + " treats patients.");
    }
}

