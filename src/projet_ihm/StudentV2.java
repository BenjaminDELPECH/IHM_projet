/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_ihm;
import java.util.Date;
import java.util.Calendar;
import java.util.regex.*;
/**
 *
 * @author Luc
 */
public class StudentV2 {
    private String fName;
    private String lName;
    private int dateOfBirth;
    private String promotion;
    
    public StudentV2 (String sFName, String sLName, int sDateOfBirth, String sPromotion)
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
    
    // 1: Champ vide
    // 2: Prénom invalide (chiffre ou commence par un blanc)
    // 0: Correct
    public int verifSName ()
    {
        Pattern pattern;
        Matcher matcher;
        
        pattern = Pattern.compile("(\\d)(^\\s)");
        matcher = pattern.matcher(fName);
        
        if (this.fName.equals(""))
            return 1;
        else if (matcher.find())
            return 2;
        else
            return 0;
    }
    
    // 1: Champ vide
    // 2: Prénom invalide (chiffre ou commence par un blanc)
    // 0: Correct
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
    
    // 1: Date supérieure à l'année actuelle ou inférieur à 1900
    // 0: Correct
    private int verifDateOfBirth (int sDateOfBirth)
    {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        
        if (sDateOfBirth > year || sDateOfBirth < 1900)
            return 1;
        else return 0;
    }
}
