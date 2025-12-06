package moreshka.moreshka.client.gui;

import moreshka.moreshka.client.module.Module;
import moreshka.moreshka.client.module.ModuleManager;
import moreshka.moreshka.client.module.Category;

import java.util.ArrayList;

public class ClickGUI {

    private final ArrayList<Frame> frames = new ArrayList<>();

    public ClickGUI(ModuleManager moduleManager) {
        int x = 10;
        for (Category category : Category.values()) {
            frames.add(new Frame(category, x, 10, 100, 18, moduleManager));
            x += 120;
        }
    }

    public ArrayList<Frame> getFrames() {
        return frames;
    }
}
