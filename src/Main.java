public class Main {
    public static void main(String[] args) {

        Hogwarts[] students = {
                new Hogwarts("Гарри Поттер", 15, 8),
                new Hogwarts("Гермиона Грейнджер", 10, 7),
                new Hogwarts("Рон Уизли", 12, 10),
                new Hogwarts("Драко Малфой", 15, 8),
                new Hogwarts("Грэхэм Монтегю", 10, 7),
                new Hogwarts("Грегори Гойл", 12, 10),
                new Hogwarts("Захария Смит", 15, 8),
                new Hogwarts("Седрик Диггори", 10, 7),
                new Hogwarts("Джастин Финч-Флетчли", 12, 10),
                new Hogwarts("Чжоу Чанг", 15, 8),
                new Hogwarts("Падма Патил", 10, 7),
                new Hogwarts("Маркус Белби", 12, 10),
        };  // не знаю зачем заводил, но работает без этого массива

        Grifindor[] studentsGrifindor = {
                new Grifindor("Гарри Поттер", 15, 8, 15, 12, 18),
                new Grifindor("Гермиона Грейнджер", 10, 7, 14, 10, 15),
                new Grifindor("Рон Уизли", 12, 10, 13, 11, 16),
        };

        Slizerin[] studentsSlizerin = {
                new Slizerin("Драко Малфой", 10, 10, 10, 12, 13, 15, 16),
                new Slizerin("Грэхэм Монтегю", 8, 6, 3, 6, 9, 10, 15),
                new Slizerin("Грегори Гойл", 7, 3, 11, 7, 12, 6, 7),
        };

        Pufenduy[] studentsPufenduy = {
                new Pufenduy("Захария Смит", 8, 8, 12, 2, 7),
                new Pufenduy("Седрик Диггори", 11, 6, 10, 16, 4),
                new Pufenduy("Джастин Финч-Флетчли", 7, 10, 14, 3, 5),
        };

        Kogtevran[] studentsKogtevran = {
                new Kogtevran("Чжоу Чанг", 11, 5, 7, 8, 6, 4),
                new Kogtevran("Падма Патил", 9, 3, 4, 5, 3, 10),
                new Kogtevran("Маркус Белби", 8, 10, 12, 2, 4, 6),
        };

        Grifindor.print(studentsGrifindor);
        Slizerin.print(studentsSlizerin);
        Pufenduy.print(studentsPufenduy);
        Kogtevran.print(studentsKogtevran);


        Hogwarts.compare(studentsGrifindor[0], studentsSlizerin[0]);
        Grifindor.compare(studentsGrifindor[0], studentsGrifindor[2]);
        Slizerin.compare(studentsSlizerin[0], studentsSlizerin[1]);
        Pufenduy.compare(studentsPufenduy[0], studentsPufenduy[1]);
        Kogtevran.compare(studentsKogtevran[0], studentsKogtevran[1]);
    }
}