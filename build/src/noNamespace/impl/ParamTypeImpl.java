/*
 * XML Type:  paramType
 * Namespace: 
 * Java type: noNamespace.ParamType
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * An XML paramType(@).
 *
 * This is a complex type.
 */
public class ParamTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.ParamType
{
    private static final long serialVersionUID = 1L;
    
    public ParamTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMNAME$0 = 
        new javax.xml.namespace.QName("", "PARAMNAME");
    private static final javax.xml.namespace.QName DEFAULTVALUE$2 = 
        new javax.xml.namespace.QName("", "DEFAULTVALUE");
    private static final javax.xml.namespace.QName LABEL$4 = 
        new javax.xml.namespace.QName("", "LABEL");
    
    
    /**
     * Gets the "PARAMNAME" element
     */
    public java.lang.String getPARAMNAME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PARAMNAME" element
     */
    public org.apache.xmlbeans.XmlString xgetPARAMNAME()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PARAMNAME" element
     */
    public void setPARAMNAME(java.lang.String paramname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMNAME$0);
            }
            target.setStringValue(paramname);
        }
    }
    
    /**
     * Sets (as xml) the "PARAMNAME" element
     */
    public void xsetPARAMNAME(org.apache.xmlbeans.XmlString paramname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMNAME$0);
            }
            target.set(paramname);
        }
    }
    
    /**
     * Gets the "DEFAULTVALUE" element
     */
    public java.lang.String getDEFAULTVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DEFAULTVALUE" element
     */
    public org.apache.xmlbeans.XmlString xgetDEFAULTVALUE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DEFAULTVALUE" element
     */
    public void setDEFAULTVALUE(java.lang.String defaultvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEFAULTVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEFAULTVALUE$2);
            }
            target.setStringValue(defaultvalue);
        }
    }
    
    /**
     * Sets (as xml) the "DEFAULTVALUE" element
     */
    public void xsetDEFAULTVALUE(org.apache.xmlbeans.XmlString defaultvalue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEFAULTVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEFAULTVALUE$2);
            }
            target.set(defaultvalue);
        }
    }
    
    /**
     * Gets the "LABEL" element
     */
    public java.lang.String getLABEL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABEL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LABEL" element
     */
    public org.apache.xmlbeans.XmlString xgetLABEL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABEL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LABEL" element
     */
    public void setLABEL(java.lang.String label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABEL$4);
            }
            target.setStringValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "LABEL" element
     */
    public void xsetLABEL(org.apache.xmlbeans.XmlString label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LABEL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LABEL$4);
            }
            target.set(label);
        }
    }
}
