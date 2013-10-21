package dit126.group4.group4shop_app.view;

import dit126.group4.group4shop.core.IProductCatalogue;
import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop.core.ProductImage;
import dit126.group4.group4shop_app.model.Group4Shop;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
/**
 *
 * @author David
 */
@Named("infoProduct")
@RequestScoped
public class InfoProductBB {
    
    
    private Long id;
    
    private String name;
    private String price;
    private String category;
    private String description;
    private byte[] imageData;
    
    @Inject
    private Group4Shop shop;
     
    public void setSelected(String id) {
        Logger.getAnonymousLogger().log(Level.INFO, "setSelected id={0}", id);
        Product p = shop.getProductCatalogue().find(Long.valueOf(id));
        Logger.getAnonymousLogger().log(Level.INFO, "setSelected p={0}", p);
        this.id = p.getId();
        this.name = p.getName();
        this.price = String.valueOf(p.getPrice());
        this.category = p.getCategory();
        this.description = p.getDescription();
        List<ProductImage> imageList = shop.getProductImageContainer().getForProduct(this.id);

        if(!imageList.isEmpty() && imageList.get(0).getProductId() == this.id){
            this.imageData = imageList.get(0).getImageBytes();
        }else{
            this.imageData = null;
        }
    }
    
    protected IProductCatalogue getProductCatalogue() {
        return shop.getProductCatalogue();
    }
    
    public Long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPrice() {
        return price;
    }
    
    public String getCategory() {
        return category;
    }
    
    public String getDescription() {
        return description;
    }
    
    public StreamedContent getImage() throws IOException{
        if(this.imageData == null){
            String noImageString = "There is no image for this product";
            this.imageData = noImageString.getBytes();
        }
        StreamedContent blobImage = new DefaultStreamedContent(new ByteArrayInputStream(this.imageData), "image/jpg");
        return blobImage;
    }
    
}