package com.folder.app.dao;

import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;
import com.folder.app.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserDTO> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int editById(UserDTO userDTO) {
        return userMapper.editById(userDTO);
    }

    @Override
    public int delete(int no) {
        return userMapper.delete(no);
    }

    @Override
    public ResultDTO save(UserDTO userDTO) {
        ResultDTO result = new ResultDTO();
        int state = userMapper.save(userDTO);

        if(state == 1) {
            System.out.println(userDTO);
            result.setState(true);
            result.setResult(userDTO);
        } else {
            result.setState(false);
        }
        return result;
    }
}
