package de.mosmann;

import org.teavm.ast.cache.EmptyRegularMethodNodeCache;
import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;
import org.teavm.jso.json.JSON;

import de.mosmann.phaser.Callbacks;
import de.mosmann.phaser.Game;
import de.mosmann.phaser.JSObjects;
import de.mosmann.phaser.OnCreate.Emitter;
import de.mosmann.phaser.OnCreate.EmitterConfig;
import de.mosmann.phaser.OnCreate.Particles;
import de.mosmann.phaser.OnCreate.PhysicsImage;
import de.mosmann.phaser.OnCreate.Scale;
import de.mosmann.phaser.OnPreload;
import de.mosmann.phaser.Phaser;
import de.mosmann.phaser.config.Config;
import de.mosmann.phaser.config.ConfigFactory;
import de.mosmann.phaser.config.Physics;
import de.mosmann.phaser.config.SceneConfig;

public class PhaserSample {

	public static void main(String[] args) {
		// https://cdn.jsdelivr.net/npm/phaser@3.15.1/dist/phaser-arcade-physics.min.js
		HTMLDocument document = HTMLDocument.current();
		HTMLElement div = document.createElement("div");
		div.appendChild(document.createTextNode("bowlder dash"));
		document.getBody().appendChild(div);

		Config config = ConfigFactory.config();
		config.setWidth(800);
		config.setHeight(600);
		config.setType(Phaser.phaserAuto());
		config.physics(JSObjects.instance(physics -> {
			physics.setDefault("arcade");
			physics.arcade(JSObjects.instance(arcade ->  {
				arcade.gravtity(JSObjects.instance(gravity -> {
					gravity.y(200);
				}));
			}));
		}));

		SceneConfig sceneConfig;

			sceneConfig = ConfigFactory.sceneConfig((onPreload) -> {
				log("on preload....");
				log(onPreload);
				onPreload.load().setBaseURL("http://labs.phaser.io");
				onPreload.load().image("sky", "assets/skies/space3.png");
				onPreload.load().image("logo", "assets/sprites/phaser3-logo.png");
				onPreload.load().image("red", "assets/particles/red.png");
			}, (onCreate) -> {
				log("on create....");
				log(onCreate);

				onCreate.add().image(400, 300, "sky");
				Particles particles = onCreate.add().particles("red");
				Emitter emitter = particles.createEmitter(emitterConfig());
				
				PhysicsImage logo = onCreate.physics().add().image(400, 100, "logo");
				logo.setVelocity(100, 200); 
				logo.setBounce(1, 1);
				logo.setCollideWorldBounds(true);
				emitter.startFollow(logo);
				/*
				 * 
				 * var logo = this.physics.add.image(400, 100, 'logo');
				 * logo.setVelocity(100, 200); logo.setBounce(1, 1);
				 * logo.setCollideWorldBounds(true); emitter.startFollow(logo);
				 * 
				 */
			});


		// sceneConfig.setCreate(() -> {
		// log("on create....");
		//
		// });
		config.setScene(sceneConfig);

		Game game = Phaser.newGame(config);

		log("started...");
		log(config);
	}

	private static EmitterConfig emitterConfig() {
		EmitterConfig ret = EmitterConfig.newInstance();
		ret.speed(100);
		ret.scale(Scale.newInstance(1, 0));
		ret.blendMode(EmitterConfig.BlendMode.ADD.name());
		return ret;
	}

	@JSBody(params = { "message" }, script = "console.log(message)")
	public static native void log(String message);

	@JSBody(params = { "message" }, script = "console.log(message)")
	public static native void log(JSObject message);
}

/*
https://gist.github.com/photonstorm/46cb8fb4b19fc7717dcad514cdcec064

<script>
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
    var game = new Phaser.Game(config);
    function preload ()
    {
        this.load.setBaseURL('http://labs.phaser.io');
        this.load.image('sky', 'assets/skies/space3.png');
        this.load.image('logo', 'assets/sprites/phaser3-logo.png');
        this.load.image('red', 'assets/particles/red.png');
    }
    function create ()
    {
        this.add.image(400, 300, 'sky');
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
    }
    </script>

 */