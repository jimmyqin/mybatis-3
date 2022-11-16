package org.apache.ibatis.example;

import org.apache.ibatis.annotations.Param;

public interface MemberMapper {

  Member selectMemberById(@Param("id")Integer id, @Param("name") String userName);
}
