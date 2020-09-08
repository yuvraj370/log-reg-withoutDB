
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuvraj
 */
public class usera {
    static List<user> ul=new ArrayList<user>();
//     user arr[] = new user[10];
    public void adduser(user a)
    {
        ul.add(a);
    }
    public List<user> returnALL()
    {
        return ul;
    }
}
