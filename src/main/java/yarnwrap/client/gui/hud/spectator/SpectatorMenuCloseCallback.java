package yarnwrap.client.gui.hud.spectator;
public class SpectatorMenuCloseCallback { public net.minecraft.client.gui.hud.spectator.SpectatorMenuCloseCallback wrapperContained; public SpectatorMenuCloseCallback(net.minecraft.client.gui.hud.spectator.SpectatorMenuCloseCallback wrapperContained) { this.wrapperContained = wrapperContained; }

public void close(yarnwrap.client.gui.hud.spectator.SpectatorMenu menu) { wrapperContained.close(menu.wrapperContained); }

}