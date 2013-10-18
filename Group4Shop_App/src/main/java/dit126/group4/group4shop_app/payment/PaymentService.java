/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dit126.group4.group4shop_app.payment;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author emilbogren
 */
@Named("paymentservice")
@RequestScoped
public class PaymentService {
    
    private String cardnumber;
    private String validUntil;
    private String cardHolder;
    private String cvc;
    
    
    public String doPayment(){
        System.out.println("Payment reached paymentservice with info: " + cardnumber + 
                " " + validUntil + " " + cardHolder + " " + cvc );
        if(cardnumber != null && cvc != null){
            try {
                int random = 2 + (int)(Math.random() * (10 - 4));
                System.out.println("Pending payment for: " + random + " seconds!");
                Thread.sleep(random);
            } catch (InterruptedException ex) {
                Logger.getLogger(PaymentService.class.getName()).log(Level.SEVERE, null, ex);
            }
            return "SUCCESS";
        } else{
            return "FAILED";
        }
        
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public void setCvc(String cvc) {
        this.cvc = cvc;
    }
    
    
}
