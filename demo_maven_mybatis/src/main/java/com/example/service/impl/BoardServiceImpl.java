package com.example.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.BoardMapper;
import com.example.mobel.BoardVo;
import com.example.service.BoardService;

@Service
@Transactional
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<BoardVo> selectBoardList(){
		return boardMapper.selectBoardList();
	}
	
	@Override
	public int insertBoard(BoardVo vo) {
		return boardMapper.insertBoard(vo);
	}
	@Override
	public int updateBoard(BoardVo vo) {
		return boardMapper.updateBoard(vo);
	}
	@Override
	public int deleteBoard(String srno) {
		return boardMapper.deleteBoard(srno);
	}

	@Override
	public BoardVo getBoard(String srno) {
		return boardMapper.getBoard(srno);
	}	
}
