package HomeWork;

public class Airplane {
    private Wing wing;
    private Chassis chassis;
    private Engine engine;
    private FMS fms;

    public Airplane(Wing wing, Chassis chassis, Engine engine, FMS fms) {
        this.wing = wing;
        this.chassis = chassis;
        this.engine = engine;
        this.fms = fms;
    }

    public Wing getWing() {
        return wing;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void canFly() {
        if (this.engine.getOn() && this.chassis.getServiceable() && this.wing.getWork()) {
            System.out.println("Самолет в исправном состоянии и может лететь");
        } else System.out.println("Самолет неисправен, к вылету не готов");

    }

    public void navigator() {
        System.out.println("Заданный маршрут : " + this.fms.getRoute());
    }

}

class FMS {
    private String route;

    public FMS() {

    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }


}


class Wing {
    private boolean isWork;

    public Wing() {

    }

    public boolean getWork() {
        return isWork;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public void working() {
        if (this.isWork) {
            System.out.println("Крылья исправны, готовы к взлету");
        } else System.out.println("Крылья не исправны");
    }
}

class Chassis {
    private boolean isServiceable;

    public Chassis() {

    }

    public boolean getServiceable() {
        return isServiceable;
    }

    public void setServiceable(boolean serviceable) {
        isServiceable = serviceable;
    }

    public void isWork() {
        if (this.isServiceable) {
            System.out.println("Шасси готово к взлету");
        } else System.out.println("Шасси не в рабочем состоянии");
    }

}

class Engine {
    private Boolean isOn;

    public Engine() {
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public void isOn() {
        if (this.isOn) {
            System.out.println("Двигатель запущен!!!");
        } else {
            System.out.println("Двигатель не работает!!!");
        }
    }

}

class MainEx1 {
    public static void main(String[] args) {
        FMS fms = new FMS();
        Engine engine = new Engine();
        Chassis chassis = new Chassis();
        Wing wing = new Wing();
        Airplane airplane = new Airplane(wing, chassis, engine, fms);

        fms.setRoute("Германия");
        engine.setOn(true);
        chassis.setServiceable(true);
        wing.setWork(true);

        airplane.canFly();
        airplane.navigator();
    }

}

