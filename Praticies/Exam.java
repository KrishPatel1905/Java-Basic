 interface exam {
    boolean p=false;
    public void pf(); 
    String avg();
    
}
// interface pf{

// }
class result implements exam{
          public void pf()
            {
                int marks=60;
                if(50<marks)
                {
                    p=true;
                }
                else{
                    p=false;
                }
                // Scanner avg=new Exam()

                
            }   
          public  void avg()
            {
                int avg=60;
                if(avg==60)
                {
                    System.out.println("Frist");
                }
                else if (avg>60){
                    System.out.println("Second");
                }
                else
                {
                    System.out.println("NO Division");
                }

            }      
    
}

public class Exam {
    public static void main(String[] args) {
    
result r=new result();
r.avg();
r.pf();
    }
}
