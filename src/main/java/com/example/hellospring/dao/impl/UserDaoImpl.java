package com.example.hellospring.dao.impl;

import com.example.hellospring.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl  implements UserDao {
  @Override
  public void add() {
    System.out.println("正在执行 UserDao 的 add() 方法……");
  }
  @Override
  public void delete() {
    System.out.println("正在执行 UserDao 的 delete() 方法……");
  }
  @Override
  public void modify() {
    System.out.println("正在执行 UserDao 的 modify() 方法……");
  }
  @Override
  public void get() {
    System.out.println("正在执行 UserDao 的 get() 方法……");
  }
}
