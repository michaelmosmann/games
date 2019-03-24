package de.mosmann.phaser.config;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSByRef;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import de.mosmann.phaser.Callback;
import de.mosmann.phaser.CallbackWithParameter;
import de.mosmann.phaser.OnPreload;

/*
    var config = {
        type: Phaser.AUTO,
        width: 800,
        height: 600,
        physics: {
            default: 'arcade',
            arcade: {
                gravity: { y: 200 }
            }
        },
        scene: {
            preload: preload,
            create: create
        }
    };

 */
public interface SceneConfig extends JSObject {
	
	// replaces 'this' all the time
	@Deprecated()
	@JSBody(params = { "callback" }, script="this.preload = function() { var that=this; callback(that); };")
	void setPreload(CallbackWithParameter<OnPreload> callback);
	
	@JSProperty("create")
	void setCreate(JSObject call);
}
