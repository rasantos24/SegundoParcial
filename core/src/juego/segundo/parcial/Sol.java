package juego.segundo.parcial;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Sol extends Image{

	ArrayList<Image>images;
	int dibujo_actual = 0;
	float tiempo_act = 0;
	
	public Sol(){
		super();
		images = new ArrayList<Image>();
		images.add(new Image(new Texture("sola1.png")));
		images.add(new Image(new Texture("sola2.png")));
		images.add(new Image(new Texture("sola3.png")));
		images.add(new Image(new Texture("sola4.png")));
		images.add(new Image(new Texture("sola3.png")));
		images.add(new Image(new Texture("sola5.png")));
		images.add(new Image(new Texture("sola1.png")));
		images.add(new Image(new Texture("sola5.png")));
		addListener(new SolInput(this));
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
		images.get(dibujo_actual).setY(350);
		images.get(dibujo_actual).setX(350);
		images.get(dibujo_actual).draw(batch, parentAlpha);
	}
}
