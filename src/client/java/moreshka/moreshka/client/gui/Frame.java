package moreshka.moreshka.client.gui;

import moreshka.moreshka.client.module.Module;
import moreshka.moreshka.client.module.ModuleManager;
import moreshka.moreshka.client.module.Category;

import java.util.ArrayList;

public class Frame {
    private int x, y, width, height;
    private final Category category;
    private final ArrayList<ModuleButton> buttons = new ArrayList<>();
    public boolean open = true;

    public Frame(Category category, int x, int y, int width, int height, ModuleManager manager) {
        this.category = category;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        for (Module m : manager.getModules()) {
            if (m.getCategory() == category)
                buttons.add(new ModuleButton(m, this));
        }
    }

    public void render() {
        // отрисовка рамки
        // пока без кода рендера, добавим после
    }
}
