package Model;

import java.io.File;
import noNamespace.BatchType;
import noNamespace.CATALOGDocument;
import noNamespace.ParamType;

/*
Use this .java file, run--> batchXmlBean.runBatch()
This will give u all the information in XML file.

*/    
public class batchXmlBean {
    private String filename = null;
    
    public batchXmlBean(String filename) {
            super();
            this.filename = filename;
    }
    
    public void runBatch() {
        String filename = "src/main/java/Resource/batch_catalogue.xml";
        batchXmlBean batchXmlBean_ = new batchXmlBean(filename);
        batchXmlBean_.batchReader();
    }
    
    public void batchReader() {
        try {
              File xmlFile = new File(filename);
              CATALOGDocument doc = CATALOGDocument.Factory.parse(xmlFile);
              BatchType[] batches = doc.getCATALOG().getBATCHArray();
              
            for (int i = 0; i < batches.length; i++) {
                BatchType batch = batches[i];
                println("Batch#" + i);
                println("Code :" + batch.getCODE());
                println("Name :" + batch.getNAME());
                println("DESCRIPTION :" + batch.getDESCRIPTION());
                println("Output:" + batch.getOUTPUT());
                // Input
                ParamType[] inputs = batch.getINPUT().getPARAMArray();
                
                for (int j = 0; j < inputs.length; j++) {
                    ParamType param = inputs[j];
                    println("Param#" + j);
                    println("Param Name :" + param.getPARAMNAME());
                    println("Param Default Value :" + param.getDEFAULTVALUE());
                    println("Param label" + param.getLABEL());
            
                }
        }} catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void println(String str) {
          System.out.println(str);
    }
}

