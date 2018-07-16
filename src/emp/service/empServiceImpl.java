package emp.service;

import static fw.DBUtil.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.ConfigurationException;

import emp.dao.empDAO;
import emp.dao.empDAOImpl;
import emp.dto.empDTO;

public class empServiceImpl implements empService {

	@Override
	public int insert(empDTO dto) {
		int result = 0;
		empDAO dao = new empDAOImpl();
		Connection con = null;
		try {
			con = getConnect();
			result = dao.insert(dto, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Close(con);
		}
		
		return result;
	}

	@Override
	public ArrayList<empDTO> getMemberList() {
		ArrayList<empDTO> emplist = null;
		Connection con = null;
		empDAO dao = new empDAOImpl();
		con = getConnect();
		
		try {
			emplist = dao.getMemberList(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Close(con);
		}
		return emplist;
	}

	@Override
	public int delete(String id) {
		int result = 0;
		empDAO dao = new empDAOImpl();
		Connection con = null;
		try {
			con = getConnect();
			result = dao.delete(id, con);
			System.out.println("서비스"+result);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Close(con);
		}
		
		return result;
	}


	@Override
	public empDTO read(String id) {
		empDTO dto = null;
		Connection con = null;
		empDAO dao = new empDAOImpl();
		con = getConnect();
		try {
			dto = dao.read(id, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Close(con);
		}
		return dto;
	}

	@Override
	public ArrayList<empDTO> Search(String column, String search) {
		ArrayList<empDTO> dtolist = null;
		Connection con = null;
		empDAO dao = new empDAOImpl();
		try {
			con= getConnect();
			dtolist = dao.Search(column, search, con);
			System.out.println("서비스"+column+search);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Close(con);
		}
		return dtolist;
	}

	@Override
	public int update(empDTO dto) {
		int result = 0;
		Connection con = null;
		empDAO dao = new empDAOImpl();
		System.out.println("서비스"+dto.toString());
		try {
			con = getConnect();
			dao.update(dto, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Close(con);
		}
		return result;
	}
	
}
