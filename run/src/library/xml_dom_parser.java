/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author HP
 */
public class xml_dom_parser {
    
    public static void main(String[] args) {
        DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
        try{
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.parse("Test.xml");
            NodeList list=doc.getElementsByTagName("object");
            for(int i=0;i<list.getLength();i++){
                Node node=list.item(i);
              if(node.getNodeType()==Node.ELEMENT_NODE){
                  Element element=(Element)node;
                  String id=element.getAttribute("class");
                  NodeList childlist=element.getChildNodes();
                  for(int j=0;j<childlist.getLength();j++){
                      Node child=childlist.item(j);
                      if(child.getNodeType()==Node.ELEMENT_NODE){
                          Element childelement=(Element)child;
                 System.out.println(/*element+":"+*/"Object "+id+" "+childelement.getTagName()+" "+
                                  childelement.getTextContent());
                      }
                  }
              }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
