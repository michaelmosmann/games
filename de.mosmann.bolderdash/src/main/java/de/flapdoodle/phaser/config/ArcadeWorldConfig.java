package de.flapdoodle.phaser.config;

import org.teavm.jso.JSProperty;

public interface ArcadeWorldConfig extends PropertyObject{
	
	@JSProperty
	void gravity(Gravity gravity);

	interface Gravity extends PropertyObject {
		@JSProperty
		void x(int x);
		
		@JSProperty
		void y(int y);
	}
}

//declare type ArcadeWorldConfig = {
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#fps}.
//	     */
//	    fps?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#timeScale}.
//	     */
//	    timeScale?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#gravity}.
//	     */
//	    gravity?: object;
//	    /**
//	     * The horizontal world gravity value.
//	     */
//	    "gravity.x"?: number;
//	    /**
//	     * The vertical world gravity value.
//	     */
//	    "gravity.y"?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.x}.
//	     */
//	    x?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.y}.
//	     */
//	    y?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.width}.
//	     */
//	    width?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#bounds bounds.height}.
//	     */
//	    height?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#checkCollision}.
//	     */
//	    checkCollision?: object;
//	    /**
//	     * Should bodies collide with the top of the world bounds?
//	     */
//	    "checkCollision.up"?: boolean;
//	    /**
//	     * Should bodies collide with the bottom of the world bounds?
//	     */
//	    "checkCollision.down"?: boolean;
//	    /**
//	     * Should bodies collide with the left of the world bounds?
//	     */
//	    "checkCollision.left"?: boolean;
//	    /**
//	     * Should bodies collide with the right of the world bounds?
//	     */
//	    "checkCollision.right"?: boolean;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#OVERLAP_BIAS}.
//	     */
//	    overlapBias?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#TILE_BIAS}.
//	     */
//	    tileBias?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#forceX}.
//	     */
//	    forceX?: boolean;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#isPaused}.
//	     */
//	    isPaused?: boolean;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#debug}.
//	     */
//	    debug?: boolean;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowBody}.
//	     */
//	    debugShowBody?: boolean;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
//	     */
//	    debugShowStaticBody?: boolean;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#defaults debugShowStaticBody}.
//	     */
//	    debugShowVelocity?: boolean;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#defaults debugBodyColor}.
//	     */
//	    debugBodyColor?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#defaults debugStaticBodyColor}.
//	     */
//	    debugStaticBodyColor?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#defaults debugVelocityColor}.
//	     */
//	    debugVelocityColor?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#maxEntries}.
//	     */
//	    maxEntries?: number;
//	    /**
//	     * Sets {@link Phaser.Physics.Arcade.World#useTree}.
//	     */
//	    useTree?: boolean;
//	};
