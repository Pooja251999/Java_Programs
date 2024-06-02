package Java_Programs.OOPs_Concept_Programs.Encapsulation_Programs;

public class RealTimeInheritance {
    public static void main(String[] args) {
    BaseClass b1=new BaseClass();
    b1.setBrowser("Chrome", true);
    String b=b1.getBrowser();
        System.out.println("Browser name: "+b);
    b1.openBrowser();
    b1.closeBrowser();
        System.out.println("");
    BaseClass b2=new BaseClass();
    b2.setBrowser("Edge", false);
    String bb=b2.getBrowser();
        System.out.println("Browser name: "+bb);
//    b2.openBrowser();
//    b2.closeBrowser();
    }
}
class BaseClass{
    String browser;
    public String getBrowser(){
        return browser;
    }
    public void setBrowser(String browsername, boolean isAuth){
        if(isAuth==true){
            this.browser=browsername;
        }
        else {
            System.out.println("Not Allowed to open the browser!!");
        }
    }
    void openBrowser(){
        System.out.println("Opening the Browser");
    }
    void closeBrowser(){
        System.out.println("Closed the Browser");
    }
    void openBrowser(String browsername){
        System.out.println("Opening browser --> "+browsername);
    }
}

/*
Output :
Browser name: Chrome
Opening the Browser
Closed the Browser

Not Allowed to open the browser!!
Browser name: null
 */