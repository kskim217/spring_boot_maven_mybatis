package com.example.mapper.impl;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mapper.BoardMapper;
import com.example.mobel.BoardVo;

@Repository
public class BoardMapperImpl implements BoardMapper {
	@Autowired
    protected SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<BoardVo> selectBoardList(){
		List<? extends Object> list = sqlSessionTemplate.selectList("boardmapper.selectBoardList");
		return (List<BoardVo>) list;
	}
	@Override
	public int insertBoard(BoardVo vo){
		return (int)  sqlSessionTemplate.insert("boardmapper.insertBoard",vo);
	}
	@Override
	public int updateBoard(BoardVo vo){
		return (int)  sqlSessionTemplate.update("boardmapper.updateBoard", vo);
	}
	@Override
	public int deleteBoard(String srno){
		return (int)  sqlSessionTemplate.delete("boardmapper.deleteBoard", srno);
	}
	@Override
	public BoardVo getBoard(String srno) {
		return (BoardVo) sqlSessionTemplate.selectOne("boardmapper.getBoard", srno);
	}
}
