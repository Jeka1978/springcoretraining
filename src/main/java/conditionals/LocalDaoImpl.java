package conditionals;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@Repository
@ConditionalOnProd
public class LocalDaoImpl implements Dao {
    @Override
    public void save() {
        System.out.println("saving to Mongo...");
    }
}
