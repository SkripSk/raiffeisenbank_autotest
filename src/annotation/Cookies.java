package annotation;

@ControlledObject(name = "bisc")
public class Cookies {

    @ControlledObject(name = "Color", def = 1)
    public String color;

    @StartObject
    public void createCookie(){

    }

    @StartObject
    public void stopCookie(){

    }

    public void setColor(String color) {
        this.color = color;
    }
}
