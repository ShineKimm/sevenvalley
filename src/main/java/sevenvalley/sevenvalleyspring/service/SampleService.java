package sevenvalley.sevenvalleyspring.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sevenvalley.sevenvalleyspring.dao.SampleDAO;

@Service
public class SampleService {
	
	SampleDAO sampleDAO;
	
	@Autowired
	public SampleService(SampleDAO sampleDAO) {
		this.sampleDAO = sampleDAO;
	}

	public List<HashMap<String, Object>> selectTest(Map<String, Object> params) {
		return sampleDAO.selectTest(params);
	}

	public Map<String, Object> adminDoLogin(HashMap<String, Object> params) {
		return sampleDAO.AdminDoLogin(params);
	}

	public Map<String, Object> adminList(HashMap<String, Object> params) {
		return sampleDAO.adminList(params);
	}
}
