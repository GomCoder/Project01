package com.folder.app.dao;

import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;

import java.util.List;

public interface UserDao {

    public List<UserDTO> findAll();
    public int editById(UserDTO userDTO);
    public int delete(int no);
    public ResultDTO save(UserDTO userDTO);

}
