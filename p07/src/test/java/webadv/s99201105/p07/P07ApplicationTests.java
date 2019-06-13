package webadv.s99201105.p07;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import webadv.s99201105.p07.entity.Teacher;
import webadv.s99201105.p07.repository.TeacherRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class P07ApplicationTests {
	@Autowired
	private TeacherRepository repository;
	
	@Test
	public void contextLoads() {
		Teacher t=repository.validTeacher("teacher", "123");
		assertEquals(t.getId(),2);
	}

}
