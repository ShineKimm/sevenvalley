package sevenvalley.sevenvalleyspring.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import sevenvalley.sevenvalleyspring.common.dao.AbstractDAO;

@Repository
public class SampleDAO extends AbstractDAO {
	
	@SuppressWarnings("unchecked")
	public List<HashMap<String, Object>> selectTest(Map<String, Object> params) {
		
		List<HashMap<String, Object>> list = selectList("sample.selectTest", params);

		return list;
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> AdminDoLogin(HashMap<String, Object> params) {
		HashMap<String, Object> hMap = new HashMap<String, Object>();
		int cnt = selectCnt("sample.selectTest", params);
		hMap.put("cnt",cnt);
		return hMap;
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> adminList(HashMap<String, Object> params) {
		List<HashMap<String, Object>> resultList = selectList("sample.adminList",params);
		params.put("resultList", resultList);
		return params;
	}
}
