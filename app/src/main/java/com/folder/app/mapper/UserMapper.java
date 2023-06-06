package com.folder.app.mapper;

import com.folder.app.dto.UserDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user3")
    public List<UserDTO> findAll();

    @Update("UPDATE user3 SET name=#{name}, pwd=#{pwd}, gender=#{gender} WHERE no = #{no}")
    public int editById(UserDTO userDTO);

    @Update("UPDATE user3 SET del = true WHERE no = #{no}")
    public int delete(int no);

    @Insert("INSERT INTO user3 (name, email, pwd, gender) VALUE (#{name},#{email},#{pwd},#{gender})")
    public int save(UserDTO userDTO);
}
