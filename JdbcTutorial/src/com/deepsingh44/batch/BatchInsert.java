package com.deepsingh44.batch;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.deepsingh44.prestatement.Dao;

public class BatchInsert {
	public static void main(String[] args) {
		try (Connection con = Dao.getConnection();) {
			PreparedStatement ps = con.prepareStatement("insert into deep1 values(?,?)");
			for (int i = 8; i < 100; i++) {
				ps.setInt(1, i);
				ps.setString(2, "a" + i);
				ps.addBatch();
			}

			int[] batch = ps.executeBatch();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
