import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Алексей", "Кошкин", Gender.MALE, 183);
        Actor actor2 = new Actor("Иван", "Пёскин", Gender.MALE, 190);
        Actor actor3 = new Actor("Валерия", "Птичкина", Gender.FEMALE, 170);

        Director director1 = new Director("Олеся", "Минская", Gender.FEMALE, 2);
        Director director2 = new Director("Алиса", "Питерская", Gender.FEMALE, 5);

        Person musicAuthor = new Person("Вольфганг", "Моцарт", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show show = new Show("Чай с бергамотом", 120, director1, new ArrayList<>());
        Opera opera = new Opera("Полет шмеля", 80, director2, new ArrayList<>(), musicAuthor,
                "Шмель влюбился в розу. Летает вокруг, жужжит, роза не отвечает. " +
                        "В финале выясняется, что роза — искусственная.",
                3);
        Ballet ballet = new Ballet("Танец маленьких утконосов", 90, director2,
                new ArrayList<>(), musicAuthor,
                "Утконосы просыпаются весной, учатся плавать и искать червячков. " +
                        "Всё заканчивается общим танцем на водной глади.",
                choreographer);

        System.out.println("Добавляем актеров в списки:");
        show.addNewActor(actor1);
        show.addNewActor(actor2);
        opera.addNewActor(actor2);
        ballet.addNewActor(actor3);

        System.out.println("Список актеров спектакля:");
        show.showListOfActors();
        System.out.println("Список актеров оперы:");
        opera.showListOfActors();
        System.out.println("Список актеров балета:");
        ballet.showListOfActors();

        System.out.println("Замена актера оперы на существующего актера:");
        opera.changeActor(actor1, "Пёскин");
        System.out.println("Обновленный список актеров оперы:");
        opera.showListOfActors();

        System.out.println("Замена актера спектакля на несуществующего актера:");
        show.changeActor(actor3, "Мышкин");
        show.showListOfActors();

        System.out.println("Либретто оперы и балета:");
        opera.showLibrettoText();
        ballet.showLibrettoText();
    }
}
