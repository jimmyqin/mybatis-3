package org.apache.ibatis.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class ExampleMain {
  public static void main(String[] args) throws IOException {
    String resource = "org/apache/ibatis/example/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    // 加载配置文件构建SqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    try (SqlSession session = sqlSessionFactory.openSession()) {
      MemberMapper mapper = session.getMapper(MemberMapper.class); //拿到代理对象
      Member member = mapper.selectMemberById(1,"test");
      System.out.println(member);

    }
  }
}
