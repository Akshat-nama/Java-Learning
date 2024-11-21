package com.akshatnama.project.uber.uberApp.services.impl;

import com.akshatnama.project.uber.uberApp.services.DistanceService;
import org.geolatte.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public Double calculateDistance(Point startPoint, Point endPoint) {
        return 0.0;
    }
}
