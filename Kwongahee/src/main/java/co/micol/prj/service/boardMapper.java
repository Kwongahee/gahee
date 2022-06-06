package co.micol.prj.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import co.micol.prj.vo.boardVO;

public interface boardMapper {
	List<boardVO> boardList(@Param("state") int state, @Param("key") String key);
	boardVO boardSelect(boardVO vo);
	int boardInsert(boardVO vo);
	int boardUpdate(boardVO vo);
	int boardDelete(boardVO vo);
	
	int boardHitUpdate(int id);
}
