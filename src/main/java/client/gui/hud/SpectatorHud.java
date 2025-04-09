package yarnwrap.client.gui.hud;
public class SpectatorHud { public net.minecraft.client.gui.hud.SpectatorHud wrapperContained; public SpectatorHud(net.minecraft.client.gui.hud.SpectatorHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastInteractionTime() { return wrapperContained.lastInteractionTime; }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenu spectatorMenu() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenu(wrapperContained.spectatorMenu); }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public long FADE_OUT_DELAY() { return wrapperContained.FADE_OUT_DELAY; }
// public long FADE_OUT_DURATION() { return wrapperContained.FADE_OUT_DURATION; }
// public yarnwrap.util.Identifier HOTBAR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_TEXTURE); }
// public yarnwrap.util.Identifier HOTBAR_SELECTION_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_SELECTION_TEXTURE); }
// public void renderSpectatorMenu(yarnwrap.client.gui.DrawContext context,float height,int x,int y,yarnwrap.client.gui.hud.spectator.SpectatorMenuState state) { wrapperContained.renderSpectatorMenu(context.wrapperContained,height,x,y,state.wrapperContained); }
public void cycleSlot(int offset) { wrapperContained.cycleSlot(offset); }
public void selectSlot(int slot) { wrapperContained.selectSlot(slot); }
public void renderSpectatorMenu(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderSpectatorMenu(context.wrapperContained); }
public void render(yarnwrap.client.gui.DrawContext context) { wrapperContained.render(context.wrapperContained); }
public boolean isOpen() { return wrapperContained.isOpen(); }
// public float getSpectatorMenuHeight() { return wrapperContained.getSpectatorMenuHeight(); }
// public void renderSpectatorCommand(yarnwrap.client.gui.DrawContext context,int slot,int x,float y,float height,yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand command) { wrapperContained.renderSpectatorCommand(context.wrapperContained,slot,x,y,height,command.wrapperContained); }
public void useSelectedCommand() { wrapperContained.useSelectedCommand(); }

}