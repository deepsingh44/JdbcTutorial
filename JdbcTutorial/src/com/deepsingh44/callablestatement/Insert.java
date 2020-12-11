package com.deepsingh44.callablestatement;
import java.sql.CallableStatement;
import java.sql.Connection;
import com.deepsingh44.prestatement.Dao;

public class Insert {
	public static void main(String[] args) {
		try (Connection con = Dao.getConnection();) {
			CallableStatement cs = con.prepareCall("call deepinsert(?,?)");
			cs.setInt(1, 4);
			cs.setString(2, "Ashok");
			cs.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

//batch update
