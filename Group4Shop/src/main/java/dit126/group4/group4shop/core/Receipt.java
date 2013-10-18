/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop.core;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import javax.imageio.ImageIO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 *
 * @author emilbogren
 */
@Entity
@Table(name="RECEIPT")
public class Receipt implements Serializable {
    
    @Id
    @Column(name = "PURCHASEID", nullable = false)
    private Long id;
    
    @Lob
    @Column(name = "PDF")
    private byte[] pdf;
    
    public Receipt(){}
    
    public Receipt(Long id, byte[] pdf){
        this.id = id;
        this.pdf = pdf;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public byte[] getPdf() {
        return this.pdf;
    }
    
    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }

}
