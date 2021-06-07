package cn.ideacs.learn;

import cn.ideacs.learn.dos.Admin;
import cn.ideacs.learn.mapper.AdminMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * name:
 * date: 2021/6/8            time:  12:19 AM
 * author: Tomas Yang       email: zgsoft_happy@126.com
 * <p>
 * description:
 * <p>
 * version: 1.0.0
 */

@SpringBootConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest {

    @Test
    public void testFindAdminById(){
        SqlSession sqlSession=new AdminFactory().getSession();
        AdminMapper dal=sqlSession.getMapper(AdminMapper.class);
        Admin mm=dal.findAdminById("admin");
        Assert.assertNotNull(mm);
        sqlSession.close();
    }
}
