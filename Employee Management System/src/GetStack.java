/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Stack;
public class GetStack{
    public boolean getIDStack(int i){
        Stack<Integer> stk = new Stack<Integer>();
        
        try{
            Connection con = CP.createC();
            String query ="Select * from employe";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(query);
        while (set.next()){
            // Retrieve by column name
            stk.push(set.getInt("id"));
        }
        while(stk.empty() == false){
            int z =stk.peek();
            if(z==i){
                return true;
            }
            else{
                stk.pop();
            }
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
