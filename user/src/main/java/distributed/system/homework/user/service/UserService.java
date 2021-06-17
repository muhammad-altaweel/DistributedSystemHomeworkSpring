package distributed.system.homework.user.service;

import distributed.system.homework.user.entity.User;
import distributed.system.homework.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public User findUserById(Long userId) {
        return userRepository.findById(userId).get();
    }
}
