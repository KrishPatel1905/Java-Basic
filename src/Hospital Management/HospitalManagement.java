abstract class Staff {
    String name;
    int id;
    String department;

    public Staff(String name,int id,String department) {
        this.name=name;
        this.id=id;
        this.department=department;
    }

    abstract void performDuties();
}

abstract class MedicalStaff extends Staff {
    MedicalStaff(String name ,int id,String department) {
        super(name,id,department);
    }
}

class Doctor extends MedicalStaff {
    Doctor(String name, int id, String department) {
        super(name, id, department);
    }


    void performDuties() {
        System.out.println("Doctor Attend " + name);
    }

    void prescribeMedicine() {
        System.out.println("Doctor " + name + " prescribes medicine.");
    }
}

class Nurse extends MedicalStaff {
    Nurse(String name,int id,String department) {
        super(name,id,department);
    }


    void performDuties() {
        System.out.println("Nurse Attend " + name);
    }

    void checkVitals() {
        System.out.println("Nurse " + name + " checks patient vitals.");
    }
}

class AdministrativeStaff extends Staff {
    AdministrativeStaff(String name,int id,String department) {
        super(name,id,department);
    }


    void performDuties() {
        System.out.println("Administrative Staff " + name + " manages records.");
    }
}

final class FinanceDepartment extends AdministrativeStaff {
    FinanceDepartment(String name, int id, String department) {
        super(name, id, department);
    }


    void performDuties() {
        System.out.println("Finance Department Staff " + name + " handles financial tasks.");
    }

    void prepareBudget() {
        System.out.println("Finance Department Staff " + name + " prepares the annual budget.");
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        // Upcasting
        Staff s1 = new Doctor("Dr. Smith", 101, "Cardiology");
        Staff s2 = new Nurse("Alice", 102, "Emergency");
        Staff s3 = new FinanceDepartment("John", 201, "Finance");

        System.out.println("...Staff Duties ...");
        s1.performDuties();
        s2.performDuties();
        s3.performDuties();

        System.out.println("\n=== Downcasting Example ===");
        Doctor d = (Doctor) s1;  // Downcast
        d.prescribeMedicine();
    }
}
