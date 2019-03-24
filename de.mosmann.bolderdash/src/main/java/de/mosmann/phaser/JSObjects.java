package de.mosmann.phaser;

import java.util.function.Consumer;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;

public class JSObjects {

	@JSBody(script="return {}")
	public static native <T  extends PropertyObject> T instance();
	
	public static <T extends PropertyObject> T instance(Consumer<T> onCreate) {
		T ret = instance();
		onCreate.accept(ret);
		return ret;
	}
	
	public interface PropertyObject extends JSObject {
		
	}
}
