package models;

import javax.swing.*;
import java.util.List;

public class Movie {
    private String title;
    private Director director;
    private List<Actor> listOfActors;

    public Movie(String title, Director director, List<Actor> listOfActors) {
        this.title = title;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
    private String printActorsInARow() {
        var actorInARow = new StringBuilder();
        String separator = "";
        for (Actor listOfActor : listOfActors) {
            actorInARow.append(separator + listOfActor + "");
            separator = ", ";
        }
        return actorInARow.toString();
    }

}
