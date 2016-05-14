package latihan8;

public class Latihan8 implements I1,D1{
 
    /* untuk melakukan pengecekan bisa melalui inisialisasi di 
    overloading constructor atau melalui method setAngka */
    
    private int i;
    private double d;
    
    public Latihan8(){
        
    }
    
    public Latihan8(int i){
        System.out.println("Angka "+i+methodI1());
    }
    
    public Latihan8(double d){
        System.out.println("Angka "+d+methodD1());
    }

    public void setAngka(int i){
        this.i = i;
    }
    
    public void setAngka(double d){
        this.d = d;
    }
    
    @Override
    public String methodI1() {
        return String.format(" termasuk tipe data integer");
    }

    @Override
    public String methodD1() {
        return String.format(" termasuk tipe data Double");
    }
    
    public void display(){
        if(i!=0 && d==0)
            System.out.println("Angka "+i+methodI1());
        else
            System.out.println("Angka "+d+methodD1());
    }
    
}
