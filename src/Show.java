import java.util.ArrayList;

public class Show {

    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void showListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addNewActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Такой актер уже есть в списке");
        } else {
            listOfActors.add(actor);
            System.out.println("Актер " + actor + " успешно добавлен в список");
        }
    }

    public void changeActor(Actor newActor, String surnameOldActor) {
        int index = -1;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameOldActor)) {
                index = i;
                break;
            }
        } if (index != -1) {
            Actor oldActor = listOfActors.get(index);
            listOfActors.set(index, newActor);
            System.out.println("Актер " + newActor.getName() + " " + newActor.getSurname() +
                    " добавлен в список вместо актера " + oldActor.getName() + " " + oldActor.getSurname());
        } else {
            System.out.println("Актера с фамилией " + surnameOldActor + " нет в списке, невозможно заменить");
        }
    }
}
