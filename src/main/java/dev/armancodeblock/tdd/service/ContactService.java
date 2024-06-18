package dev.armancodeblock.tdd.service;

import dev.armancodeblock.tdd.model.Person;
import dev.armancodeblock.tdd.repository.ContactRepository;



public class ContactService {

    ContactRepository contactRepository;

    public Person retrieve(Integer id){

        return contactRepository.findById(id).get();
    }

    public Person save(Person person){

        return contactRepository.save(person);
    }

    public void deletePersonById(Integer id){
        contactRepository.deleteById(id);
    }

    public Person updatePersonById(Integer id, Person person){
        // Retrieve the existing person
        Person existingPerson = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found"));

        // Update the fields of the existing person
        existingPerson.setName(person.getName());
        existingPerson.setMobile(person.getMobile());

        // Save the updated person back to the repository
        return contactRepository.save(existingPerson);
    }

}
