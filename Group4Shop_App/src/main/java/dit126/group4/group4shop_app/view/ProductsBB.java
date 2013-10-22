package dit126.group4.group4shop_app.view;

import dit126.group4.group4shop.core.Product;
import dit126.group4.group4shop_app.model.Group4Shop;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIColumn;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;
import javax.inject.Provider;

/**
 * Must have in session scope, has state (in ContainerNavigator)!
 * @author hajo
 */
@Named("products")
@SessionScoped  // NOTE enterprise package, else disaster!!!
public class ProductsBB implements Serializable{
    
    @Inject
    private Group4Shop shop;
    private List<SortMeta> preSortOrder = new ArrayList();
    private List<Product> filteredProducts;
    private SelectItem[] categoryOptions;
    private final static String[] categories =  new String[5];
    
    
    @PostConstruct
    public void post() {
        // We know all injection are done so shop not null (hopefully)
        categories[0] = "Shirts";
        categories[1] = "Pants";
        categories[2] = "Hats";
        categories[3] = "Ties";
        categories[4] = "Other";
        categoryOptions= createFilterOptions(categories);
        buildSortOrder();
    }
    
    /*
     * method to build initial sort order for multisort
     */
    private void buildSortOrder() {
        UIViewRoot viewRoot =  FacesContext.getCurrentInstance().getViewRoot();
        UIComponent column = viewRoot.findComponent("productsDT:nameColumn");
        
        SortMeta sm1 = new SortMeta();
        sm1.setSortBy((org.primefaces.component.api.UIColumn)(UIColumn)column);
        sm1.setSortField("nameColumn");
        sm1.setSortOrder(SortOrder.DESCENDING);
        preSortOrder.add(sm1);
    }
    
    public List<SortMeta> getPreSortOrder(){
        return preSortOrder;
    }
    
    public List<Product> getFilteredProducts(){
        return filteredProducts;
    }
    
    public void setFilteredProducts(List<Product> filteredProducts) {
        this.filteredProducts = filteredProducts;
    }
    
    public List<Product> getProducts(){
        int count = shop.getProductCatalogue().getCount();
        List<Product> productList = shop.getProductCatalogue().getRange(0, count);
        return productList;
    }
    /*
     * public List<Product> getByCategory(String cat){
     * List<Product> productList = shop.getProductCatalogue().getByCategory(cat);
     * return productList;
     * }
     */
    
    public String navigate(String target) {
        return target;
    }
    
    private SelectItem[] createFilterOptions(String[] data)  {
        SelectItem[] options = new SelectItem[data.length + 1];
        
        options[0] = new SelectItem("", "Show all");
        for(int i = 0; i < data.length; i++) {
            options[i + 1] = new SelectItem(data[i], data[i]);
        }
        return options;
    }
    
    public SelectItem[] getCategoryOptions() {
        return categoryOptions;
    }
}