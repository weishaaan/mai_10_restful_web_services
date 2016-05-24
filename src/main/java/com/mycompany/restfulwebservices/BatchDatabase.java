package com.mycompany.restfulwebservices;

import java.util.HashMap;
import java.util.Map;

public class BatchDatabase {
    private static Map<Long,Batch> batches = new HashMap<Long,Batch>();

    public static Map<Long,Batch> getBatches(){
        return batches;
    }
}
