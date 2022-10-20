package ex1.lab3.IES.SpringBootDatabases;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByName(String name);
}