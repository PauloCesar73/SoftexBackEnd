package factory;

public interface Computer {
	Number getram(Number ram);
    Number gethdd(Number hdd);
    Number getcpu(double cpu);
    String gettype(String type);
    void tostring();
}
