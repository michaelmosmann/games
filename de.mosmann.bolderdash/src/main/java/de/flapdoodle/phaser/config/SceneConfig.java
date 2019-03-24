package de.flapdoodle.phaser.config;

import org.teavm.jso.JSBody;

import de.mosmann.phaser.CallbackWithParameter;
import de.mosmann.phaser.OnCreate;
import de.mosmann.phaser.OnPreload;

public interface SceneConfig extends PropertyObject {

	public static class Factory {
		@JSBody(params = {"onPreload","onCreate"}, script = "return {\n" + 
				"            preload: function() { onPreload(this) }," + 
				"            create: function() { onCreate(this) }," + 
				"        };")
		public static native SceneConfig sceneConfig(
				CallbackWithParameter<OnPreload> onPreload,
				CallbackWithParameter<OnCreate> onCreate
				);
	}
}
