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
import java.awt.event.*; 

public class Member_Cetak extends JFrame
{
JLabel lblnama=new JLabel("Nama Pendaftar :");    
 JTextField txnama=new JTextField(20);    
 JLabel lblalamat=new JLabel("Alamat :");    
 JTextField txalamat=new JTextField(7);    
 JLabel lblkelamin=new JLabel("Jenis Kelamin");    
 JRadioButton perempuan=new JRadioButton("Perempuan");    
 JRadioButton laki=new JRadioButton("Laki - Laki"); 
 ButtonGroup kelompok=new ButtonGroup();  
 JLabel lblsim=new JLabel(" Member:");    
 JCheckBox Reg=new JCheckBox("Reguler");    
 JCheckBox Eks=new JCheckBox("Ekslusif");    
 JCheckBox VIV=new JCheckBox("VIV");
 JButton cetak=new JButton("Cetak");    
 JTextArea hasil=new JTextArea();
 
 Member_Cetak()
 {
 setTitle("Pendaftran Member ");       
 setLocation(300,100);       
 setSize(330,450);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 }
 void KompenenVisual()
 {
   getContentPane().setLayout(null);       
   getContentPane().add(lblnama);       
   lblnama.setBounds(10,10,175,20);       
   getContentPane().add(txnama);       
   txnama.setBounds(110,10,175,20);      
   getContentPane().add(lblalamat);       
   lblalamat.setBounds(10,33,80,20);       
   getContentPane().add(txalamat);       
   txalamat.setBounds(110,33,175,20);       
   getContentPane().add(lblkelamin);       
   lblkelamin.setBounds(10,56,80,20);       
   kelompok.add(perempuan);       
   kelompok.add(laki);       
   getContentPane().add(perempuan);       
   perempuan.setBounds(105,56,100,20);       
   getContentPane().add(laki);       
   laki.setBounds(205,56,100,20); 
   getContentPane().add(lblsim);       
   lblsim.setBounds(10,80,70,20);       
   getContentPane().add(Reg);       
   Reg.setBounds(105,80,100,20);       
   getContentPane().add(Eks);       
   Eks.setBounds(105,103,100,20);       
   getContentPane().add(VIV);       
   VIV.setBounds(105,126,100,20); 
   getContentPane().add(cetak);       
   cetak.setBounds(10,150,270,20);       
   getContentPane().add(hasil);       
   hasil.setBounds(10,180,270,150);       
   setVisible(true);
 }
 void AksiReaksi()
 {
  cetak.addActionListener(new ActionListener()
  {
   public void actionPerformed(ActionEvent e)
   {
    hasil.append(txnama.getText()+"\n");
    hasil.append(txalamat.getText()+"\n");
    if(perempuan.isSelected()==true)
    {
     hasil.append(perempuan.getText()+"\n");
    }
    else
    {
     hasil.append(laki.getText()+"\n");        
    }
    if(Reg.isSelected()==true)
    {
     hasil.append(Reg.getText()+"\n"); 
    }
     if(Eks.isSelected()==true)
     {
     hasil.append(Eks.getText()+"\n"); 
    }
     if(VIV.isSelected()==true)
     {
     hasil.append(VIV.getText()+"\n"); 
    }
     }
  });
 }
 public static void main(String[]args)
 {
  Member_Cetak Mc=new Member_Cetak();
  Mc.KompenenVisual();
  Mc.AksiReaksi();
}
}