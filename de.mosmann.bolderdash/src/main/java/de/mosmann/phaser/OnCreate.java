package de.mosmann.phaser;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import de.mosmann.phaser.OnPreload.Load;

public interface OnCreate extends JSObject {
	@JSProperty("add")
	public abstract Add add();
	
	/*
 *         this.add.image(400, 300, 'sky');
        var particles = this.add.particles('red');
        var emitter = particles.createEmitter({
            speed: 100,
            scale: { start: 1, end: 0 },
            blendMode: 'ADD'
        });
        var logo = this.physics.add.image(400, 100, 'logo');
        logo.setVelocity(100, 200);
        logo.setBounce(1, 1);
        logo.setCollideWorldBounds(true);
        emitter.startFollow(logo);
	 */
	public interface Add extends JSObject {
		void image(double width, double height, String id);
	}
}
