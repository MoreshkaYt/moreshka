package moreshka.moreshka.client;

import moreshka.moreshka.client.gui.ClickGUI;
import moreshka.moreshka.client.gui.ClickGUIScreen;
import moreshka.moreshka.client.module.ModuleManager;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class MoreshkaClient implements ClientModInitializer {

    private ModuleManager moduleManager;
    private ClickGUI clickGUI;
    private KeyBinding openClickGUIKey;

    @Override
    public void onInitializeClient() {
        moduleManager = new ModuleManager();
        clickGUI = new ClickGUI(moduleManager);

        openClickGUIKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.moreshka.open_click_gui",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_RIGHT_SHIFT,
                "category.moreshka.keybindings"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openClickGUIKey.wasPressed()) {
                client.setScreen(new ClickGUIScreen(clickGUI));
            }
        });
    }
}