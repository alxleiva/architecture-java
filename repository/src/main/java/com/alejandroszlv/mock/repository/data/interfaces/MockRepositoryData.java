/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alejandroszlv.mock.repository.data.interfaces;

import com.alejandroszlv.mock.entity.MockEntity;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Alex
 */
public interface MockRepositoryData extends JpaRepository<MockEntity, Serializable> {
    
}
