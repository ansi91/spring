package mvc.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;

public class BoardDao {
	Logger logger = Logger.getLogger(BoardDao.class);
	public SqlSessionTemplate sqlSessionTemplate = null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}


	

	public List<Map<String, Object>> boardList() {
		logger.info("boardList 호출 성공");
		List<Map<String, Object>> bList = null;
		Map<String,Object> pmap = new HashMap<>();
		bList = sqlSessionTemplate.selectList("memberList",pmap);
		logger.info("bList:"+bList);
		return bList;
	}
	
}
