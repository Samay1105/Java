import java.util.*;
public class Pract_06{
    public static void main(String[] args) {

        try {
            User u = new User("ABC", "abc@gmail.com", "9956847823");
            // User u = new User(null, "abc@gmail.com", "9956847823");
            
            u.Invalid_name();
            u.Invalid_Phone();
            u.disp();
            
        } catch (Exception e){
           System.out.println(e.getMessage()); 
           }
    }
}


 class InBuildException extends Exception{
    InBuildException(String messsage){
        super(messsage);
    }
}

class User{
    String name;
    String email;
   String phone_no;

    public User(String name ,String email,String phone_no) throws InBuildException{
        this.name = name;
        this.email =  email;
        this.phone_no = phone_no;
    }
    void Invalid_name() throws InBuildException{
    if(name == null ){
        throw new InBuildException("Name can't be null !");
   }
   
}
void Invalid_Email() throws InBuildException{
    if( email.endsWith(".com") ||  email.endsWith(".edu")||  email.endsWith(".org")){
        throw new InBuildException("Email has an suffix .com or .edu or .org !");
   }
   this.email = email;
}
void Invalid_Phone() throws InBuildException{
    if(phone_no.length() != 10){
        throw new InBuildException("Number must be 10 digit.");
   }
   this.phone_no = phone_no;
}
    public void disp(){
        System.out.println("Name:"+name+"  Email:"+email+"  Phone number:"+phone_no);
}
}
