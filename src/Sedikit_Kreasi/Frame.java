/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sedikit_Kreasi;

/**
 *
 * @author USER
 */
import javax.swing.*; 
import java.awt.*; 

public class Frame extends JFrame
{
JDesktopPane desktop=new JDesktopPane();    
JInternalFrame iframe=new  
    
JInternalFrame(" Frame ",true,true,true,true); 
 
   Frame() 
   {
     setTitle(" Frame ");       
     setLocation(100,200);       
     setSize(300,200);       
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
   }
   void KomponenVisual()
   {
   iframe.setLocation(20,20);       
   iframe.setSize(200,100);       
   iframe.setVisible(true);       
   desktop.add(iframe);       
   setContentPane(desktop);       
   setVisible(true);     
   }
   public static void main(String[] args) 
     {       
        Frame if1 = new Frame();
        if1.KomponenVisual(); 
     }      
}