package com.yukong.chapter5.service;

import com.yukong.chapter5.repository.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: TestService
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public void testTransactional() {
        throw new RuntimeException();
    }


}
