package cn.crud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.crud.dao.DepartmentMapper;

/**
 * 验证操作数据库是否成功
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	@Autowired
	private DepartmentMapper departmentMapper;
	@Test
	public void mapperT(){
		System.out.println(departmentMapper);
	}
}