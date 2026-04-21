package Exercise2;
class Light {
    public void turnOn() { System.out.println("Light is bright!"); }
}

class Fan {
    public void spin() { System.out.println("Fan is rotating!"); }
}
public class deviceController {
    public void activate(Object device) {
        if (device instanceof Light) {
            ((Light) device).turnOn();
        } else if (device instanceof Fan) {
            ((Fan) device).spin();
        }
        //Dovete aggiungere airconditioner o altri device, come gestite questa cosa???
    }
}
