public class HierarchicalInheritance {
    public static void main(String[] args) {
        InterCollege ic=new InterCollege();
        ic.icSession();
        UnderGraduation ug=new UnderGraduation();
        ug.ugSession();
        PostGraduation pg=new PostGraduation();
        pg.pgSession();
    }
}
class Teachers{
    String name="Prof.R.K.Gupta";

}
class PostGraduation extends Teachers{
    void pgSession(){
        System.out.println(this.name+" will give sessions on discrete mathematics");
    }

}
class UnderGraduation extends Teachers{
    void ugSession(){
        System.out.println(this.name+" will give sessions on Coefficient of correlation");
    }

}
class InterCollege extends Teachers{
    void icSession(){
        System.out.println(this.name+" will take sessions on Applications of Differentiation");
    }
}