package cn.com.yusys.loancfc.loan.jpabatis.mapper;

import cn.com.yusys.loancfc.loan.jpabatis.entity.ToPayIr;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author ：hanjl
 * @date ：Created in 2021/11/12 0012 16:55
 * @description：
 */
public interface ToPayIrMapper {

    @Select("select * from to_pay_ir")
    List<ToPayIr> findAll();

}
