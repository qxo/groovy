/*
 * Created on Apr 23, 2006
 *
 * Copyright 2006 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.codehaus.groovy.runtime;

import groovy.time.DatumDependentDuration;
import groovy.time.Duration;
import groovy.time.TimeDuration;

public class TimeCategory {
    
    /*
     * Methods on Integer to implement 1.month, 4.years etc.
     */
    
    public static DatumDependentDuration getMonths(final Integer self) {
        return new DatumDependentDuration(0, self.intValue(), 0, 0, 0, 0, 0);
    }
    
    public static DatumDependentDuration getMonth(final Integer self) {
        return getMonths(self);
    }
    
    public static DatumDependentDuration getYears(final Integer self) {
        return new DatumDependentDuration(self.intValue(), 0, 0, 0, 0, 0, 0);
    }
    
    public static DatumDependentDuration getYear(final Integer self) {
        return getYears(self);
    }
    
    /*
     * Methods on Integer to implement 1.week, 4.days etc.
     */
    
    public static Duration getWeeks(final Integer self) {
        return new Duration(self.intValue() * 7, 0, 0, 0, 0);
    }
    
    public static Duration getWeek(final Integer self) {
        return getWeeks(self);
    }
    
    public static Duration getDays(final Integer self) {
        return new Duration(self.intValue(), 0, 0, 0, 0);
    }
    
    public static Duration getDay(final Integer self) {
        return getDays(self);
    }
    
    public static TimeDuration getHours(final Integer self) {
        return new TimeDuration(0, self.intValue(), 0, 0, 0);
    }
    
    public static TimeDuration getHour(final Integer self) {
        return getHours(self);
    }
    
    public static TimeDuration getMinutes(final Integer self) {
        return new TimeDuration(0, 0, self.intValue(), 0, 0);
    }
    
    public static TimeDuration getMinute(final Integer self) {
        return getMinutes(self);
    }
    
    public static TimeDuration getSeconds(final Integer self) {
        return new TimeDuration(0, 0, 0, self.intValue(), 0);
    }
    
    public static TimeDuration getSecond(final Integer self) {
        return getSeconds(self);
    }
    
    public static TimeDuration getMilliseconds(final Integer self) {
        return new TimeDuration(0, 0, 0, 0, self.intValue());
    }
    
    public static TimeDuration getMillisecond(final Integer self) {
        return getMilliseconds(self);
    }
}
