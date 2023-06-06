package com.folder.app.contoller;

import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;
import com.folder.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8800")
@RestController
public class DataController {

    @GetMapping("/")
    public String home() {
        return "Data 준비 중..";
    }

    @GetMapping("/api")
    public String api() {
        return "Api Data 준비 중..";
    }

    @Autowired
    UserService userService;

    //Select
    @PostMapping("/findAll")
    public ResultDTO findAll() {
        return userService.findAll();
    }

    //Update
    @PostMapping("/editById")
    public ResultDTO editById(@RequestBody UserDTO userDTO) {
        System.out.println(userDTO);
        return userService.editById(userDTO);
    }

    //Delete
    @DeleteMapping("/delete")
    public ResultDTO delete(@RequestParam("no") int no) {
        return userService.delete(no);
    }

    //Save
    @PutMapping("/save")
    public ResultDTO save(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }
}
