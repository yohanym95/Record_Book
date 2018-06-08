
package recordbook;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


/////////////////////////////////////////
public class RecordBook {

   
public static Connection connect(){
    
    Connection con=null;
    
    String url="jdbc:mysql://localhost:3306/recordbook";
    String user="root";
    String password="";
    
    try{
        Class.forName("com.mysql.jdbc.Driver");//driver loaction
        con = (Connection) DriverManager.getConnection(url, user, password);//get connection
        
    }catch(Exception e){
        System.out.println(e);
    }
    
    
    
    return con;
}
    
}


