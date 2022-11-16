package org.apache.ibatis.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Random;

public class ExampleMain {
  public static void main(String[] args) throws IOException {
    String resource = "org/apache/ibatis/example/mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    // 加载配置文件构建SqlSessionFactory
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    try (SqlSession session = sqlSessionFactory.openSession()) {
      MemberMapper mapper = session.getMapper(MemberMapper.class); //拿到代理对象
      // 查询分析
//      Member member = mapper.selectMemberById(1,"test");
//      System.out.println(member);
      // 插入更新分析
      Member insertMember = new Member();
      Random random = new Random();
      long id = random.nextInt(100);
      insertMember.setId(id);
      insertMember.setUsername("test" + id);
      insertMember.setPassword("test" + id);
      insertMember.setNickName("test" + id);
      insertMember.setMail(id + "test@qq.com");
      insertMember.setSex(0);
      insertMember.setStatus(0);
      insertMember.setMobileNo("18007897547");
      insertMember.setCreateTime(LocalDateTime.now());
      insertMember.setUpdateTime(LocalDateTime.now());
      Boolean success = mapper.insertMember(insertMember);
      System.out.println(success);
    }
  }
}
