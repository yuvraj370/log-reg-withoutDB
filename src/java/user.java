
import java.util.jar.Attributes;
import org.hibernate.validator.constraints.Email;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuvraj
 */
public class user {
    private String name ,password;
    public user(String name,String password)
    {
        this.name = name;
         this.password = password;
    }

    
    
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

 public String toString()
 {
     return "user{"+"name="+name+",password="+password+')';
 }
}
