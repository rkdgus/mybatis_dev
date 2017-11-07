package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

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
	
	
	List<Student> selectStudentByAllForResultMap();
	List<Student> selectStudentByAllForResultMapWithAPI();
	
	List<Map<String, Object>> selectStudentByAllForHashMap();
	List<Map<String, Object>> selectStudentByAllForHashMapWithAPI();
	
	Student selectStudentByNoForResultMapExtends(Student student);
	Student selectStudentByNoForResultMapExtendsWithAPI(Student student);
	
	Student selectStudentByNoAssociation(Student student);
	Student selectStudentByNoAssociationWithAPI(Student student);
	
	int insertEnumStudent(Student student);
	int insertEnumStudentWithAPI(Student student);
}
