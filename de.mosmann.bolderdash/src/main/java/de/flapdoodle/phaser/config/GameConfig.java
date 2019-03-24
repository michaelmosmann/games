package de.flapdoodle.phaser.config;

import org.teavm.jso.JSProperty;
import org.teavm.jso.dom.html.HTMLElement;

public interface GameConfig extends PropertyObject{
    /**
     * The width of the game, in game pixels.
     */
	@JSProperty
    void width(int value);
    /**
     * The height of the game, in game pixels.
     */
	@JSProperty
    void height(int value);
    /**
     * Which renderer to use. Phaser.AUTO, Phaser.CANVAS, Phaser.HEADLESS, or Phaser.WEBGL. AUTO picks WEBGL if available, otherwise CANVAS.
     */
	@JSProperty
    void type(int value);
    
    enum Renderer { AUTO, CANVAR, HEADLEASS, WEBGL}
    
    default void type(Renderer value) {
    	switch (value) {
		case AUTO:
			type(0);
			break;

		default:
			throw new IllegalArgumentException("unknown type "+value);
		}
    }
    /**
     * The DOM element that will contain the game canvas, or its `id`. If undefined or if the named element doesn't exist, the game canvas is inserted directly into the document body. If `null` no parent will be used and you are responsible for adding the canvas to your environment.
     */
	@JSProperty
    void parent(HTMLElement parent);
    /**
     * Automatically call window.focus() when the game boots. Usually necessary to capture input events if the game is in a separate frame.
     */
	@JSProperty
    void autoFocus(boolean value);
    /**
     * Physics configuration.
     */
	@JSProperty
    void physics(PhysicsConfig config);
    /**
     * A scene or scenes to add to the game. If several are given, the first is started; the remainder are started only if they have { active: true }.
     */
	@JSProperty
    void scene();
}

//declare type GameConfig = {
//	    /**
//	     * The width of the game, in game pixels.
//	     */
//	    width?: integer | string;
//	    /**
//	     * The height of the game, in game pixels.
//	     */
//	    height?: integer | string;
//	    /**
//	     * Simple scale applied to the game canvas. 2 is double size, 0.5 is half size, etc.
//	     */
//	    zoom?: number;
//	    /**
//	     * The size of each game pixel, in canvas pixels. Values larger than 1 are "high" resolution.
//	     */
//	    resolution?: number;
//	    /**
//	     * Which renderer to use. Phaser.AUTO, Phaser.CANVAS, Phaser.HEADLESS, or Phaser.WEBGL. AUTO picks WEBGL if available, otherwise CANVAS.
//	     */
//	    type?: number;
//	    /**
//	     * The DOM element that will contain the game canvas, or its `id`. If undefined or if the named element doesn't exist, the game canvas is inserted directly into the document body. If `null` no parent will be used and you are responsible for adding the canvas to your environment.
//	     */
//	    parent?: HTMLElement | string;
//	    /**
//	     * Provide your own Canvas element for Phaser to use instead of creating one.
//	     */
//	    canvas?: HTMLCanvasElement;
//	    /**
//	     * CSS styles to apply to the game canvas instead of Phaser's default styles.
//	     */
//	    canvasStyle?: string;
//	    /**
//	     * Provide your own Canvas Context for Phaser to use, instead of creating one.
//	     */
//	    context?: CanvasRenderingContext2D;
//	    /**
//	     * A scene or scenes to add to the game. If several are given, the first is started; the remainder are started only if they have { active: true }.
//	     */
//	    scene?: object;
//	    /**
//	     * Seed for the random number generator.
//	     */
//	    seed?: string[];
//	    /**
//	     * The title of the game. Shown in the browser console.
//	     */
//	    title?: string;
//	    /**
//	     * The URL of the game. Shown in the browser console.
//	     */
//	    url?: string;
//	    /**
//	     * The version of the game. Shown in the browser console.
//	     */
//	    version?: string;
//	    /**
//	     * Automatically call window.focus() when the game boots. Usually necessary to capture input events if the game is in a separate frame.
//	     */
//	    autoFocus?: boolean;
//	    /**
//	     * Input configuration, or `false` to disable all game input.
//	     */
//	    input?: boolean | InputConfig;
//	    /**
//	     * Disable the browser's default 'contextmenu' event (usually triggered by a right-button mouse click).
//	     */
//	    disableContextMenu?: boolean;
//	    /**
//	     * Configuration for the banner printed in the browser console when the game starts.
//	     */
//	    banner?: boolean | BannerConfig;
//	    /**
//	     * The DOM Container configuration object.
//	     */
//	    dom?: DOMContainerConfig;
//	    /**
//	     * Game loop configuration.
//	     */
//	    fps?: FPSConfig;
//	    /**
//	     * Game renderer configuration.
//	     */
//	    render?: RenderConfig;
//	    /**
//	     * The background color of the game canvas. The default is black.
//	     */
//	    backgroundColor?: string | number;
//	    /**
//	     * Optional callbacks to run before or after game boot.
//	     */
//	    callbacks?: CallbacksConfig;
//	    /**
//	     * Loader configuration.
//	     */
//	    loader?: LoaderConfig;
//	    /**
//	     * Images configuration.
//	     */
//	    images?: ImagesConfig;
//	    /**
//	     * Physics configuration.
//	     */
//	    physics?: object;
//	    /**
//	     * Plugins to install.
//	     */
//	    plugins?: PluginObject | PluginObjectItem[];
//	    /**
//	     * The Scale Manager configuration.
//	     */
//	    scale?: ScaleConfig;
//	};

