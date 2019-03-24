package de.mosmann.phaser;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface CallbackWithParameter<T extends JSObject> extends JSObject {
	void call(T parameter);
}
