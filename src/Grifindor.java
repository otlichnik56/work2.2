import java.sql.SQLOutput;

public class Grifindor extends Hogwarts{
      private int nobility;
      private int  honor;
      private int  courage;

      public Grifindor(String name, int powerMagic, int speedTrangress, int nobility, int honor, int courage) {
            super(name, powerMagic, speedTrangress);
            this.nobility = nobility;
            this.honor = honor;
            this.courage = courage;
      }

      public int getNobility() {
            return nobility;
      }

      public void setNobility(int nobility) {
            this.nobility = nobility;
      }

      public int getHonor() {
            return honor;
      }

      public void setHonor(int honor) {
            this.honor = honor;
      }

      public int getCourage() {
            return courage;
      }

      public void setCourage(int courage) {
            this.courage = courage;
      }

      public static void compare(Grifindor person1, Grifindor person2) {
            if ((person1.nobility + person1.honor + person1.courage) > (person2.nobility + person2.honor + person2.courage)) {
                  System.out.println(person1.getName() + " лучший Гриффиндорец, чем " + person2.getName());
            } else {
                  System.out.println(person2.getName() + " лучший Гриффиндорец, чем " + person1.getName());
            }
      }

      public static void print(Grifindor[] grifindors) {
            System.out.println("Список студентов факультете Грифиндор");
            for (int i = 0; i < grifindors.length; i++) {
                  Grifindor grifindor = grifindors[i];
                  System.out.println(i+1 + " Имя: " + grifindor.getName() +
                          " мощность магии:" + grifindor.getPowerMagic() +
                          " скорость трансргессии:" + grifindor.getSpeedTrangress() +
                          " благородство:" + grifindor.nobility +
                          " честь:" + grifindor.honor +
                          " храбрость:" + grifindor.courage);
            }
            System.out.println();
      }

}
