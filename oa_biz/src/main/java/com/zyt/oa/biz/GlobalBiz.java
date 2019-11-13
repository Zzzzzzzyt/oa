package com.zyt.oa.biz;

import com.zyt.oa.entity.Employee;

public interface GlobalBiz {

    Employee login(String sn,String password);
    void changepassword(Employee employee);
}
