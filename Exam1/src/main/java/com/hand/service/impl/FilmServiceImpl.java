package com.hand.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.mapper.FilmMapper;
import com.hand.model.Film;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "FilmService")
public class FilmServiceImpl implements FilmService {
    @Autowired
    private FilmMapper filmMapper;

    @Override
    public int addFilm(Film film) {
        return filmMapper.insertSelective(film);
    }

    @Override
    public String upFilm(Film film) {
        filmMapper.updateByPrimaryKey(film);
        return "update success";
    }


    @Override
    public String deleFilm(short id) {
        filmMapper.deleteByPrimaryKey(id);
        return "delete success";
    }

    @Override
    public List<Film> findAllFilm(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return filmMapper.selectAllFilm();
    }
}
