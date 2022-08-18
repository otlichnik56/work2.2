public class Hogwarts {
    private String name;
    private int powerMagic;
    private int speedTrangress;

    public Hogwarts(String name, int powerMagic, int speedTrangress) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.speedTrangress = speedTrangress;
    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getSpeedTrangress() {
        return speedTrangress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public void setSpeedTrangress(int speedTrangress) {
        this.speedTrangress = speedTrangress;
    }

    public static void compare(Hogwarts person1, Hogwarts person2) {
        if ((person1.powerMagic + person1.speedTrangress) > (person2.powerMagic + person2.speedTrangress)) {
            System.out.println(person1.name + " обладает большей мощностью магии, чем " + person2.name);
        } else {
            System.out.println(person2.name + " обладает большей мощностью магии, чем " + person1.name);
           }
    }


}


