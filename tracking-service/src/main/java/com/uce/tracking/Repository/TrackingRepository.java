package com.uce.tracking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uce.tracking.Model.Tracking;

@Repository
public interface TrackingRepository extends JpaRepository<Tracking, Long>{
    
}
