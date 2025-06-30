package com.springswagger.Service;
import com.springswagger.models.Person;
import com.springswagger.repositorys.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PersonService {
    private final PersonRepository repo;

    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public List<Person> getAll() {
        return repo.findAll();
    }

    public Optional<Person> getById(Long id) {
        return repo.findById(id);
    }

    public Person save(Person person) {
        return repo.save(person);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
