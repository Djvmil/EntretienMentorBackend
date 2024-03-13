package org.djvmil.em.core.repository.file;

import org.djvmil.em.core.entity.User;
import org.djvmil.em.core.repository.IAuthentificationRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.FileWriter;
import java.util.List;

@Repository
//@Component
public class AuthentificationFileRepository implements IAuthentificationRepository {

    @Value("${repository.filePath}")
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public User login(String login, String password){
        User user = new User();



        return user;
    }

    @Override
    public Boolean register(User user){
        FileWriter fWriter = null;
        try{
            fWriter = new FileWriter(filePath, true);
            fWriter.write(user.formatToDB());
        }catch (Exception e){
            e.printStackTrace();

            return false;
        }finally {
            try{
                if (fWriter != null)
                    fWriter.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return true;
    }

    @Override
    public List<User> list() {
        User user = new User();
        user.setId(4325L);
        user.setFirstname("Mbaye");
        user.setLastname("Ndoye");
        user.setEmail("ndoye@em.fr");

        User user1 = new User();
        user1.setId(7725L);
        user1.setFirstname("Omar");
        user1.setLastname("Gaye");
        user1.setEmail("gaye@em.fr");

        User user2 = new User();
        user2.setId(9225L);
        user2.setFirstname("Djibril");
        user2.setLastname("Diop");
        user2.setEmail("diop@em.fr");

        return List.of(user, user1, user2);
    }

    @Override
    public User getById(Long userId) {
        User user = new User();
        user.setId(userId);
        user.setFirstname("Mbaye Detail");
        user.setLastname("Ndoye");
        user.setEmail("ndoye@em.fr");

        return user;
    }
}
