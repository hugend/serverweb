package emp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import emp.dto.empDTO;
import static fw.empQuery.*;
import static fw.DBUtil.*;

public class empDAOImpl implements empDAO{

	@Override
	public int insert(empDTO dto, Connection con) throws SQLException {
		int result = 0;
		PreparedStatement ptmt = null;
		ptmt = con.prepareStatement(EMP_INSERT);
		
		ptmt.setString(1, dto.getId());
		ptmt.setString(2, dto.getPass());
		ptmt.setString(3, dto.getName());
		ptmt.setString(4, dto.getAddr());
		ptmt.setString(5, dto.getGrade());
		ptmt.setInt(6, dto.getPoint());
		ptmt.setString(7, dto.getDeptno());
		result = ptmt.executeUpdate();
		
		Close(ptmt);
		return result;
	}

	@Override
	public ArrayList<empDTO> getMemberList(Connection con) throws SQLException {
		ArrayList<empDTO> emplist = new ArrayList<empDTO>();
		empDTO dto = null;
		PreparedStatement ptmt = null;
		ptmt = con.prepareStatement(EMP_SELECT);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			dto = new empDTO(rs.getString(1), rs.getString(2), 
					rs.getString(3), rs.getString(4), rs.getDate(5), 
					rs.getString(6), rs.getInt(7), rs.getString(8));
			emplist.add(dto);			
		}
		
		Close(rs);
		Close(ptmt);
		
		return emplist;
	}

	@Override
	public int delete(String id, Connection con) throws SQLException {
		int result = 0;
		PreparedStatement ptmt= null;
		ptmt = con.prepareStatement(EMP_DELETE);
		ptmt.setString(1, id);
		result = ptmt.executeUpdate();
		System.out.println(id);
		System.out.println(result+"dao");
		Close(ptmt);
		
		return result;
	}

	@Override
	public empDTO read(String id, Connection con) throws SQLException {
		empDTO dto = null;
		PreparedStatement ptmt = null;
		ptmt = con.prepareStatement(EMP_READ);
		ptmt.setString(1, id);
		ResultSet rs = ptmt.executeQuery();
		if(rs.next()){
			dto = new empDTO(rs.getString(1), rs.getString(2), 
					rs.getString(3), rs.getString(4), rs.getDate(5), 
					rs.getString(6), rs.getInt(7), rs.getString(8));
		}
		
		Close(rs);
		Close(ptmt);
		return dto;
	}

	@Override
	public ArrayList<empDTO> Search(String column, String search,
			Connection con) throws SQLException {
		ArrayList<empDTO> dtolist = new ArrayList<empDTO>();
		empDTO dto = null;
		PreparedStatement ptmt = null;
		System.out.println("dao"+column+search);
		if(column.equals("name")){
			ptmt = con.prepareStatement(EMP_SEARCH_NAME);
		}else if(column.equals("id")){
			ptmt = con.prepareStatement(EMP_SEARCH_ID);
		}else if(column.equals("addr")){
			ptmt = con.prepareStatement(EMP_SEARCH_ADDR);
		}
		ptmt.setString(1, search);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			dto = new empDTO(rs.getString(1), rs.getString(2), 
					rs.getString(3), rs.getString(4), rs.getDate(5), 
					rs.getString(6), rs.getInt(7), rs.getString(8));
			dtolist.add(dto);
		}
		return dtolist;
	}

	@Override
	public int update(empDTO dto, Connection con) throws SQLException {
		int result = 0;
		PreparedStatement ptmt = null;
		System.out.println("DAO"+dto.toString());
		ptmt = con.prepareStatement(EMP_UPDATE);
		ptmt.setString(1, dto.getAddr());
		ptmt.setString(2, dto.getGrade());
		ptmt.setInt(3, dto.getPoint());
		ptmt.setString(4, dto.getId());
		
		result = ptmt.executeUpdate();
		return result;
	}

}
