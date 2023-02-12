package org.maf.utils.handler;

import org.maf.core.instance.BetaDriver.base;
import org.maf.utils.PropReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class XMLReader  {



    final static Map<String, String> map;
    private final String fileName;

    public  XMLReader (String fileName )
    {
        this.fileName=fileName;
    }

    static {
        map = new HashMap<> ();
        map.put (base.xmlPathName, PropReader.readConfig("xml-path-lec"));

    }

    public  String getXMLData(String dataFor)
    {
        String nodeValue = null;
        try{
            File file = new File( map.get (fileName));
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            org.w3c.dom.Document document = documentBuilder.parse(file);
            nodeValue =  document.getElementsByTagName(dataFor).item(0).getTextContent();
        }
        catch(Exception e)
        {
            nodeValue = null;
        }

        return nodeValue;
    }
}
