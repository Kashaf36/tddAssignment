package dev.armancodeblock.tdd.repository;


import dev.armancodeblock.tdd.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Person, Integer> {
}
