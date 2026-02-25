package git_applic;
class Class_mosataf {
    public int Id ;
    public String Name;
    public int Age;

    public Class_mosataf(int Id, String Name, int Age) {
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
    }
    
    public void PrintInfo(){
        System.out.println("The Id Number Is : "+Id);
        System.out.println("Nmae is : "+Name);
        System.out.println("Age Is : "+Age);
    }
}
