//Always use multiple inheritance with interface
public class MultipleInheritance {
    public static void main(String[] args) {
        FinalReport fr=new FinalReport();
        fr.getSalesReport();
        fr.getMarketingReport();
        fr.getFinanceReport();
    }
}
interface sales{
    void getSalesReport();
}
interface marketing{
    void getMarketingReport();
}
interface finance{
    void getFinanceReport();
}
class FinalReport implements sales,marketing,finance{    //you cannot use multiple methods with extends
    public void getSalesReport(){
        System.out.println("Sales report is ready");
    }
    public void getMarketingReport(){
        System.out.println("Marketing report is ready");
    }
    public void getFinanceReport(){
        System.out.println("Finance report is ready");
    }
}
