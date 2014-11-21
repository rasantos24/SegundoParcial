package juego.segundo.parcial;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

public class SolInput extends InputListener {

	Sol sol;
	SolInput(Sol sol){
		super();
		this.sol=sol;
	}
	
	@Override
	public boolean touchDown(InputEvent event, float x, float y, int pointer,
			int button) {
		// TODO Auto-generated method stub
		super.touchDown(event, x, y, pointer, button);
		sol.remove();
		System.out.println("Tocaste a la figura buena");
		return false;
	}
}
