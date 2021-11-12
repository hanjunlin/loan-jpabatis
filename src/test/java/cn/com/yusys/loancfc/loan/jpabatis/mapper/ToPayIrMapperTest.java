package cn.com.yusys.loancfc.loan.jpabatis.mapper;

import cn.com.yusys.loancfc.loan.jpabatis.boot.LoanJpabatisApplication;
import cn.com.yusys.loancfc.loan.jpabatis.dao.ToPayIrDao;
import cn.com.yusys.loancfc.loan.jpabatis.entity.ToPayIr;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = {LoanJpabatisApplication.class})
@RunWith(SpringRunner.class)
@Slf4j
public class ToPayIrMapperTest {

    @Autowired
    ToPayIrMapper toPayIrMapper;

    @Autowired
    ToPayIrDao toPayIrDao;

    @Test
    public void mapperTest(){
        List<ToPayIr> all = toPayIrMapper.findAll();
        log.info("mapper:" + JSON.toJSONString(all));
    }

    @Test
    public void daoTest(){
        List<ToPayIr> all = toPayIrDao.findAll();
        log.info("dat:" + JSON.toJSONString(all));
        List<ToPayIr> toPayIrs = toPayIrDao.findByAcctBankCde("123");
        log.info("toPayIrs:" + JSON.toJSONString(toPayIrs));
    }
}