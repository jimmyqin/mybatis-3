package org.apache.ibatis.example;

import java.time.LocalDateTime;

public class Member {
  private Long id;

  private String username;

  private String password;

  private String nickName;

  private Integer sex;

  private String mobileNo;

  private String mail;

  private Integer status;

  private LocalDateTime createTime;

  private LocalDateTime updateTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public LocalDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(LocalDateTime createTime) {
    this.createTime = createTime;
  }

  public LocalDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(LocalDateTime updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString() {
    return "Member{" +
      "id=" + id +
      ", username='" + username + '\'' +
      ", password='" + password + '\'' +
      ", nickName='" + nickName + '\'' +
      ", sex=" + sex +
      ", mobileNo='" + mobileNo + '\'' +
      ", mail='" + mail + '\'' +
      ", status=" + status +
      ", createTime=" + createTime +
      ", updateTime=" + updateTime +
      '}';
  }
}
