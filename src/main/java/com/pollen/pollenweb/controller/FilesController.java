package com.pollen.pollenweb.controller;


import com.pollen.pollenweb.entity.Files;
import com.pollen.pollenweb.service.FilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author admin
 * @since 2022-01-28
 */
@RestController
@RequestMapping("/files")
public class FilesController {
    @Autowired
    private FilesService filesService;

    @RequestMapping("/filelist")
    public List<Files> getFileList(){
        return filesService.showAllFiles();
    }



}

