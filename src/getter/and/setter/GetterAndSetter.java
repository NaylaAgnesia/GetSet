package getter.and.setter;

class data{
public int intPublic;
private int intPrivate;
private double doublePrivate;

public data(){
    this.intPublic= 0;
    this.intPrivate= 10; 
}
void display(){
    System.out.println(this.intPublic);
    System.out.println(this.intPrivate);
    System.out.println(this.doublePrivate);
}
//GETTER
public int getIntPrivate(){
    return this.intPrivate;
}

//SETTER
public void setDoublePrivate(double value){
    this.doublePrivate= value;
}
}

class lingkaran{
    private double diameter;
    
    lingkaran(double diameter){
    this.diameter= diameter;
    }
    
    //SETTER
    public void setJari2(double jari2){
        this.diameter= jari2*2;
    }
    
    //GETTER
    public double getJari2(){
        return this.diameter/2;
    }
    
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}

public class GetterAndSetter {
     
    public static void main(String[] args) {
    data object= new data();
    
    //public
        object.intPublic= 5;//write
        System.out.println("Public: " + object.intPublic);//read
    
    //private (read only(GETTER))
    int angka= object.getIntPrivate();
    System.out.println("Getter: "+ angka);
     
    //private (write only(SETTER)) 
    object.setDoublePrivate(0.05);
  
    // gabungkan write and read only dengan setter dan getter 
    lingkaran object2= new lingkaran(8);
        System.out.println("Jari-jari: "+ object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari-jari: "+ object2.getJari2());
        object2.getLuas();
        System.out.println("Luas: "+ object2.getLuas());
    }  
}
