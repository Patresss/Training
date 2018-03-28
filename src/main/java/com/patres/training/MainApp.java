package com.patres.training;

import java.text.SimpleDateFormat;
import java.util.*;

public class MainApp {


	public static void main(String[] args) {
		Date date = new Date();
		Date dd = new Date(date.getTime() - (Integer.parseInt((new SimpleDateFormat("u").format(date))) + 6) * 1000 * 60 * 60 * 24);

		String mm = new SimpleDateFormat("MMM", Locale.ENGLISH).format(new GregorianCalendar(GregorianCalendar.getInstance().get(Calendar.YEAR), GregorianCalendar.getInstance().get(Calendar.MONTH) - 1, 1).getTime()).toUpperCase();
		System.out.println(mm);

	}



}
