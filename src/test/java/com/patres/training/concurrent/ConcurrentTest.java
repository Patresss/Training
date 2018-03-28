package com.patres.training.concurrent;

import org.junit.Test;

public class ConcurrentTest {

	@Test
	public void concurrentTypicalTest() {
		ConcurrentExample.concurrentTypicalRun();
	}

	@Test
	public void concurrentJava8Test() {
		ConcurrentExample.concurrentJava8Run();
	}

}
