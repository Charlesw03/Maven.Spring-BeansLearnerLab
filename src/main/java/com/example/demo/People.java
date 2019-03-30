package com.example.demo;

import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> pList;

    public People(List<PersonType> pList) {
        this.pList = pList;
    }

    public void add(PersonType personType) {
        pList.add(personType);
    }

    public void remove(PersonType personType) {
        pList.remove(personType);
    }

    public void size() {
        pList.size();
    }

    public void clear() {
        pList.clear();
    }

    public void addAll(Iterable<PersonType> personTypes) {
        for (PersonType typesOfPerson : pList) {
            pList.add(typesOfPerson);
        }
    }

    public PersonType findById(Long id) {
        for (PersonType person : pList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }


    public List findAll(){

        return pList;
    }


    @Override
    public Iterator<PersonType> iterator() {
        return pList.iterator();
    }


}
