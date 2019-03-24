package de.mosmann.phaser;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

import de.mosmann.phaser.config.Config;

public abstract class Callbacks {

	@JSBody(params = { "delegate" }, script = "return function() { return delegate(this); }")
	public static native <T extends JSObject> Callback delegate(CallbackWithParameter<T> delegate);

	@JSBody(script = "return function debug() { console.log(this); }")
	public static native Callback debug();
}
