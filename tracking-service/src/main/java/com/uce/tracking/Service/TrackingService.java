package com.uce.tracking.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.tracking.Model.Tracking;
import com.uce.tracking.Repository.TrackingRepository;

@Service
public class TrackingService {

    @Autowired
    private TrackingRepository trackingRepository;

    public Tracking addTracking(Tracking tracking) {
        return trackingRepository.save(tracking);
    }

    public Tracking getTrackingById(Long trackingId) {
        return trackingRepository.findById(trackingId).orElse(null);
    }

    public List<Tracking> getAllTracking() {
        return trackingRepository.findAll();
    }
}
