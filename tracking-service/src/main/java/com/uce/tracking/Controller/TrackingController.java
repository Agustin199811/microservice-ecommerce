package com.uce.tracking.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.tracking.Model.Tracking;
import com.uce.tracking.Service.TrackingService;

@RestController
@RequestMapping("/ecommerce/tracking")
public class TrackingController {

    @Autowired
    private TrackingService trackingService;

    @PostMapping
    public ResponseEntity<Tracking> addTracking(@RequestBody Tracking tracking) {
        return ResponseEntity.status(HttpStatus.CREATED).body(trackingService.addTracking(tracking));
    }

    @GetMapping("/{trackingId}")
    public ResponseEntity<Tracking> getTrackingById(@PathVariable Long trackingId) {
        return ResponseEntity.ok(trackingService.getTrackingById(trackingId));
    }

    @GetMapping
    public ResponseEntity<List<Tracking>> getAllTracking() {
        return ResponseEntity.ok(trackingService.getAllTracking());
    }
    
}
