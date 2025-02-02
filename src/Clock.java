class Clock {

    // Default constructor
    public Clock() {
        // Initialize with default values, e.g., 0 for hours, minutes, and seconds
    }

    // Constructor with parameters to set hours, minutes, and seconds
    public Clock(int hour, int minute, int second) {
        // Initialize the fields with the provided values
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Fields to store hour, minute, and second
    private int hour;
    private int minute;
    private int second;

    // Method to increase the hour by 1
    public void increaseHr() {
        hour++;  // Increment hour
        if (hour >= 24) {  // If hour exceeds 23, reset to 0 (24-hour clock)
            hour = 0;
        }
    }

    // Method to display time (for testing purposes)
    public void displayTime() {
        System.out.println("Time: " + hour + ":" + minute + ":" + second);
    }

    // Override the toString method to return a meaningful string representation
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}