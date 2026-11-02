package user_service.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user_service.user_service.dto.RequestUserEntityDTO;
import user_service.user_service.entity.UserEntity;
import user_service.user_service.service.UserEntityService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserEntityController {
    @Autowired
    UserEntityService userEntityService;

    public ResponseEntity<RequestUserEntityDTO> create(RequestUserEntityDTO user) {
        return null;
    }

    public ResponseEntity<RequestUserEntityDTO> delete(String id) {
        return null;
    }

    public ResponseEntity<RequestUserEntityDTO> update(RequestUserEntityDTO user) {
        return null;
    }

    public List<UserEntity> list() {
        return null;
    }
}
