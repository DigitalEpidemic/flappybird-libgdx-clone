package com.jeffpolasz.flappyclone.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.jeffpolasz.flappyclone.FlappyClone;

/**
 * Created by Jeff on 2017-11-23.
 */

public class MenuState extends State {
    private Texture background;
    private Texture playBtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playBtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FlappyClone.WIDTH, FlappyClone.HEIGHT);
        sb.draw(playBtn, FlappyClone.WIDTH/2 - playBtn.getWidth()/2, FlappyClone.HEIGHT/2);
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
    }
}