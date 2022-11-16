package org.apache.ibatis.example;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberMapper {

  Member selectMemberById(@Param("id")Integer id, @Param("name") String userName);
  List<Member> selectMemberList();

  Boolean insertMember(Member member);
}
