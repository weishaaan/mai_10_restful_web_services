package com.mycompany.restfulwebservices;

import java.util.ArrayList;
import java.util.List;

public class Batch {
    
    public String code;
    public String name;
    public String description;
    public String output;
    public Input input;

    public Batch(String code, String name, String description, String output, Input input) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.output = output;
        this.input = input;
    }

    public String getCode() { return code;}

    public String getName() { return name;}

    public String getDescription() { return description;}

    public String getOutput() { return output;}

    public Input getInput() { return input;}

    public void setCode(String code) { this.code = code;}

    public void setName(String name) { this.name = name;}

    public void setDescription(String description) { this.description = description;}

    public void setOutput(String output) { this.output = output;}

    public void setInput(Input input) { this.input = input;}  
    
    public static class Input {
        
        public ArrayList<Param> params;

        public Input(ArrayList<Param> params) {
            this.params = params;
        }

        
        public ArrayList<Param> getParams(){ return params;}

        public void setParams(ArrayList<Param> params){ this.params = params;}
        
        
       
    }
    
    public static class Param {
        
        public String paramName;
        public String paramDefaultValue;
        public String paramLabel;

        public Param(String paramName, String paramDefaultValue, String paramLabel) {
            this.paramName = paramName;
            this.paramDefaultValue = paramDefaultValue;
            this.paramLabel = paramLabel;
        }

        public String getParamName() { return paramName;}

        public String getParamDefaultValue() { return paramDefaultValue;}

        public String getParamLabel() { return paramLabel;}

        public void setParamName(String paramName) { this.paramName = paramName;}

        public void setParamDefaultValue(String paramDefaultValue) { this.paramDefaultValue = paramDefaultValue;}

        public void setParamLabel(String paramLabel) { this.paramLabel = paramLabel;}
           
        
    }
}
