package me.p3ntest.osi;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;



public class OsiGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	public static Pixmap createRoundedRectangle(int width, int height, int cornerRadius, Color color) {

		Pixmap pixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);
		Pixmap ret = new Pixmap(width, height, Pixmap.Format.RGBA8888);

		pixmap.setColor(color);

		pixmap.fillCircle(cornerRadius, cornerRadius, cornerRadius);
		pixmap.fillCircle(width - cornerRadius - 1, cornerRadius, cornerRadius);
		pixmap.fillCircle(cornerRadius, height - cornerRadius - 1, cornerRadius);
		pixmap.fillCircle(width - cornerRadius - 1, height - cornerRadius - 1, cornerRadius);

		pixmap.fillRectangle(cornerRadius, 0, width - cornerRadius * 2, height);
		pixmap.fillRectangle(0, cornerRadius, width, height - cornerRadius * 2);

		ret.setColor(color);
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (pixmap.getPixel(x, y) != 0) ret.drawPixel(x, y);
			}
		}
		pixmap.dispose();

		return ret;
	}

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		System.out.println("create");
	}

	@Override
	public void render () {

		createRoundedRectangle(100, 100, 100, (Color.YELLOW.cpy()));


	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		System.out.println("dispose");

		//test commit
	}
}
