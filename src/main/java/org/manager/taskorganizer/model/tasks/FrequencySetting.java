package org.manager.taskorganizer.model.tasks;

import org.manager.taskorganizer.constants.Frequency;
import org.manager.taskorganizer.constants.Strategy;

public class FrequencySetting {
	private Frequency frequency;
	private String format;
	private Strategy strategy;
	private int iterations;

	public final Frequency getFrequency() {
		return frequency;
	}

	public final void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	public final String getFormat() {
		return format;
	}

	public final void setFormat(String format) {
		this.format = format;
	}

	public final Strategy getStrategy() {
		return strategy;
	}

	public final void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public final int getIterations() {
		return iterations;
	}

	public final void setIterations(int iterations) {
		this.iterations = iterations;
	}

	/* TODO: Add derived fields. */

}
