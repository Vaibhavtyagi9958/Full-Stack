package com.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDAO {
	public JdbcTemplate jdbcTemplate;
	public StudentDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveStudent(Student stu) {
		String sql = "insert into student values(?,?,?)";
		return jdbcTemplate.update(sql, stu.getName(), stu.getMarks(), stu.getRegno());
	}
	public int updateStudent(Student stu) {
		String sql = "update student set marks=? where regno=?";
		return jdbcTemplate.update(sql, stu.getMarks(), stu.getRegno());
	}
	// Select All
    public List<Student> getAllStudents() {
        String sql = "SELECT * FROM student";
        return jdbcTemplate.query(sql, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student stu = new Student();
                stu.setName(rs.getString(1));
                stu.setMarks(rs.getInt("marks"));
                stu.setRegno(rs.getString("regno"));
                return stu;
            }
        });
    }
	
}
