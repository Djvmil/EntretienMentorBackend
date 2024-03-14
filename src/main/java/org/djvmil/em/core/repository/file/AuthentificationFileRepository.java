package org.djvmil.em.core.repository.file;

import org.djvmil.em.core.entity.User;
import org.djvmil.em.core.repository.IAuthentificationRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Repository
//@Component
public class AuthentificationFileRepository implements IAuthentificationRepository {
/*
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
    public User register(User user){
        FileWriter fWriter = null;
        try{
            fWriter = new FileWriter(filePath, true);
            fWriter.write(user.formatToDB());
        }catch (Exception e){
            e.printStackTrace();

            return user;
        }finally {
            try{
                if (fWriter != null)
                    fWriter.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return user;
    }

    @Override
    public List<User> list() {

        List<User> users=new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            for(String line; (line = br.readLine()) != null; ) {
                final User user=new User();
                final String[] allProperties = line.split("\\;");
                user.setId(Long.parseLong(allProperties[0]));
                user.setRole(allProperties[1]);
                user.setGenre(allProperties[2]);
                user.setCountry(allProperties[3]);
                user.setPhoneNumber(allProperties[4]);
                user.setEmail(allProperties[5]);
                user.setPasswors(allProperties[6]);
                user.setBirthDate(allProperties[7]);
                users.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("A movie from the file does not have a proper id");
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User getById(Long userId) {
        final User user = new User();
        user.setId(userId);
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            for(String line; (line = br.readLine()) != null; ) {

                final String[] allProperties = line.split("\\;");
                final long nextMovieId=Long.parseLong(allProperties[0]);
                if (nextMovieId==userId) {
                    user.setId(Long.parseLong(allProperties[0]));
                    user.setRole(allProperties[1]);
                    user.setGenre(allProperties[2]);
                    user.setCountry(allProperties[3]);
                    user.setPhoneNumber(allProperties[4]);
                    user.setEmail(allProperties[5]);
                    user.setPasswors(allProperties[6]);
                    user.setBirthDate(allProperties[7]);
                    return user;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("A movie from the file does not have a proper id");
            e.printStackTrace();
        }
        user.setFirstname("UNKNOWN");
        user.setLastname("UNKNOWN");
        user.setEmail("UNKNOWN");
        return user;
    }*/

    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
