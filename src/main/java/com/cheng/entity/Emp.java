package com.cheng.entity;


import java.sql.Date;

public class Emp {

  private Long id;
  private String name;
  private Long age;
  private String job;
  private Double salary;
  private java.sql.Date entryDate;
  private Long managerId;
  private Long deptId;

  public Emp(Long id, String name, Long age, String job, Double salary, Date entryDate, Long managerId, Long deptId) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.job = job;
    this.salary = salary;
    this.entryDate = entryDate;
    this.managerId = managerId;
    this.deptId = deptId;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public Date getEntryDate() {
    return entryDate;
  }

  public void setEntryDate(Date entryDate) {
    this.entryDate = entryDate;
  }

  public Long getManagerId() {
    return managerId;
  }

  public void setManagerId(Long managerId) {
    this.managerId = managerId;
  }

  public Long getDeptId() {
    return deptId;
  }

  public void setDeptId(Long deptId) {
    this.deptId = deptId;
  }
}
