package yarnwrap.client.gui.hud.spectator;
public class SpectatorMenuCommandGroup { public net.minecraft.client.gui.hud.spectator.SpectatorMenuCommandGroup wrapperContained; public SpectatorMenuCommandGroup(net.minecraft.client.gui.hud.spectator.SpectatorMenuCommandGroup wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List getCommands() { return wrapperContained.getCommands(); }
public yarnwrap.text.Text getPrompt() { return new yarnwrap.text.Text(wrapperContained.getPrompt()); }

}