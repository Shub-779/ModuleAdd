/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tags;

import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Shivam
 */
public class MyTaghandler extends TagSupport
{

    @Override
    public int doStartTag() throws JspException {
        
        try{
            
            JspWriter out=pageContext.getOut();
            out.println("<h1>This is my custom tag<h1>");
            out.println("<p>This is custom paragraph");
            out.println("<br>");
            out.println(new Date().toString());
            
            
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return SKIP_BODY;
                
    }
    
}
