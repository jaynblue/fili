// Copyright 2016 Yahoo Inc.
// Licensed under the terms of the Apache license. Please see LICENSE.md file distributed with this work for terms.
package com.yahoo.fili.webservice.data.config.metric.makers;

import com.yahoo.fili.webservice.data.metric.MetricDictionary;
import com.yahoo.fili.webservice.druid.model.aggregation.LongMaxAggregation;

/**
 * Metric maker to get the max of long metrics.
 */
public class LongMaxMaker extends RawAggregationMetricMaker {

    /**
     * Constructor.
     *
     * @param metrics  A mapping of metric names to the corresponding LogicalMetrics
     */
    public LongMaxMaker(MetricDictionary metrics) {
        super(metrics, LongMaxAggregation::new);
    }
}