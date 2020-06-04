package mvc.board;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class BoardController extends MultiActionController {
	Logger logger = Logger.getLogger(BoardController.class);
	public BoardLogic boardLogic = null;
	public void setBoardLogic(BoardLogic boardLogic) {
		this.boardLogic = boardLogic;
	}
	public ModelAndView boardList(HttpServletRequest req, HttpServletResponse res) {
		logger.info("boardList 호출");
		List<Map<String,Object>> bList = boardLogic.boardList();
		ModelAndView mav = new ModelAndView();
		// ==> /WEB-INF/jsp/board/?.jsp
		// ==> /WEB-INF/jsp/boardList.jsp.jsp
		//mav.setViewName("boardList");
		mav.setViewName("board/boardList");
		mav.addObject("bList", bList);
		return mav;
	}
	public void boardList2(HttpServletRequest req, HttpServletResponse res) {
		logger.info("boardList2 호출");
		try {
			res.sendRedirect("boardList.jsp");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
