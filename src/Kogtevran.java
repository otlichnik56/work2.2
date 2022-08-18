public class Kogtevran extends Hogwarts{
    private int mind;
    private int  wisdom;
    private int  wit;
    private int  creativity;

    public Kogtevran(String name, int powerMagic, int speedTrangress, int mind, int wisdom, int wit, int creativity) {
        super(name, powerMagic, speedTrangress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public static void compare(Kogtevran person1, Kogtevran person2) {
        if ((person1.mind + person1.wisdom + person1.wit + person1.creativity) > (person2.mind + person2.wisdom + person2.wit + person2.creativity)) {
            System.out.println(person1.getName() + " лучший Коктевранец, чем " + person2.getName());
        } else {
            System.out.println(person2.getName() + " лучший Коктевранец, чем " + person1.getName());
        }
    }

    public static void print(Kogtevran[] kogtevrans) {
        System.out.println("Список студентов факультета Коктевран");
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println(i+1 + " Имя: " + kogtevran.getName() +
                    " мощность магии:" + kogtevran.getPowerMagic() +
                    " скорость трансргессии:" + kogtevran.getSpeedTrangress() +
                    " ум:" + kogtevran.mind +
                    " мудрость:" + kogtevran.wisdom +
                    " остроумие:" + kogtevran.wit +
                    " творчество:" + kogtevran.creativity );
        }
        System.out.println();
    }

}
