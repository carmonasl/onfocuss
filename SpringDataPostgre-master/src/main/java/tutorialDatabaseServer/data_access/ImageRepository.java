package tutorialDatabaseServer.data_access;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tutorialDatabaseServer.domain.Image;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
    List<Image> findByTutorial(Long tutorialId);
    Image save(Image image);
}
