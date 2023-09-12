package com.springboot.api.library.auth.models.dto.mapper;

import com.springboot.api.library.auth.models.dto.UserDTO;
import com.springboot.api.library.auth.models.entity.User;
import com.springboot.api.library.exceptions.NoDataFoundException;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public class UserMapper {

    private User user;

    public static UserMapper builder(){
        return new UserMapper();
    }

    public UserDTO build(){
        if(user == null){
        throw new NoDataFoundException("¡Debe pasar el entity user!");
        }
        return new UserDTO(this.user.getId(), user.getUsername());
    }


}
