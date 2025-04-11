package yarnwrap.client.gui.hud.spectator;
public class TeleportSpectatorMenu { public net.minecraft.client.gui.hud.spectator.TeleportSpectatorMenu wrapperContained; public TeleportSpectatorMenu(net.minecraft.client.gui.hud.spectator.TeleportSpectatorMenu wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TELEPORT_TEXT() { return new yarnwrap.text.Text(wrapperContained.TELEPORT_TEXT); }
// public void TELEPORT_TEXT(yarnwrap.text.Text value) { wrapperContained.TELEPORT_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text PROMPT_TEXT() { return new yarnwrap.text.Text(wrapperContained.PROMPT_TEXT); }
// public void PROMPT_TEXT(yarnwrap.text.Text value) { wrapperContained.PROMPT_TEXT = value.wrapperContained; }
// public java.util.Comparator ORDERING() { return wrapperContained.ORDERING; }
// public void ORDERING(java.util.Comparator value) { wrapperContained.ORDERING = value; }
// public java.util.List elements() { return wrapperContained.elements; }
// public void elements(java.util.List value) { wrapperContained.elements = value; }
// public yarnwrap.util.Identifier TELEPORT_TO_PLAYER_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TELEPORT_TO_PLAYER_TEXTURE); }
// public void TELEPORT_TO_PLAYER_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TELEPORT_TO_PLAYER_TEXTURE = value.wrapperContained; }
public TeleportSpectatorMenu(java.util.Collection entries) { this.wrapperContained = new net.minecraft.client.gui.hud.spectator.TeleportSpectatorMenu(entries); }
// public java.util.UUID method_2785(yarnwrap.client.network.PlayerListEntry a) { return wrapperContained.method_2785(a.wrapperContained); }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand method_46520(yarnwrap.client.network.PlayerListEntry entry) { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.method_46520(entry.wrapperContained)); }
// public boolean method_46521(yarnwrap.client.network.PlayerListEntry entry) { return wrapperContained.method_46521(entry.wrapperContained); }

}