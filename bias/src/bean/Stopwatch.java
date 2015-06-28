package bean;

public class Stopwatch {
	
static long start;		

    public static long start() {
        start = System.currentTimeMillis();
        
        return start;
    } 

    // return time (in seconds) since this object was created
    public static double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    } 


}
