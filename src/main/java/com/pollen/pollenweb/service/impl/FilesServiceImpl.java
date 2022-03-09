package com.pollen.pollenweb.service.impl;

import com.pollen.pollenweb.entity.Files;
import com.pollen.pollenweb.mapper.FilesMapper;
import com.pollen.pollenweb.service.FilesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2022-01-28
 */
@Service
public class FilesServiceImpl extends ServiceImpl<FilesMapper, Files> implements FilesService {
    @Autowired
    private FilesMapper filesMapper;

    @Override
    public List<Files> showAllFiles() {
        return filesMapper.selectList(null);
    }
}
