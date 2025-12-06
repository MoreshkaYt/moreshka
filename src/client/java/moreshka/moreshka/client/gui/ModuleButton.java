package moreshka.moreshka.client.gui;

import moreshka.moreshka.client.module.Module;

public class ModuleButton {
    private final Module module;
    private final Frame parentFrame;
    public boolean extended = false; // для настроек модуля (пока пусто)

    public ModuleButton(Module module, Frame parentFrame) {
        this.module = module;
        this.parentFrame = parentFrame;
    }

    public Module getModule() {
        return module;
    }

    public Frame getParentFrame() {
        return parentFrame;
    }

    public void render(int x, int y) {
        // TODO: сюда добавим код отрисовки кнопки
        // пока можно оставить пустым
    }

    public void onClick(int mouseX, int mouseY, int button) {
        // TODO: обработка клика (включение/выключение модуля)
        // module.toggle() можно вызвать здесь
    }
}
