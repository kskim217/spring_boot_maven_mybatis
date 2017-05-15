package com.example.service;

import java.util.List;

import com.example.mobel.BoardVo;

public interface BoardService {

	public List<BoardVo> selectBoardList();
	public int insertBoard(BoardVo vo);
	public int updateBoard(BoardVo vo);
	public int deleteBoard(String srno);
	public BoardVo getBoard(String srno); 
}
