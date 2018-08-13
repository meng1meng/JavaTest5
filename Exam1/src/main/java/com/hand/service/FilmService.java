package com.hand.service;

import com.hand.model.Film;

import java.util.List;

public interface FilmService {

    //查询列表
    List<Film> findAllFilm(int pageNum, int pageSize);

    //添加
    int addFilm(Film film);

    //修改
    String upFilm(Film film);

    //删除
    String deleFilm(short id);
}
