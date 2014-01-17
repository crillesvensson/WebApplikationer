package dit126.group4.group4shop_app.view;
  
import java.util.ArrayList;  
import java.util.List;  
import javax.annotation.PostConstruct;  
import javax.enterprise.context.SessionScoped;
  
public class SlideshowBean {  
  
    private List<String> images;  
   
  @SessionScoped 
    @PostConstruct  
    public void init() {  
        images = new ArrayList<String>();  
  
        for(int i=1;i<=3;i++) {  
            images.add("galleria" + i + ".jpg");  
        }  
    }
     
    public List<String> getImages() {  
     
        return images;  
    }  
  
}  
                      