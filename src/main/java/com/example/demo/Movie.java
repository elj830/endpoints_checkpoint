package com.example.demo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class Movie {

    private String Title;
    private int Minutes;
    private String Genre;
    private double Rating;
    private int Metascore;
    private String Description;
    private int Votes;
    private double Gross;
    private String year;
    private Credit[] credits;

    static class Credit {
        public Person getPerson() {
            return person;
        }

        public void setPerson(Person person) {
            this.person = person;
        }

        private Person person;

        static class Person {

            private String firstName;
            private String lastName;
            private String role;

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

        }

    }



    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getMinutes() {
        return Minutes;
    }

    public void setMinutes(int minutes) {
        Minutes = minutes;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getMetascore() {
        return Metascore;
    }

    public void setMetascore(int metascore) {
        Metascore = metascore;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getVotes() {
        return Votes;
    }

    public void setVotes(int votes) {
        Votes = votes;
    }

    public double getGross() {
        return Gross;
    }

    public void setGross(double gross) {
        Gross = gross;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Credit[] getCredits() {
        return credits;
    }

    public void setCredits(Credit[] credits) {
        this.credits = credits;
    }
    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }

}
