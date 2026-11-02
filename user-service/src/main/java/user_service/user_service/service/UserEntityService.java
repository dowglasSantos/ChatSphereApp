package user_service.user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user_service.user_service.dto.RequestUserEntityDTO;
import user_service.user_service.entity.UserEntity;
import user_service.user_service.repository.UserEntityRepository;

import java.util.List;

@Service
public class UserEntityService {
    @Autowired
    UserEntityRepository userEntityRepository;

    public RequestUserEntityDTO create(RequestUserEntityDTO user) {
        if(userEntityRepository.findByEmail(user.email())) {
            throw new IllegalArgumentException("Email já cadastrado!!");
        }


        return null;
    }

    public RequestUserEntityDTO delete(String id) {
        return null;
    }

    public RequestUserEntityDTO update(RequestUserEntityDTO user) {
        return null;
    }

    public List<UserEntity> list() {
        return null;
    }
}
