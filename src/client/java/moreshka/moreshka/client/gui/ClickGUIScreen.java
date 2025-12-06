package moreshka.moreshka.client.gui;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

/**
 * Simple screen wrapper around the ClickGUI data structure.
 */
public class ClickGUIScreen extends Screen {
    private final ClickGUI clickGUI;

    public ClickGUIScreen(ClickGUI clickGUI) {
        super(Text.literal("ClickGUI"));
        this.clickGUI = clickGUI;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);

        // Here you can add rendering logic for frames and buttons later.
        clickGUI.getFrames().forEach(Frame::render);
    }
}