package com.pollen.pollenweb.service;

import com.pollen.pollenweb.entity.ConvertedFiles;
import com.pollen.pollenweb.entity.Files;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author admin
 * @since 2022-01-28
 */
public interface FilesService extends IService<Files> {

    public List<Files> showAllFiles();

}
