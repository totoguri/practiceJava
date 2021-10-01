
// **** Start of Sams teach yourself Java in 21 Days, 7th Edition ****
// 1, Oct 2021

class MarsRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature() {
        if(temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
}




















