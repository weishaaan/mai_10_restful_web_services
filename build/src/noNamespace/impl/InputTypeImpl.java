/*
 * XML Type:  inputType
 * Namespace: 
 * Java type: noNamespace.InputType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML inputType(@).
 *
 * This is a complex type.
 */
public class InputTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.InputType
{
    private static final long serialVersionUID = 1L;
    
    public InputTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAM$0 = 
        new javax.xml.namespace.QName("", "PARAM");
    
    
    /**
     * Gets array of all "PARAM" elements
     */
    public noNamespace.ParamType[] getPARAMArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAM$0, targetList);
            noNamespace.ParamType[] result = new noNamespace.ParamType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PARAM" element
     */
    public noNamespace.ParamType getPARAMArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ParamType target = null;
            target = (noNamespace.ParamType)get_store().find_element_user(PARAM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PARAM" element
     */
    public int sizeOfPARAMArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAM$0);
        }
    }
    
    /**
     * Sets array of all "PARAM" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPARAMArray(noNamespace.ParamType[] paramArray)
    {
        check_orphaned();
        arraySetterHelper(paramArray, PARAM$0);
    }
    
    /**
     * Sets ith "PARAM" element
     */
    public void setPARAMArray(int i, noNamespace.ParamType param)
    {
        generatedSetterHelperImpl(param, PARAM$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PARAM" element
     */
    public noNamespace.ParamType insertNewPARAM(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ParamType target = null;
            target = (noNamespace.ParamType)get_store().insert_element_user(PARAM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PARAM" element
     */
    public noNamespace.ParamType addNewPARAM()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.ParamType target = null;
            target = (noNamespace.ParamType)get_store().add_element_user(PARAM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PARAM" element
     */
    public void removePARAM(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAM$0, i);
        }
    }
}
