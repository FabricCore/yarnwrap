package yarnwrap.client.gui.hud;
public class SpectatorHud { public net.minecraft.client.gui.hud.SpectatorHud wrapperContained; public SpectatorHud(net.minecraft.client.gui.hud.SpectatorHud wrapperContained) { this.wrapperContained = wrapperContained; }

// public long lastInteractionTime() { return wrapperContained.lastInteractionTime; }
// public void lastInteractionTime(long value) { wrapperContained.lastInteractionTime = value; }
// public static long lastInteractionTime() { return net.minecraft.client.gui.hud.SpectatorHud.lastInteractionTime; }
// public static void lastInteractionTime(long value, ) { net.minecraft.client.gui.hud.SpectatorHud.lastInteractionTime = value; }

// public yarnwrap.client.gui.hud.spectator.SpectatorMenu spectatorMenu() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenu(wrapperContained.spectatorMenu); }
// public void spectatorMenu(yarnwrap.client.gui.hud.spectator.SpectatorMenu value) { wrapperContained.spectatorMenu = value.wrapperContained; }
// public static yarnwrap.client.gui.hud.spectator.SpectatorMenu spectatorMenu() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenu(net.minecraft.client.gui.hud.SpectatorHud.spectatorMenu); }
// public static void spectatorMenu(yarnwrap.client.gui.hud.spectator.SpectatorMenu value, ) { net.minecraft.client.gui.hud.SpectatorHud.spectatorMenu = value.wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.gui.hud.SpectatorHud.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.gui.hud.SpectatorHud.client = value.wrapperContained; }

// public long FADE_OUT_DELAY() { return wrapperContained.FADE_OUT_DELAY; }
// public void FADE_OUT_DELAY(long value) { wrapperContained.FADE_OUT_DELAY = value; }
// public static long FADE_OUT_DELAY() { return net.minecraft.client.gui.hud.SpectatorHud.FADE_OUT_DELAY; }
// public static void FADE_OUT_DELAY(long value, ) { net.minecraft.client.gui.hud.SpectatorHud.FADE_OUT_DELAY = value; }

// public long FADE_OUT_DURATION() { return wrapperContained.FADE_OUT_DURATION; }
// public void FADE_OUT_DURATION(long value) { wrapperContained.FADE_OUT_DURATION = value; }
// public static long FADE_OUT_DURATION() { return net.minecraft.client.gui.hud.SpectatorHud.FADE_OUT_DURATION; }
// public static void FADE_OUT_DURATION(long value, ) { net.minecraft.client.gui.hud.SpectatorHud.FADE_OUT_DURATION = value; }

// public yarnwrap.util.Identifier HOTBAR_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_TEXTURE); }
// public void HOTBAR_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier HOTBAR_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.SpectatorHud.HOTBAR_TEXTURE); }
// public static void HOTBAR_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.SpectatorHud.HOTBAR_TEXTURE = value.wrapperContained; }

// public yarnwrap.util.Identifier HOTBAR_SELECTION_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.HOTBAR_SELECTION_TEXTURE); }
// public void HOTBAR_SELECTION_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.HOTBAR_SELECTION_TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier HOTBAR_SELECTION_TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.gui.hud.SpectatorHud.HOTBAR_SELECTION_TEXTURE); }
// public static void HOTBAR_SELECTION_TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.gui.hud.SpectatorHud.HOTBAR_SELECTION_TEXTURE = value.wrapperContained; }

public SpectatorHud(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.gui.hud.SpectatorHud(client.wrapperContained); }
// public void renderSpectatorMenu(yarnwrap.client.gui.DrawContext context,float height,int x,int y,yarnwrap.client.gui.hud.spectator.SpectatorMenuState state) { wrapperContained.renderSpectatorMenu(context.wrapperContained,height,x,y,state.wrapperContained); }
// public static void renderSpectatorMenu(yarnwrap.client.gui.DrawContext context,float height,int x,int y,yarnwrap.client.gui.hud.spectator.SpectatorMenuState state, ) { net.minecraft.client.gui.hud.SpectatorHud.renderSpectatorMenu(context.wrapperContained,height,x,y,state.wrapperContained); }
public void cycleSlot(int offset) { wrapperContained.cycleSlot(offset); }
// public static void cycleSlot(int offset, ) { net.minecraft.client.gui.hud.SpectatorHud.cycleSlot(offset); }
public void selectSlot(int slot) { wrapperContained.selectSlot(slot); }
// public static void selectSlot(int slot, ) { net.minecraft.client.gui.hud.SpectatorHud.selectSlot(slot); }
public void renderSpectatorMenu(yarnwrap.client.gui.DrawContext context) { wrapperContained.renderSpectatorMenu(context.wrapperContained); }
// public static void renderSpectatorMenu(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.hud.SpectatorHud.renderSpectatorMenu(context.wrapperContained); }
public boolean isOpen() { return wrapperContained.isOpen(); }
// public static boolean isOpen() { return net.minecraft.client.gui.hud.SpectatorHud.isOpen(); }
// public float getSpectatorMenuHeight() { return wrapperContained.getSpectatorMenuHeight(); }
// public static float getSpectatorMenuHeight() { return net.minecraft.client.gui.hud.SpectatorHud.getSpectatorMenuHeight(); }
// public void renderSpectatorCommand(yarnwrap.client.gui.DrawContext context,int slot,int x,float y,float height,yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand command) { wrapperContained.renderSpectatorCommand(context.wrapperContained,slot,x,y,height,command.wrapperContained); }
// public static void renderSpectatorCommand(yarnwrap.client.gui.DrawContext context,int slot,int x,float y,float height,yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand command, ) { net.minecraft.client.gui.hud.SpectatorHud.renderSpectatorCommand(context.wrapperContained,slot,x,y,height,command.wrapperContained); }
public void useSelectedCommand() { wrapperContained.useSelectedCommand(); }
// public static void useSelectedCommand() { net.minecraft.client.gui.hud.SpectatorHud.useSelectedCommand(); }
public void render(yarnwrap.client.gui.DrawContext context) { wrapperContained.render(context.wrapperContained); }
// public static void render(yarnwrap.client.gui.DrawContext context, ) { net.minecraft.client.gui.hud.SpectatorHud.render(context.wrapperContained); }

}