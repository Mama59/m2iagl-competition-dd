package fr.univ_lille1.m2iagl.dd.impl;

import fr.univ_lille1.m2iagl.dd.Challenge;

import java.util.Arrays;
import java.util.List;

public class DummyChallenge implements Challenge {
	@Override
	public Class getInputFormat() {
		return String.class;
	}

	@Override
	public List getInputs() {
		return Arrays.asList(new String[]{"foo", "bar"});
	}

	@Override
	public boolean oracle(Object input) {
		return false;
	}

	@Override
	public String getJavaProgram() {
		return "foo";
	}
}
