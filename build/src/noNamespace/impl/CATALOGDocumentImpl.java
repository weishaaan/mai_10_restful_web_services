/*
 * An XML document type.
 * Localname: CATALOG
 * Namespace: 
 * Java type: noNamespace.CATALOGDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one CATALOG(@) element.
 *
 * This is a complex type.
 */
public class CATALOGDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CATALOGDocument
{
    private static final long serialVersionUID = 1L;
    
    public CATALOGDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATALOG$0 = 
        new javax.xml.namespace.QName("", "CATALOG");
    
    
    /**
     * Gets the "CATALOG" element
     */
    public noNamespace.CATALOGDocument.CATALOG getCATALOG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CATALOGDocument.CATALOG target = null;
            target = (noNamespace.CATALOGDocument.CATALOG)get_store().find_element_user(CATALOG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CATALOG" element
     */
    public void setCATALOG(noNamespace.CATALOGDocument.CATALOG catalog)
    {
        generatedSetterHelperImpl(catalog, CATALOG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CATALOG" element
     */
    public noNamespace.CATALOGDocument.CATALOG addNewCATALOG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.CATALOGDocument.CATALOG target = null;
            target = (noNamespace.CATALOGDocument.CATALOG)get_store().add_element_user(CATALOG$0);
            return target;
        }
    }
    /**
     * An XML CATALOG(@).
     *
     * This is a complex type.
     */
    public static class CATALOGImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.CATALOGDocument.CATALOG
    {
        private static final long serialVersionUID = 1L;
        
        public CATALOGImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BATCH$0 = 
            new javax.xml.namespace.QName("", "BATCH");
        
        
        /**
         * Gets array of all "BATCH" elements
         */
        public noNamespace.BatchType[] getBATCHArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BATCH$0, targetList);
                noNamespace.BatchType[] result = new noNamespace.BatchType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BATCH" element
         */
        public noNamespace.BatchType getBATCHArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BatchType target = null;
                target = (noNamespace.BatchType)get_store().find_element_user(BATCH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BATCH" element
         */
        public int sizeOfBATCHArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BATCH$0);
            }
        }
        
        /**
         * Sets array of all "BATCH" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBATCHArray(noNamespace.BatchType[] batchArray)
        {
            check_orphaned();
            arraySetterHelper(batchArray, BATCH$0);
        }
        
        /**
         * Sets ith "BATCH" element
         */
        public void setBATCHArray(int i, noNamespace.BatchType batch)
        {
            generatedSetterHelperImpl(batch, BATCH$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BATCH" element
         */
        public noNamespace.BatchType insertNewBATCH(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BatchType target = null;
                target = (noNamespace.BatchType)get_store().insert_element_user(BATCH$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BATCH" element
         */
        public noNamespace.BatchType addNewBATCH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.BatchType target = null;
                target = (noNamespace.BatchType)get_store().add_element_user(BATCH$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "BATCH" element
         */
        public void removeBATCH(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BATCH$0, i);
            }
        }
    }
}
