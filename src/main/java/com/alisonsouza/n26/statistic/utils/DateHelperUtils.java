package com.alisonsouza.n26.statistic.utils;

import java.util.Calendar;

public class DateHelperUtils {

	static final long ONE_MINUTE = 60000;
	
	public static Calendar getLast60SecondsByNow() {
		Calendar now = Calendar.getInstance();
		now.setTimeInMillis(now.getTimeInMillis()-ONE_MINUTE);
		return now;
	}
}
