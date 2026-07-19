package Arrays;

import com.sun.corba.se.spi.monitoring.MonitoredAttributeInfo;
import javafx.scene.effect.ImageInput;

public class DSA15_AtomorphicNumber {
    public static void main(String[] args) {
        int n = 25;
        int sqrt = n*n;

        String nm1 = ""+n;
        String nm2 = ""+sqrt;
        if(nm2.lastIndexOf(nm1) != -1) System.out.println("atomorphic yes");
        else  System.out.println("atomorphic no");
    }
}
