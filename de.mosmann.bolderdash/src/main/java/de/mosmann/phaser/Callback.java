package de.mosmann.phaser;

import org.teavm.jso.JSFunctor;
import org.teavm.jso.JSObject;

@JSFunctor
public interface Callback extends JSObject {
	void call();
}
