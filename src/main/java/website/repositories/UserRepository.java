package website.repositories;

/* Stores the list of User entities */
import org.springframework.data.repository.CrudRepository;
import website.objects.User;

public interface UserRepository extends CrudRepository<User, Long> {
User findByUsername(String username);
}

