package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.mobel.BoardVo;
import com.example.service.BoardService;

@RestController
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	/**
	 * Root Path mapping 
	 * @return
	 */
	@RequestMapping(value="/")
	public ModelAndView mainView(){
		return boardList();
	}
	/**
	 * Move Board List Page 
	 * @return
	 */
	@RequestMapping(value="/boards/list", method=RequestMethod.GET)
	public ModelAndView boardList(){
		List<BoardVo> list = boardService.selectBoardList();
		return new ModelAndView("BoardList", "list",list);
	}
	/**
	 * Move Board Write Page
	 * @return
	 */
	@RequestMapping(value="/boards/write", method=RequestMethod.GET)
	public ModelAndView boardWrite(){
		return new ModelAndView("BoardWrite");
	}
	/**
	 * Move Board View Page
	 * @return
	 */
	@RequestMapping(value="/boards/view", method=RequestMethod.GET)
	public ModelAndView boardView(){
		return new ModelAndView("BoardView");
	}
	/**
	 * Move Board Update Page
	 * @return
	 */
	@RequestMapping(value="/boards/update", method=RequestMethod.GET)
	public ModelAndView boardUpdate(){
		return new ModelAndView("BoardUpdate");
	}
	
	
	//list
	@RequestMapping(value="/boards", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<BoardVo> getBboardList(){
		return boardService.selectBoardList();
	}
	//view
	@RequestMapping(value="/boards/{srno}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_UTF8_VALUE , consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public BoardVo BoardView(@PathVariable String srno){
		return boardService.getBoard(srno);
	}
	//insert
	@RequestMapping(value="/boards", method=RequestMethod.POST/*, produces=MediaType.APPLICATION_JSON_UTF8_VALUE, consumes=MediaType.APPLICATION_JSON_UTF8_VALUE */)
	public int insertBoard(@RequestBody BoardVo vo){
		return boardService.insertBoard(vo);
	}
	
	//update
	@RequestMapping(value="/boards", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int updateBoard(@RequestBody BoardVo vo){
		return boardService.updateBoard(vo);
	}
	
	//delete
	@RequestMapping(value="/boards/{srno}", method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public int deleteBoard(@PathVariable String srno){
		return boardService.deleteBoard(srno);
	}
}
