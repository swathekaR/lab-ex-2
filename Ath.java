
import java.util.*;
public class Ath {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String name,email;
        char gender;
        System.out.println("Enter the name:");
        name=obj.next();
        System.out.print("Enter the email:");
        System.out.print(email=obj.next()+"@gmail.com");
        
        System.out.println("");
        System.out.println("Enter the Gender(m/f):");
        gender=obj.next().charAt(0);
        auther a1=new auther(name,email,gender);
        a1.getname();
        a1.getmail();
        a1.setmail();
        a1.gender();
        System.out.println(a1.tostring());
    }
    
}
class author
{
    Scanner obj=new Scanner(System.in);
    String name,email,setmail;
    char gender;
    auther(String i,String o,char s)
    {
        name=i;
        email=o;
        gender=s;
    }
    String getname()
    {
        return name;
    }
    String getmail()
    {
        return email;
    }
    String setmail()
    {
        System.out.print("Enter mail to set mail:");
        System.out.print(setmail=obj.next()+"@gmail.com");
        System.out.println("");
        email=setmail;
        return email;
    }
    char gender()
    {
        return gender;
    }
    String tostring()
    {
        return ("name:"+name+"\n"+"email:"+email+"\n"+"Gender:"+gender);
    }
}

