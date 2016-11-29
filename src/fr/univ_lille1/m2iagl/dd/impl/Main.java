package fr.univ_lille1.m2iagl.dd.impl;

import fr.univ_lille1.m2iagl.dd.CauseEffectChain;
import fr.univ_lille1.m2iagl.dd.Challenge;
import fr.univ_lille1.m2iagl.dd.DDebugger;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		DDebugger d = new DummyDDebugger();
		System.out.println(d.debug(new DummyChallenge()));
	}
}
