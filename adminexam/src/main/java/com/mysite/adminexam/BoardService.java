package com.mysite.adminexam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	public void create(Board board) {
		// 객체를 생성하고 메소드를 통해 값 입력
		//Board board = new Board();
		//board.setTitle(title);
		//board.setContent(contnet);
		//ModelAttribute 사용 시 이미 객체가 만들어져 있어 객체 및 생성자 사용 x
		board.setDatetime(LocalDateTime.now());
		
		boardRepository.save(board);
	}
	// db에 있는 board 전체 갖고 오기
	public List<Board> readList(){
		return boardRepository.findAll();
	}
	
	public Board readdetail(Integer id) {
		//한개만 가져온다 !! optional
		Optional<Board> o=boardRepository.findById(id);
		
		return o.get(); 
	}
	public void delete(Integer id) {
		boardRepository.deleteById(id);
	}
	public void update(Board board) {
		boardRepository.save(board);
	}
	
}
