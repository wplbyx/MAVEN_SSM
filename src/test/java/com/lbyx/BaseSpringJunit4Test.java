package com.lbyx;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *  Created by lbyx on 2017/12/8 0008.
 *
 *  类  名:  BaseSpringJunit4Test. Spring 单元测试的基类，用做标记
 *          后面所有的测试类都继承这个基类，做单元测试
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/ApplicationContext.xml")
public class BaseSpringJunit4Test {}
