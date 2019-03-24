package de.mosmann.phaser.config;

import org.teavm.jso.JSBody;

import de.mosmann.phaser.CallbackWithParameter;
import de.mosmann.phaser.OnCreate;
import de.mosmann.phaser.OnPreload;

public abstract class ConfigFactory {

	@JSBody(script = "return {};")
	public static native Config config();
	
	@JSBody(script = "return {};")
	public static native SceneConfig sceneConfig();
	
	@JSBody(params = {"onPreload","onCreate"}, script = "return {\n" + 
			"            preload: function() { onPreload(this) }," + 
			"            create: function() { onCreate(this) }," + 
			"        };")
	public static native SceneConfig sceneConfig(
			CallbackWithParameter<OnPreload> onPreload,
			CallbackWithParameter<OnCreate> onCreate
			);
}
