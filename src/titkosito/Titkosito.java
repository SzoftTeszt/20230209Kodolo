/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package titkosito;

/**
 *
 * @author jager
 */
public class Titkosito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Decodolo k= new Decodolo();      
        Codolo c = new Codolo();
        
        String kodolando= "Ez egy titkos jelszó!";
        String titok= c.codolo(kodolando);
        System.out.println("Titok:"+titok); 
        System.out.println("Dekódolva"+k.dekodol(titok));
                
    }
    
}
