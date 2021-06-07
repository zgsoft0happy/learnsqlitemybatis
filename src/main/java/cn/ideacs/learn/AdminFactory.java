package cn.ideacs.learn;

import cn.ideacs.learn.dos.Admin;
import cn.ideacs.learn.mapper.AdminMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * name:
 * date: 2021/6/8            time:  12:17 AM
 * author: Tomas Yang       email: zgsoft_happy@126.com
 * <p>
 * description:
 * <p>
 * version: 1.0.0
 */
public class AdminFactory {

    public SqlSession getSession() {
        String resource = "mybatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

    public static void main(String[] args) {
        AdminFactory adminFactory = new AdminFactory();
        SqlSession sqlSession = adminFactory.getSession();
        AdminMapper dal=sqlSession.getMapper(AdminMapper.class);
        System.out.println(dal);
        Admin admin = dal.findAdminById("1");
        System.out.println(admin);
    }
}
