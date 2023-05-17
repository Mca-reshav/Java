/*
* [GrandMother]          [GrandFather]
*   |_______________________|
*               |
*               |
*               v
*           [Father]------------------|
*               |                     |
*               |                     |
*               v                     v
*             [Son]              [Daughter]
*               |
*               |
*               v
*           [GrandSon]
* */


public class HybridInheritance {
    public static void main(String[] args) {
        System.out.println("Family Tree");
        Father f=new Father();
        f.grandMotherDetail();
        f.grandFatherDetail();
        Son s=new Son();
        s.fatherDetail();
        s.sonDetail();
        Daughter d=new Daughter();
        d.fatherDetail();
        d.daughterDetail();
        GrandSon gs=new GrandSon();
        gs.sonDetail();
        gs.grandSonDetail();
    }
}
interface GrandMother{
    void grandMotherDetail();
}
interface GrandFather{
    void grandFatherDetail();
}
class Father implements GrandMother,GrandFather{
    void fatherDetail(){
        System.out.println("Father 45");
    }
    public void grandMotherDetail(){
        System.out.println("GrandMother 65");
    }
    public void grandFatherDetail(){
        System.out.println("GrandFather 70");
    }
}
class Son extends Father{
    void sonDetail(){
        System.out.println("Son 25");
    }
}
class Daughter extends Father{
    void daughterDetail(){
        System.out.println("Daughter 22");
    }
}
class GrandSon extends Son{
    void grandSonDetail(){
        System.out.println("GrandSon 0.5");
    }
}
