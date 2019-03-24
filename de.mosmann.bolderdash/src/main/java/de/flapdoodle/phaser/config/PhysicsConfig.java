package de.flapdoodle.phaser.config;

import org.teavm.jso.JSProperty;

public interface PhysicsConfig extends PropertyObject{
    /**
    * The default physics system. It will be started for each scene. Phaser provides 'arcade', 'impact', and 'matter'.
    */
	@JSProperty("default")
   void setDefault(String value);
   
   enum PhysicsSystem { Arcade, Impact, Matter }
   
   default void setDefault(PhysicsSystem system) {
	   switch (system) {
	   	case Arcade: setDefault("arcade"); 
   		break;
	   	case Impact: setDefault("impact"); 
   		break;
	   	case Matter: setDefault("matter"); 
   		break;
	   }
   }
   /**
    * Arcade Physics configuration.
    */
   @JSProperty
   void arcade(ArcadeWorldConfig value);
//   /**
//    * Impact Physics configuration.
//    */
//   impact?: Phaser.Physics.Impact.WorldConfig;
//   /**
//    * Matter Physics configuration.
//    */
//   matter?: object;
}

//declare type PhysicsConfig = {
//	    /**
//	     * The default physics system. It will be started for each scene. Phaser provides 'arcade', 'impact', and 'matter'.
//	     */
//	    default?: string;
//	    /**
//	     * Arcade Physics configuration.
//	     */
//	    arcade?: ArcadeWorldConfig;
//	    /**
//	     * Impact Physics configuration.
//	     */
//	    impact?: Phaser.Physics.Impact.WorldConfig;
//	    /**
//	     * Matter Physics configuration.
//	     */
//	    matter?: object;
//	};
