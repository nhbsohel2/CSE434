/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvbuilderfinal;

//import static Variables.imgExtension;
//import static cvbuilder.Variables.imgString;
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author NHBSOHEL
 */
public  class HTMLWriter {
    
    /**
     * Graph partition
     * 
     * node:0 //html file=null
     * node:1 //string replace success
     * node:1 child:1 //write html
     * 
     * 
     * node:2 //string replace failed
     * node:2 child:2 //error occured
     * 
     * @param imgExtension
     * @param imgString
     * @param name
     * @param address
     * @param father
     * @param mother
     * @param bloodg
     * @param religion
     * @param nationality
     * @param phone
     * @param email
     * @param experience
     * @param education
     * @param skills
     * @param achievement
     * @return
     * @throws IOException 
     */
     public  String writeHTML(String imgExtension,String imgString,String name,String address,String father,String mother,String bloodg,String religion,String nationality,String phone,String email,String experience,String education,String skills,String achievement) throws IOException{
        File htmlfile = null;
        try {
            
            htmlfile = new File("template.html");
            String htmlstr;
            htmlstr = FileUtils.readFileToString(htmlfile, "UTF-8");
            htmlstr = htmlstr.replace("$type",imgExtension);
            htmlstr = htmlstr.replace("$imgStr",imgString);
            htmlstr = htmlstr.replace("$title",name);
            htmlstr = htmlstr.replace("$name",name);
            htmlstr=htmlstr.replace("$address", address);
            
           /* if(address.length()>0) {
                htmlstr = htmlstr.replace("$address","["+address+"]");
            }
            else {
                htmlstr = htmlstr.replace("$addhress",address);
             */
            
            htmlstr = htmlstr.replace("$father",father);
            htmlstr = htmlstr.replace("$mother",mother);
            htmlstr = htmlstr.replace("$bloodg",bloodg);
            htmlstr = htmlstr.replace("$religion",religion);
            htmlstr = htmlstr.replace("$nationality",nationality);
            htmlstr = htmlstr.replace("$phone",phone);
            htmlstr = htmlstr.replace("$email",email);
            htmlstr = htmlstr.replace("$experience",experience);
            htmlstr = htmlstr.replace("$educational",education);
            htmlstr = htmlstr.replace("$skills", skills);
            htmlstr = htmlstr.replace("$achievement", achievement);
            File newhtml;
            try {
                newhtml = new File("index.html");
                FileUtils.writeStringToFile(newhtml, htmlstr, "UTF-8");
                return "HTML Export Successful!!";
            } catch (IOException | HeadlessException e) {
                
                 return "An Error Occured. Please Restart the Application";
                
            }
        } catch (IOException e) {
            
            return "Template (template.html) File Not Found!";
        }
        
        
    }

   // Object writeHTML(String imgExtension, String imgString, String name, String address, String father, String mother, String bloodg, String religion, String nationality, String phone, String email, String experience, String education, String skills, String achievement) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

