// Copyright 2017 Yahoo Inc.
// Licensed under the terms of the Apache license. Please see LICENSE.md file distributed with this work for terms.
package com.yahoo.bard.webservice.rfc.table;

import com.yahoo.bard.webservice.table.Column;

import org.joda.time.Interval;

import java.util.List;
import java.util.Map;

public interface Availability extends Map<Column, List<Interval>> {
}
