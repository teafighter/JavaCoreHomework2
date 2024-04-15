public class Main {
    public static void main(String[] args) {

//        Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
        Gryffindor potter = new Gryffindor("Гарри", "Поттер", 99, 99, 99, 99, 99);
        System.out.println(potter);
        Gryffindor granger = new Gryffindor("Гермиона", "Грейнджер");
        System.out.println(granger);
        Gryffindor weasley = new Gryffindor("Рон", "Уизли");
        System.out.println(weasley);
//        Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
        Slytherin malfoy = new Slytherin("Драко", "Малфой");
        System.out.println(malfoy);
        Slytherin montague = new Slytherin("Грэхем", "Монтегю");
        System.out.println(montague);
        Slytherin goyle = new Slytherin("Грегори", "Гойл");
        System.out.println(goyle);
//        На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
        Hufflepuff smith = new Hufflepuff("Захария", "Смит");
        System.out.println(smith);
        Hufflepuff diggory = new Hufflepuff("Седрик", "Диггори");
        System.out.println(diggory);
        Hufflepuff finchFletchley = new Hufflepuff("Джастин", "Финч-Флетчли");
        System.out.println(finchFletchley);
//        На факультете Когтевран учатся Чжоу Чанг, Падма Патил и Маркус Белби.
        Ravenclaw chang = new Ravenclaw("Чжоу", "Чанг");
        System.out.println(chang);
        Ravenclaw patil = new Ravenclaw("Падма", "Патил");
        System.out.println(patil);
        Ravenclaw belby = new Ravenclaw("Маркус", "Белби");
        System.out.println(belby);

        Gryffindor.compare(potter, granger);
        Gryffindor.compare(granger, potter);
        Gryffindor.compare(granger, weasley);

        Slytherin.compare(malfoy, goyle);
        Hufflepuff.compare(smith, diggory);
        Ravenclaw.compare(chang, patil);

        Hogwarts.compare(potter, malfoy);
        Hogwarts.compare(granger, weasley);
    }
}
