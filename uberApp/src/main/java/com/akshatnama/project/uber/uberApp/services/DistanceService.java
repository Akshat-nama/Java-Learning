package com.akshatnama.project.uber.uberApp.services;

import org.geolatte.geom.Point;

public interface DistanceService {
    Double calculateDistance(Point startPoint, Point endPoint);
}
