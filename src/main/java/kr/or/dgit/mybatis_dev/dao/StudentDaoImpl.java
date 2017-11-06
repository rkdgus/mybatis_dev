package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dto.Student;

public class StudentDaoImpl implements StudentDao {
	private SqlSession sqlSession;

	private static final Log log = LogFactory.getLog(StudentDaoImpl.class);
	private String namespace="kr.or.dgit.mybatis_dev.dao.StudentDao.";	
			
	public StudentDaoImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
	
	
	@Override
	public Student selectStudentByNo(Student student) {
		log.debug("selectStudentByNo()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByNo(student);
	}




	@Override
	public List<Student> selectStudentByAll() {
		log.debug("selectStudentByAll()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByAll();
	}




	@Override
	public Student selectStudentByNoWidthApi(Student student) {
		log.debug("selectStudentByNoWidthApi()");
		return sqlSession.selectOne(namespace+"selectOne",student);	
	}




	@Override
	public List<Student> selectStudentByAllWidthApi() {
		log.debug("selectStudentByAllWidthApi()");
		return sqlSession.selectList(namespace+"selectList");
	}




	@Override
	public int insertStudent(Student student) {
		log.debug("insertStudent()");
		return sqlSession.getMapper(StudentDao.class).insertStudent(student);
	}


	@Override
	public int insertStudentAPI(Student student) {
		log.debug("insertStudentAPI()");
		return sqlSession.insert(namespace+"insertStudentAPI",student);
	}




	@Override
	public int insertStudentAutoInc(Student student) {
		log.debug("insertStudentAutoInc()");
		return sqlSession.getMapper(StudentDao.class).insertStudentAutoInc(student);
	}




	@Override
	public int updateStudent(Student student) {
		log.debug("updateStudent()");
		return sqlSession.getMapper(StudentDao.class).updateStudent(student);
	}




	@Override
	public int updateStudentAPI(Student student) {
		log.debug("updateStudentAPI()");
		return sqlSession.update(namespace+"updateStudentAPI",student);
	}




	@Override
	public int deleteStudent(Student student) {
		log.debug("deleteStudent()");
		return sqlSession.getMapper(StudentDao.class).deleteStudent(student);
	}




	@Override
	public int deleteStudentAPI(Student student) {
		log.debug("deleteStudentAPI()");
		return sqlSession.delete(namespace+"deleteStudentAPI",student);
	}




	@Override
	public List<Student> selectStudentByAllForResultMap() {
		log.debug("selectStudentByAllForResultMap()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByAllForResultMap();
	}




	@Override
	public List<Student> selectStudentByAllForResultMapWithAPI() {
		log.debug("selectStudentByAllForResultMapWithAPI()");
		return sqlSession.selectList(namespace+"selectStudentByAllForResultMapWithAPI");
	}




	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		log.debug("selectStudentByAllForHashMap()");
		return sqlSession.getMapper(StudentDao.class).selectStudentByAllForHashMap();
	}




	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMapWithAPI() {
		log.debug("selectStudentByAllForHashMapWithAPI()");
		return sqlSession.selectList(namespace+"selectStudentByAllForHashMapWithAPI");
	}




	@Override
	public Student selectStudentByNoForResultMapExtends(Student student) {
		log.debug("selectStudentByAllForResultMapExtends()");
		return sqlSession.selectOne(namespace+"selectStudentByNoForResultMapExtends",student);
	}




	@Override
	public Student selectStudentByNoForResultMapExtendsWithAPI(Student student) {
		log.debug("selectStudentByAllForResultMapExtendsWithAPI()");
		return sqlSession.selectOne(namespace+"selectStudentByNoForResultMapExtendsWithAPI",student);
	}

}
