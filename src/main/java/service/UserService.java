package service;
import model.User;
import repository.UserRepository;

import java.util.UUID;
import java.util.list;
import java.util.UUID;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public User addUser{User request}{
        request.setid{
            UUID.randomUUID().toString();
            return userRepository.save(request);
        }
    }

    public getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(String id){
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(String id. User request){
        User existinguser = userRepository.findById(id).orElse(null);
        if (existinguser != null){
            existinguser.setName(request.getName());
            existinguser.setNIM(request.getNIM());
            return userRepository.save(existinguser);
        }
        return null;
    }

    public void deleteUser(String id){
        userRepository.deleteById(id)
    }
}
