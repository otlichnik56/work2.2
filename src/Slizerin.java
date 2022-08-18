public class Slizerin extends Hogwarts{
    private int cunning;
    private int  determination;
    private int  ambition;
    private int  resourcefulness;
    private int  lustForPower;

    public Slizerin(String name, int powerMagic, int speedTrangress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerMagic, speedTrangress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public static void compare(Slizerin person1, Slizerin person2) {
        if ((person1.cunning + person1.determination + person1.ambition + person1.resourcefulness + person1.lustForPower) > (person2.cunning + person2.determination + person2.ambition + person2.resourcefulness + person2.lustForPower)) {
            System.out.println(person1.getName() + " лучший Слизеринец, чем " + person2.getName());
        } else {
            System.out.println(person2.getName() + " лучший Слизеринец, чем " + person1.getName());
        }
    }

    public static void print(Slizerin[] slizerins) {
        System.out.println("Список студентов факультета Слизерин");
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println(i+1 + " Имя: " + slizerin.getName() +
                    " мощность магии:" + slizerin.getPowerMagic() +
                    " скорость трансргессии:" + slizerin.getSpeedTrangress() +
                    " хитрость:" + slizerin.cunning +
                    " решительность:" + slizerin.determination +
                    " амбициозность:" + slizerin.ambition +
                            " нахлдчивость:" + slizerin.resourcefulness +
                            " жажда власти:" + slizerin.lustForPower
                    );
        }
        System.out.println();
    }
}
