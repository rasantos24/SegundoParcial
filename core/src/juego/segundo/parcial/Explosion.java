package juego.segundo.parcial;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Explosion extends Actor{

	ArrayList<Image>images;
	int dibujo_actual = 0;
	float tiempo_act = 0;
	
	public Explosion(){
		super();
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("perder01.png")));
		images.add(new Image(new Texture("perder02.png")));
		images.add(new Image(new Texture("perder03.png")));
		images.add(new Image(new Texture("perder04.png")));
		images.add(new Image(new Texture("perder05.png")));
	}

	@Override
	public void act(float delta) {
		System.out.println(delta);
		super.act(delta);
		tiempo_act+= delta;
		if(tiempo_act>0.1f){
			dibujo_actual++;
			tiempo_act = 0;
		}
		if(dibujo_actual >= images.size()){
			dibujo_actual = 0;
		}
		
	}
	@Override
	public void draw(Batch batch, float parentAlpha) {
		// TODO Auto-generated method stub
		super.draw(batch, parentAlpha);
		images.get(dibujo_actual).setX(0);
		images.get(dibujo_actual).draw(batch, parentAlpha);
	}
}
