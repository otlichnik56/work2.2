public class Pufenduy extends Hogwarts{
    private int hardWork;
    private int  loyalty;
    private int  honesty;

    public Pufenduy(String name, int powerMagic, int speedTrangress, int hardWork, int loyalty, int honesty) {
        super(name, powerMagic, speedTrangress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void compare(Pufenduy person1, Pufenduy person2) {
        if ((person1.hardWork + person1.loyalty + person1.honesty) > (person2.hardWork + person2.loyalty + person2.honesty)) {
            System.out.println(person1.getName() + " лучший Пуфендуец, чем " + person2.getName());
        } else {
            System.out.println(person2.getName() + " лучший Пуфендуец, чем " + person1.getName());
        }
    }

    public static void print(Pufenduy[] pufenduys) {
        System.out.println("Список студентов факультете Пуфендуй");
        for (int i = 0; i < pufenduys.length; i++) {
            Pufenduy pufenduy = pufenduys[i];
            System.out.println(i+1 + " Имя: " + pufenduy.getName() +
                    " мощность магии:" + pufenduy.getPowerMagic() +
                    " скорость трансргессии:" + pufenduy.getSpeedTrangress() +
                    " трудолюбие:" + pufenduy.hardWork +
                    " верность:" + pufenduy.loyalty +
                    " честность:" + pufenduy.honesty);
        }
        System.out.println();
    }
}
