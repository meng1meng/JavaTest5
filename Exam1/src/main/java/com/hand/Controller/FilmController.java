package com.hand.Controller;

import com.hand.model.Film;
import com.hand.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FilmController {
    @Autowired
    private FilmService filmService;

    @ResponseBody
    @RequestMapping(value = "/PUT", method = RequestMethod.PUT, produces = {"application/json;charset=UTF-8"})
    public int addFilm(Film film) {
        return filmService.addFilm(film);
    }

    @ResponseBody
    @RequestMapping(value = "/GET/{pageNum}/{pageSize}", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {

        return filmService.findAllFilm(pageNum, pageSize);
    }

    @ResponseBody
    @RequestMapping(value = "/POST", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public String upFilm(Film film) {

        return filmService.upFilm(film);
    }

    @ResponseBody
    @RequestMapping(value = "/DELETE", method = RequestMethod.DELETE)
    public String deleFilm(short id) {
        return filmService.deleFilm(id);
    }
}
