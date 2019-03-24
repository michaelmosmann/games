package de.mosmann.phaser;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import de.mosmann.phaser.config.SceneConfig;

public abstract class OnPreload implements JSObject {

	@JSProperty("load")
	public abstract Load load();
	
	/*
	 *         this.load.setBaseURL('http://labs.phaser.io');
        this.load.image('sky', 'assets/skies/space3.png');
        this.load.image('logo', 'assets/sprites/phaser3-logo.png');
        this.load.image('red', 'assets/particles/red.png');
	 */
	public interface Load extends JSObject {
		void setBaseURL(String url);
		
		void image(String id, String location);
	}
	
	@JSBody(script = "return this;")
	public static native OnPreload onPreload();
}
