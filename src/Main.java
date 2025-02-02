import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        // Create an array of Clock objects
        Clock[] clocks = new Clock[3];  // Declaring an array with 3 spots
        Arrays.fill(clocks, new Clock());  // Fill all spots with new Clock objects

        // Create an array of Clock objects with different initial values
        Clock[] clock2 = {new Clock(), new Clock(1, 2, 3), new Clock(2, 3, 4)};

        // Create specific Clock objects and assign them to an array
        Clock[] clocks3;
        Clock c1 = new Clock();
        Clock c2 = new Clock(8, 8, 8);
        Clock c3 = new Clock(9, 9, 9);
        clocks3 = new Clock[]{c1, c2, c3};

        // Test and display time from clocks[0]
        System.out.println("Before increasing hour: " + clocks[0]);
        clocks[0].increaseHr();  // Increase hour of the first clock
        System.out.println("After increasing hour: " + clocks[0]);
    }
}
