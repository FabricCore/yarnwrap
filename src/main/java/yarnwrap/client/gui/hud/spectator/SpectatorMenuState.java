package yarnwrap.client.gui.hud.spectator;
public class SpectatorMenuState { public net.minecraft.client.gui.hud.spectator.SpectatorMenuState wrapperContained; public SpectatorMenuState(net.minecraft.client.gui.hud.spectator.SpectatorMenuState wrapperContained) { this.wrapperContained = wrapperContained; }

// public int selectedSlot() { return wrapperContained.selectedSlot; }
// public void selectedSlot(int value) { wrapperContained.selectedSlot = value; }
// public static int selectedSlot() { return net.minecraft.client.gui.hud.spectator.SpectatorMenuState.selectedSlot; }
// public static void selectedSlot(int value, ) { net.minecraft.client.gui.hud.spectator.SpectatorMenuState.selectedSlot = value; }

// public java.util.List commands() { return wrapperContained.commands; }
// public void commands(java.util.List value) { wrapperContained.commands = value; }
// public static java.util.List commands() { return net.minecraft.client.gui.hud.spectator.SpectatorMenuState.commands; }
// public static void commands(java.util.List value, ) { net.minecraft.client.gui.hud.spectator.SpectatorMenuState.commands = value; }

public SpectatorMenuState(java.util.List commands,int selectedSlot) { this.wrapperContained = new net.minecraft.client.gui.hud.spectator.SpectatorMenuState(commands,selectedSlot); }
public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand getCommand(int slot) { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.getCommand(slot)); }
// public static yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand getCommand(int slot, ) { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(net.minecraft.client.gui.hud.spectator.SpectatorMenuState.getCommand(slot)); }
public int getSelectedSlot() { return wrapperContained.getSelectedSlot(); }
// public static int getSelectedSlot() { return net.minecraft.client.gui.hud.spectator.SpectatorMenuState.getSelectedSlot(); }

}