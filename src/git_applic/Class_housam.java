package git_applic;

public class Class_housam {

    int Id;
    String Name;
    int Aag;

    // Constructor
    public Class_housam(int Id, String Name, int Aag) {
        this.Id = Id;
        this.Name = Name;
        this.Aag = Aag;
    }

    // Getter & Setter لـ Id
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    // Getter & Setter لـ Name
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    // Getter & Setter لـ Aag
    public int getAag() {
        return Aag;
    }

    public void setAag(int Aag) {
        this.Aag = Aag;
    }

    // دالة طباعة
    public void printInfo() {
        System.out.println("ID: " + Id);
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Aag);
    }
    public int hsammsah(int x){
    
    return x*x;
    }
    
    
}