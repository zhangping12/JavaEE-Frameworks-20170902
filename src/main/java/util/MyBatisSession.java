package util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;


/**
 * singleton class
 * 单例模式
 * 只有一个类的实例对象
 */
public class MyBatisSession {

    /**
     * 工厂模式
     * 工厂生产产品
     */
    private static SqlSessionFactory sqlSessionFactory;

    private static SqlSessionFactory getSqlSessionFactory() {
        if (sqlSessionFactory == null) {
            try {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sqlSessionFactory;
    }

    /**
     * sql session 数据库会话 类比于 JDBC connection
     * @param autoCommit 自动提交
     * @return sqlSession 的实例
     */
    public static SqlSession getSqlSession(boolean autoCommit) {
        return getSqlSessionFactory().openSession(autoCommit);
    }
}
