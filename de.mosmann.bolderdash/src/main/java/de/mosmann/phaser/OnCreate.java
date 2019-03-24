package de.mosmann.phaser;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import de.mosmann.phaser.OnPreload.Load;

public interface OnCreate extends JSObject {
	@JSProperty("add")
	public abstract Add add();
	
	@JSProperty("physics")
	public abstract Physics physics();
	
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

		Particles particles(String id);
	}
	
	public interface Physics extends JSObject {
		@JSProperty("add")
		public abstract Add add();
		
		public interface Add extends JSObject {
			PhysicsImage image(double width, double height, String id);
		}
	}
	
	interface PhysicsImage extends JSObject {
        void setVelocity(int x, int y);
        void setBounce(int x, int y);
        void setCollideWorldBounds(boolean collide);
	}
	
	public interface Particles extends JSObject {
		Emitter createEmitter(EmitterConfig config);
	}
	
//	particles.createEmitter({
//        speed: 100,
//        scale: { start: 1, end: 0 },
//        blendMode: 'ADD'
//    })
	public abstract class EmitterConfig implements JSObject {
		public static enum BlendMode {
			ADD
		}
		
		@JSProperty("speed")
		public abstract void speed(int speed);
		
		@JSProperty("scale")
		public abstract void scale(Scale scale);
		
		@JSProperty("blendMode")
		public abstract void blendMode(String mode);
		
		@JSBody(script="return {};")
		public static native EmitterConfig newInstance();
	}
	
	public abstract class Scale implements JSObject {
		@JSBody(params= {"start","end"}, script="return { start: start, end: end };")
		public static native Scale newInstance(int start, int end);
	}
	
	public interface Emitter extends JSObject {

		void startFollow(PhysicsImage logo);
		
	}
}
