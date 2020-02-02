package com.derekcode.util;

import static com.derekcode.model.ObjName.*;
import com.derekcode.model.ObjName;
import javafx.scene.image.Image;
import java.util.HashMap;

public class Utils {

	private HashMap<ObjName, Image> images = new HashMap<ObjName, Image>();

	public void loadObjects() {
		images.put(PLAYER, new Image("images/brian.png"));
	}

	public Image getImage(ObjName name) {
		return images.get(name);
	}

}