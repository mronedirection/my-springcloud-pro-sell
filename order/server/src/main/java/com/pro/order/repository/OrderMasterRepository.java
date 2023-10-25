package com.pro.order.repository;

import com.pro.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
