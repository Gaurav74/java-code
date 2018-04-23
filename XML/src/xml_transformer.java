
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class xml_transformer {
    public static void main(String[] args) throws Exception{
        
        DocumentBuilderFactory documentbuilder=DocumentBuilderFactory.newInstance();
        DocumentBuilder builder=documentbuilder.newDocumentBuilder();
        
        Document document=builder.newDocument();
        
        org.w3c.dom.Element element= document.createElement("college");
        document.appendChild((Node)element);
        
       Attr attr=document.createAttribute("place");
       attr.setValue("chennai");
        element.setAttributeNode(attr);
        //new tag
        org.w3c.dom.Element name=document.createElement("name");
        document.appendChild(name);
        
        Attr attrname=document.createAttribute("home");
        attrname.setValue("Islampur");
        name.setAttributeNode(attrname);
        //now transform
        TransformerFactory  transformer=TransformerFactory.newInstance();
        Transformer transform =transformer.newTransformer();
       // DOMParser dom=new DOMParser();
       
        
        
        
    }
    
    
}
