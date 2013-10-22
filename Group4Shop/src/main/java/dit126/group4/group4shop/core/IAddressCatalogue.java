package dit126.group4.group4shop.core;

import java.util.List;

/**
 *
 * @author Christian
 */
public interface IAddressCatalogue {
    public void add(Address address);
    
    public void remove(AddressPK addressPK);
    
    public List<Address> find(String id);
    
}
