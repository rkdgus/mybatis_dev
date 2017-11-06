package kr.or.dgit.mybatis_dev.service;




import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStudentService {
	private static StudentService studentService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService= null;
	}

	@Test
	public void test1FindStudentByNo() {
		Student student = new Student();
		student.setStudid(1);
		Student findStudent = studentService.findStudentByNo(student);
		
		Assert.assertEquals(student.getStudid(), findStudent.getStudid());
	}
	
	@Test
	public void test2FindStudentByAll() {
		List<Student> list = studentService.findStudentByAll();
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test3FindStudentByNo() {
		Student student = new Student();
		student.setStudid(1);
		Student findStudent = studentService.findStudentByNoAPI(student);
		
		Assert.assertEquals(student.getStudid(), findStudent.getStudid());
	}
	
	@Test
	public void test4FindStudentByNo() {
		List<Student> list = studentService.findStudentByAllAPI();
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test5InsertStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		
		Student student = new Student(4, "홍길동3", "lee@test.co.kr", 
				new PhoneNumber("010-1234-1234"),   newDate.getTime());
		
		int res = studentService.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test6InsertStudentAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		
		Student student = new Student(5, "홍길동4", "lee@test.co.kr", 
				new PhoneNumber("010-1234-1234"),   newDate.getTime());
		
		int res = studentService.insertStudentAPI(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test7InsertStudentAutoInc() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		
		Student student = new Student();
		
		student.setName("오토");
		student.setEmail("z@z.zz");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1010-1010"));
		
		int res = studentService.insertStudentAutoInc(student);
		Assert.assertEquals(1, res);
	}
	
	
	@Test
	public void test8updateStudent() {
		Student student = new Student();
		student.setStudid(0);
		student.setName("오토1");
		student.setEmail("z@z1.zz");
		student.setDob(new Date());
		student.setPhone(new PhoneNumber("010-1010-1010"));
		
		int res = studentService.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	
	
	@Test
	public void test9updateStudentAPI() {
		Student student = new Student();
		student.setStudid(1);
		student.setName("오토2");
		student.setEmail("z@z2.zz");
		student.setDob(new Date());
		student.setPhone(new PhoneNumber("010-1010-1010"));
		
		int res = studentService.updateStudentAPI(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test9DeleteStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		
		Student student = new Student(4, "홍길동3", "lee@test.co.kr", 
				new PhoneNumber("010-1234-1234"),   newDate.getTime());
		
		int res = studentService.deleteStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test9DeleteStudentAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		
		Student student = new Student(5, "홍길동4", "lee@test.co.kr", 
				new PhoneNumber("010-1234-1234"),   newDate.getTime());
		
		int res = studentService.deleteStudent(student);
		Assert.assertEquals(1, res);
	}
	
	
	@Test
	public void test10selectStudentByAllForResultMap() {
		List<Student> lists = studentService.selectStudentByAllForResultMap();
		List<Student> listsAPI = studentService.selectStudentByAllForResultMapWithAPI();
		Assert.assertEquals(lists.size(), listsAPI.size());
	}
	
	
	@Test
	public void test11selectStudentByAllForHashMap() {
		List<Map<String, Object>> lists = studentService.selectStudentByAllForHashMap();
		List<Map<String, Object>> listsAPI = studentService.selectStudentByAllForHashMapWithAPI();
		Assert.assertEquals(lists.size(), listsAPI.size());
	}
	
	
	@Test
	public void test12selectStudentByAllForResultMapExtends() {
		Student student = new Student();
		student.setStudid(1);
		
		Student extStd = studentService.selectStudentByNoForResultMapExtends(student);
		Student extStdApi = studentService.selectStudentByNoForResultMapExtendsWithAPI(student);
		Assert.assertEquals(extStd.getStudId(), extStdApi.getStudId());
	}
	
	

}
