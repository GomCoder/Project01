package com.folder.app.service;

import com.folder.app.dao.UserDao;
import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private ResultDTO resultDTO;

    @Autowired
    UserDao userDao;

    //사용자 정보 목록 가져오기
    @Override
    public ResultDTO findAll() {

        resultDTO = new ResultDTO();

        List<UserDTO> resultList = userDao.findAll();

        if(resultList != null) {
            resultDTO.setState(true);
            resultDTO.setResult(resultList);
        } else {
            resultDTO.setState(false);
        }

        return resultDTO;
    }

    //사용자 정보 수정하기
    @Override
    public ResultDTO editById(UserDTO userDTO) {
        resultDTO = new ResultDTO();
        int state = userDao.editById(userDTO);

        System.out.println(state);
        if(state == 1) {
            resultDTO.setState(true);
            resultDTO.setMessage("사용자의 정보 수정이 성공하였습니다.");
        } else {
            resultDTO.setState(false);
            resultDTO.setMessage("사용자의 정보 수정이 실패하였습니다.");
        }

        return resultDTO;
    }

    @Override
    public ResultDTO delete(int no) {
        resultDTO = new ResultDTO();

        int state = userDao.delete(no);

        if(state == 1) {
            resultDTO.setState(true);
            resultDTO.setMessage("사용자 삭제가 성공 하였습니다.");
        } else {
            resultDTO.setState(false);
            resultDTO.setMessage("사용자 삭제가 실패하였습니다.");
        }

        return resultDTO;
    }

    @Override
    public ResultDTO save(UserDTO userDTO) {

        resultDTO = new ResultDTO();

        resultDTO = userDao.save(userDTO);

        if(resultDTO.getState()) {
            //resultDTO.setState(true);
            resultDTO.setMessage("사용자 생성이 성공 하였습니다.");
        } else {
            //resultDTO.setState(false);
            resultDTO.setMessage("사용자 생성이 실패하였습니다.");
        }

        return resultDTO;

    }
}
