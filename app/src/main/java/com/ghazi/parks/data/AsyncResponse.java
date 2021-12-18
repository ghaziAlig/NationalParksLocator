package com.ghazi.parks.data;

import com.ghazi.parks.model.Park;

import java.util.List;

public interface AsyncResponse {
    void processPark(List<Park> parks);
}