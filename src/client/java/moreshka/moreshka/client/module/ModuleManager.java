package moreshka.moreshka.client.module;

import moreshka.moreshka.client.module.modules.*;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    private final List<Module> modules = new ArrayList<>();

    public ModuleManager() {
        modules.add(new Fullbright());
        modules.add(new Hud());
        // сюда будешь добавлять новые модули
    }

    public List<Module> getModules() { return modules; }

    public Module getModule(String name) {
        return modules.stream()
                .filter(m -> m.getName().equalsIgnoreCase(name))
                .findFirst().orElse(null);
    }
}
