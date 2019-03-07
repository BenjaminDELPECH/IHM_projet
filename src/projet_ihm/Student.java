/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_ihm;
import java.util.regex.*;
/**
 *
 * @author Luc
 */
public class Student {
    private String fName;
    private String lName;
    private int dateOfBirth;
    private String promotion;
    
    public Student (String sFName, String sLName, int sDateOfBirth, String sPromotion)
    {
        fName = sFName;
        lName = sLName;
        dateOfBirth = sDateOfBirth;
        promotion = sPromotion;
    }
    
    public String getFName()
    {
        return fName;
    }
    
    public String getLName()
    {
        return lName;
    }
    
    public int getDateOfBirth()
    {
        return dateOfBirth;
    }
    
    public String getPromotion()
    {
        return promotion;
    }
    
    private void setFName (String nsFName)
    {
        this.fName = nsFName;
    }
    
    private void setLName (String nsLName)
    {
        this.lName = nsLName;
    }
    
    private void setDateOfBirth (int nsDateOfBirth)
    {
        this.dateOfBirth = nsDateOfBirth;
    }
    
    private void setPromotion (String nsPromotion)
    {
        this.promotion = nsPromotion;
    }
    
    private int verifSName (String sFName)
    {
        Pattern pattern;
        Matcher matcher;
        
        pattern = Pattern.compile("\\d");
        matcher = pattern.matcher(fName);
        
        if (sFName == "")
            return 1;
        else if (matcher.find())
            return 2;
        else
            return 0;
    }
    
    private int verifLName (String sLName)
    {
        Pattern pattern;
        Matcher matcher;
        
        pattern = Pattern.compile("(\\d)(^\\s)");
        matcher = pattern.matcher(sLName);
        
        if (sLName == "")
            return 1;
        else if (matcher.find())
            return 2;
        else
            return 0;
    }
    
//    private boolean verifDateOfBirth ()
//    {
//        
//    }
}
