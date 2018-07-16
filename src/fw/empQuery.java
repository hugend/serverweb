package fw;
public class empQuery {
	public static final String EMP_INSERT
	="insert into kitriemp values( ?, ?, ?, ?, sysdate, ? , ? , ?) ";
	
	public static final String EMP_SELECT
	="select * from kitriemp";
	
	public static final String EMP_DELETE
	="delete from kitriemp where id = ? ";
	
	public static final String EMP_READ
	="select * from kitriemp where id =? ";
	
	public static final String EMP_SEARCH_NAME
	="select * from kitriemp where name like ? ";
	public static final String EMP_SEARCH_ID
	="select * from kitriemp where id like ? ";
	public static final String EMP_SEARCH_ADDR
	="select * from kitriemp where addr like ? ";
	
	public static final String EMP_UPDATE
	="update kitriemp set addr= ?, grade= ?, point= ? where id = ? ";
}
