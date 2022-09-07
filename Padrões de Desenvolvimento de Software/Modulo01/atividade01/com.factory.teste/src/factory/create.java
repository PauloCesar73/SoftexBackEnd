package factory;

public class create {
	public static Computer getpcs(String tipo){

	        if (tipo == "pc") {
	            return new Pcpc();
	        } else {
	            return new Pcserver();
	        }
	    }
}
