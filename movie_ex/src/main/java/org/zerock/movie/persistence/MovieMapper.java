package org.zerock.movie.persistence;

import java.util.List;

import org.zerock.movie.domain.MovieVO;

public interface MovieMapper {	
	
	
	public List<MovieVO> movieList();
	public MovieVO movieDetail(MovieVO vo);



	
	
	

}
