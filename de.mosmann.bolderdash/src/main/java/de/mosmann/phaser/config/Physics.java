package de.mosmann.phaser.config;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import de.mosmann.phaser.JSObjects.PropertyObject;

/*
 * physics: {
            default: 'arcade',
            arcade: {
                gravity: { y: 200 }
            }
        },
 */
public interface Physics extends PropertyObject {
	@JSProperty("default")
	void setDefault(String mode);
	
	@JSProperty("arcade")
	void arcade(Arcade arcade);
	
	public interface Arcade extends PropertyObject {
		
		@JSProperty("gravity")
		void gravtity(Gravity gravity);
		
		public interface Gravity extends PropertyObject {
			@JSProperty("y")
			void y(int y);
		}
	}

}
