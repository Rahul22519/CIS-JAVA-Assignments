package Assignment6;

public class TrafficLight {
    private String trafficLightColor;
    private int trafficLightDuration;

    public TrafficLight(String color, int duration){
        this.trafficLightColor = color;
        this.trafficLightDuration = duration;
    }

    public String getTrafficLightColor() {
        return trafficLightColor;
    }

    public void setTrafficLightColor(String trafficLightColor) {
        this.trafficLightColor = trafficLightColor;
    }

    public int getTrafficLightDuration() {
        return trafficLightDuration;
    }

    public void setTrafficLightDuration(int trafficLightDuration) {
        this.trafficLightDuration = trafficLightDuration;
    }

    public void changeColor(String newColor){
        System.out.println("Traffic Light is Changing to color:" +newColor);
        setTrafficLightColor(newColor);
    }

    public boolean isRed(){
        return getTrafficLightColor().equalsIgnoreCase("red");
    }

    public boolean isGreen(){
        return getTrafficLightColor().equalsIgnoreCase("green");
    }
    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight("Red",10);

        System.out.println("Current Traffic Light:");
        System.out.println("Color: " + trafficLight.getTrafficLightColor());
        System.out.println("Duration: " + trafficLight.getTrafficLightDuration() + " seconds");

        trafficLight.changeColor("green");

        System.out.println("Traffic Light color changed to:");
        System.out.println("Color: " + trafficLight.getTrafficLightColor());
        System.out.println("Duration: " + trafficLight.getTrafficLightDuration() + " seconds");

        System.out.println("\nChecking Traffic Light Status:");
        System.out.println("Is Red? " + trafficLight.isRed());
        System.out.println("Is Green? " + trafficLight.isGreen());

    }
}
