package emp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import emp.dto.empDTO;

public interface empService {
	int insert(empDTO dto);
	ArrayList<empDTO> getMemberList();
	int delete(String id);
	empDTO read(String id);
	ArrayList<empDTO> Search(String column, String search);
	int update(empDTO dto);
	empDTO login(String id, String pass);
	int insert(String deptno, String name, String id, String pass, String addr, int point, String grade);
	ArrayList<empDTO> getemplist(String col, String value, String pass);
}
