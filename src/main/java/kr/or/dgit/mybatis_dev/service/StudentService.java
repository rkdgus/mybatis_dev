package kr.or.dgit.mybatis_dev.service;



import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	
	public Student findStudentByNo(Student student) {
		
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
			
		}
	}
	
	
	public List<Student> findStudentByAll(){
		
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAll();
		}
		
		
	}
	
public Student findStudentByNoAPI(Student student) {
		
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoWidthApi(student);
			
		}
	}
	
	
	public List<Student> findStudentByAllAPI(){
		
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllWidthApi();
		}
	}
	
	public int insertStudent(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int insertStudentAPI(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudentAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	
	public int insertStudentAutoInc(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudentAutoInc(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int updateStudent(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.updateStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int updateStudentAPI(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.updateStudentAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int deleteStudent(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.deleteStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int deleteStudentAPI(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.deleteStudentAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	
	public List<Student> selectStudentByAllForResultMap() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForResultMap();
		}
	}
	

	public List<Student> selectStudentByAllForResultMapWithAPI() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForResultMapWithAPI();
		}
	}
	
	public List<Map<String, Object>> selectStudentByAllForHashMap(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForHashMap();
		}
	}
	
	public List<Map<String, Object>> selectStudentByAllForHashMapWithAPI(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForHashMapWithAPI();
		}
	}
	
	
	public Student selectStudentByNoForResultMapExtends(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoForResultMapExtends(student);
		}
		
	}
	
	
	public Student selectStudentByNoForResultMapExtendsWithAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoForResultMapExtendsWithAPI(student);
		}
		
	}
	
	public Student selectStudentByNoAssociation(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoAssociation(student);
		}
	}
	
	public Student selectStudentByNoAssociationWithAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoAssociationWithAPI(student);
		}
	}
	
	public int insertEnumStudent(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertEnumStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int insertEnumStudentWithAPI(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession()){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertEnumStudentWithAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	
}
