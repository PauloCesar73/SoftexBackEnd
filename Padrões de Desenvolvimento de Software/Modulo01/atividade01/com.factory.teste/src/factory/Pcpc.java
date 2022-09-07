package factory;

public class Pcpc implements Computer{

	public Number getram(Number ram){
		ram = 8;
	    return ram;
	}
	public Number gethdd(Number hdd){
		hdd = 240;
	    return hdd;
	}
	public Number getcpu(double cpu){
	    cpu = 4.0;
	    return cpu;
	}
	public String gettype(String type){
		type = "Pc";
	    return type;
	}
	public void tostring(){
		System.out.printf("Ram: %d GB, Hdd: %d GB, Cpu: %f, Tipo: %s.", this.getram(null), this.gethdd(null), this.getcpu(0), this.gettype(null) );
	}
}
