package emp.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import emp.dto.empDTO;

public interface empDAO {
	int insert(empDTO dto, Connection con) throws SQLException;
	ArrayList<empDTO> getMemberList(Connection con) throws SQLException;
	int delete(String id, Connection con) throws SQLException;
	empDTO read(String id, Connection con)throws SQLException;
	ArrayList<empDTO> Search(String column, String search, Connection con) throws SQLException;
	int update(empDTO dto, Connection con)throws SQLException;
}
