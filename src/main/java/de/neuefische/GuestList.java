package de.neuefische;

import java.util.Objects;

public class GuestList {
    //Attribute
    private String guest;

    private String [] guestList;


    //Methoden

    public String [] setGuests (){
       return null;
    }


    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }
//Constructor empty
    public GuestList() {
    }
//Constructor
    public GuestList(String guest) {
        this.guest = guest;
    }
//ToString
    @Override
    public String toString() {
        return "GuestList{" +
                "guest='" + guest + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuestList guestList = (GuestList) o;
        return Objects.equals(guest, guestList.guest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guest);
    }
}
