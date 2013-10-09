package dit126.group4.group4shop_app.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Used to wrap primitive types to be able to send
 * as XML or JSON
 * @author hajo
 */
@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.PROPERTY)
public final class PrimitiveJSONWrapper<T> {
    
    private T value; 
    
    protected PrimitiveJSONWrapper(){
    }
    
    PrimitiveJSONWrapper(T value){
        this.value = value;
    }
    
    @XmlElement
    public T getValue(){
        return value;
    }
    
}
