package de.mosmann.phaser.config;

import org.teavm.jso.JSBody;
import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;

import de.mosmann.phaser.Phaser;
import de.mosmann.phaser.PhaserType;

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

public interface Config extends JSObject{

	@JSProperty("width")
	void setWidth(double width);

	@JSProperty("width")
	double getWidth();
	
	@JSProperty("height")
	void setHeight(double height);

	@JSProperty("height")
	double getHeight();

	@JSProperty("type")
	void setType(PhaserType type);
	
	@JSProperty("type")
	PhaserType getType();
	
	@JSProperty("physics")
	void physics(Physics physics);

	@JSProperty("scene")
	void setScene(SceneConfig config);
}