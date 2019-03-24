package de.mosmann.phaser;

import org.teavm.jso.JSBody;

import de.mosmann.phaser.config.Config;

public abstract class Phaser {

	@JSBody(script = "return Phaser.AUTO;")
	public static native PhaserType phaserAuto();
	
	@JSBody(params = { "config" }, script = "return new Phaser.Game(config);")
	public static native Game newGame(Config config);
}
