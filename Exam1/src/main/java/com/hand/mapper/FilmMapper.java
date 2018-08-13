package com.hand.mapper;

import com.hand.model.Film;

import java.util.List;

public interface FilmMapper {
    int deleteByPrimaryKey(Short filmId);

    int insert(Film record);

    int insertSelective(Film record);

    Film selectByPrimaryKey(Short filmId);

    int updateByPrimaryKeySelective(Film record);

    int updateByPrimaryKeyWithBLOBs(Film record);

    int updateByPrimaryKey(Film record);

    //返回查询列表
    List<Film> selectAllFilm();

}