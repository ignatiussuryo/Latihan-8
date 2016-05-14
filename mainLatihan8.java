package latihan8;

import java.util.Scanner;

public class mainLatihan8 {

    public static void main(String[] args) {
           
        /* untuk melakukan pengecekan bisa melalui inisialisasi di 
        overloading constructor atau melalui method setAngka */
        
        /*inisialisasi melalui overloading constructor*/
        Latihan8 [] lat = new Latihan8 [4];
        lat[0] = new Latihan8(90);// integer
        lat[1] = new Latihan8(0.05);// double
        lat[2] = new Latihan8(5.55);// double
        lat[3] = new Latihan8(7);// integer
        
        
        Scanner in = new Scanner(System.in);
        
        /* inisialisasi melalui method contructor */
        Latihan8 lats = new Latihan8();
        lats.setAngka(10);// integer
        lats.display();
        lats.setAngka(10.5);// double
        lats.display();
        
            
            
            
        
         
       
    }
    
}
