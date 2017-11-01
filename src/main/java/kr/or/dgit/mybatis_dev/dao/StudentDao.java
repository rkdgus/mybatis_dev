package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentDao {
	Student selectStudentByNo(Student student);
	List<Student> selectStudentByAll();
	Student selectStudentByNoWidthApi(Student student);
	List<Student> selectStudentByAllWidthApi();
	
	int insertStudent(Student student);
	int insertStudentAPI(Student student);
	
	int insertStudentAutoInc(Student student);
	
	int updateStudent(Student student);
	int updateStudentAPI(Student student);
	
	int deleteStudent(Student student);
	int deleteStudentAPI(Student student);
}
