package org.child.serviceImpl;

import org.child.entity.UTest;
import org.child.mapper.UTestMapper;
import org.child.service.UTestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Walle
 * @since 2019-02-21
 */
@Service
public class UTestServiceImpl extends ServiceImpl<UTestMapper, UTest> implements UTestService {

}
