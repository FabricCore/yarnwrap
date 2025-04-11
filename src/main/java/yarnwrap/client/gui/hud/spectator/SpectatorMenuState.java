package yarnwrap.client.gui.hud.spectator;
public class SpectatorMenuState { public net.minecraft.client.gui.hud.spectator.SpectatorMenuState wrapperContained; public SpectatorMenuState(net.minecraft.client.gui.hud.spectator.SpectatorMenuState wrapperContained) { this.wrapperContained = wrapperContained; }

// public int selectedSlot() { return wrapperContained.selectedSlot; }
// public void selectedSlot(int value) { wrapperContained.selectedSlot = value; }
// public java.util.List commands() { return wrapperContained.commands; }
// public void commands(java.util.List value) { wrapperContained.commands = value; }
public SpectatorMenuState(java.util.List commands,int selectedSlot) { this.wrapperContained = new net.minecraft.client.gui.hud.spectator.SpectatorMenuState(commands,selectedSlot); }
public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand getCommand(int slot) { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.getCommand(slot)); }
public int getSelectedSlot() { return wrapperContained.getSelectedSlot(); }

}