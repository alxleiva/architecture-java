/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.srv.impl;

import com.alejandroszlv.mock.entity.MockEntity;
import com.alejandroszlv.mock.srv.intrface.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alejandroszlv.mock.repository.data.interfaces.MockRepositoryData;
import javax.transaction.Transactional;

/**
 *
 * @author Alex
 */
@Service
public class MockServiceImpl implements MockService {
    
    @Autowired
    private MockRepositoryData mockRepositoryData;
   
    @Transactional
    @Override
    public MockEntity testMethod() throws Exception {
        MockEntity mockEntity = mockRepositoryData.findOne(1);
        return mockEntity;
    }
    
}
