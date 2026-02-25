package git_applic;
public class Git_applic {
    public static void main(String[] args) {


       Class_Abdalrhman class_abd = new Class_Abdalrhman(1,"Abdalrhman",20);
       class_abd.PrintInformatino();

        Class_housam hsm = new Class_housam(1,"housam",21);
        hsm.printInfo();

        Class_mosataf mostaf = new Class_mosataf(1,"Mostaf",22);
        mostaf.PrintInfo();
        int d=hsm.hsammsah(8);
        System.out.println(d);
    
    }
    
    
}
