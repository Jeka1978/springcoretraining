package conditionals;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
public class Prod implements Dao {
    @Override
    public void save() {
        System.out.println("saving to Oracle...");
    }
}
