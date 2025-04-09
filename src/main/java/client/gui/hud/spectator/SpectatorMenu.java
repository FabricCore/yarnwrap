package yarnwrap.client.gui.hud.spectator;
public class SpectatorMenu { public net.minecraft.client.gui.hud.spectator.SpectatorMenu wrapperContained; public SpectatorMenu(net.minecraft.client.gui.hud.spectator.SpectatorMenu wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text CLOSE_TEXT() { return new yarnwrap.text.Text(wrapperContained.CLOSE_TEXT); }
// public yarnwrap.text.Text PREVIOUS_PAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.PREVIOUS_PAGE_TEXT); }
// public yarnwrap.text.Text NEXT_PAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.NEXT_PAGE_TEXT); }
// public int CLOSE_SLOT() { return wrapperContained.CLOSE_SLOT; }
// public int selectedSlot() { return wrapperContained.selectedSlot; }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCloseCallback closeCallback() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCloseCallback(wrapperContained.closeCallback); }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand NEXT_PAGE_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.NEXT_PAGE_COMMAND); }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommandGroup currentGroup() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommandGroup(wrapperContained.currentGroup); }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand DISABLED_NEXT_PAGE_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.DISABLED_NEXT_PAGE_COMMAND); }
public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand BLANK_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.BLANK_COMMAND); }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand CLOSE_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.CLOSE_COMMAND); }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand PREVIOUS_PAGE_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.PREVIOUS_PAGE_COMMAND); }
// public int page() { return wrapperContained.page; }
// public yarnwrap.util.Identifier CLOSE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CLOSE_TEXTURE); }
// public yarnwrap.util.Identifier SCROLL_LEFT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLL_LEFT_TEXTURE); }
// public yarnwrap.util.Identifier SCROLL_RIGHT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLL_RIGHT_TEXTURE); }
public java.util.List getCommands() { return wrapperContained.getCommands(); }
public void useCommand(int slot) { wrapperContained.useCommand(slot); }
public yarnwrap.client.gui.hud.spectator.SpectatorMenuState getCurrentState() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuState(wrapperContained.getCurrentState()); }
public int getSelectedSlot() { return wrapperContained.getSelectedSlot(); }
public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand getSelectedCommand() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.getSelectedCommand()); }
public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommandGroup getCurrentGroup() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommandGroup(wrapperContained.getCurrentGroup()); }
public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand getCommand(int slot) { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.getCommand(slot)); }
public void selectElement(yarnwrap.client.gui.hud.spectator.SpectatorMenuCommandGroup group) { wrapperContained.selectElement(group.wrapperContained); }
public void close() { wrapperContained.close(); }

}