package tr.com.turkcellteknoloji.demo.ndk;

public class ExponentialWrapper {

	// Load library
    static {
        System.loadLibrary("exponential");
    }
	
	public static native int exponential(int number, int power);
	
}
