package tutorialDatabaseServer.data_access;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tutorialDatabaseServer.domain.Tutorial;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
    List<Tutorial> findAll();
    List<Tutorial> findByUri(String uri);
    Tutorial save(Tutorial tutorial);
}
