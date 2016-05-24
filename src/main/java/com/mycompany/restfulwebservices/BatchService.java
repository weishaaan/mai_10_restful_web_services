package com.mycompany.restfulwebservices;

import com.mycompany.restfulwebservices.Batch.Input;
import com.mycompany.restfulwebservices.Batch.Param;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchService {
    
    public Map<Long,Batch> batches = BatchDatabase.getBatches();
    public ArrayList<Param> params = new ArrayList<Param>();
    public BatchService(){
        
        params.add(new Param("refMora","default value","Reference Mora"));
        params.add(new Param("refMora2","default value2","Reference Mora2"));
        batches.put(1L, new Batch("07J","Batch num 7 - extraction 7","USA","Fichier xls",
                new Input(new ArrayList<Param>(params))));
        
    }
    
    public List<Batch> getAllBatches(){
        return new ArrayList<Batch>(batches.values());
    }
    
    
}
