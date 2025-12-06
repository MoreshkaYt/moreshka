package moreshka.moreshka.client.module;

public abstract class Module {
    private String name;
    private boolean enabled;
    private Category category;

    public Module(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() { return name; }
    public Category getCategory() { return category; }
    public boolean isEnabled() { return enabled; }

    public void toggle() {
        enabled = !enabled;
        if (enabled) onEnable(); else onDisable();
    }

    public void onEnable() {}
    public void onDisable() {}

    public void onTick() {}
    public void onRender() {}
}
