package yarnwrap.client.gui.hud.spectator;
public class SpectatorMenu { public net.minecraft.client.gui.hud.spectator.SpectatorMenu wrapperContained; public SpectatorMenu(net.minecraft.client.gui.hud.spectator.SpectatorMenu wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text CLOSE_TEXT() { return new yarnwrap.text.Text(wrapperContained.CLOSE_TEXT); }
// public void CLOSE_TEXT(yarnwrap.text.Text value) { wrapperContained.CLOSE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text PREVIOUS_PAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.PREVIOUS_PAGE_TEXT); }
// public void PREVIOUS_PAGE_TEXT(yarnwrap.text.Text value) { wrapperContained.PREVIOUS_PAGE_TEXT = value.wrapperContained; }
// public yarnwrap.text.Text NEXT_PAGE_TEXT() { return new yarnwrap.text.Text(wrapperContained.NEXT_PAGE_TEXT); }
// public void NEXT_PAGE_TEXT(yarnwrap.text.Text value) { wrapperContained.NEXT_PAGE_TEXT = value.wrapperContained; }
// public int CLOSE_SLOT() { return wrapperContained.CLOSE_SLOT; }
// public void CLOSE_SLOT(int value) { wrapperContained.CLOSE_SLOT = value; }
// public int selectedSlot() { return wrapperContained.selectedSlot; }
// public void selectedSlot(int value) { wrapperContained.selectedSlot = value; }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCloseCallback closeCallback() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCloseCallback(wrapperContained.closeCallback); }
// public void closeCallback(yarnwrap.client.gui.hud.spectator.SpectatorMenuCloseCallback value) { wrapperContained.closeCallback = value.wrapperContained; }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand NEXT_PAGE_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.NEXT_PAGE_COMMAND); }
// public void NEXT_PAGE_COMMAND(yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand value) { wrapperContained.NEXT_PAGE_COMMAND = value.wrapperContained; }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommandGroup currentGroup() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommandGroup(wrapperContained.currentGroup); }
// public void currentGroup(yarnwrap.client.gui.hud.spectator.SpectatorMenuCommandGroup value) { wrapperContained.currentGroup = value.wrapperContained; }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand DISABLED_NEXT_PAGE_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.DISABLED_NEXT_PAGE_COMMAND); }
// public void DISABLED_NEXT_PAGE_COMMAND(yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand value) { wrapperContained.DISABLED_NEXT_PAGE_COMMAND = value.wrapperContained; }
public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand BLANK_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.BLANK_COMMAND); }
// public void BLANK_COMMAND(yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand value) { wrapperContained.BLANK_COMMAND = value.wrapperContained; }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand CLOSE_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.CLOSE_COMMAND); }
// public void CLOSE_COMMAND(yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand value) { wrapperContained.CLOSE_COMMAND = value.wrapperContained; }
// public yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand PREVIOUS_PAGE_COMMAND() { return new yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand(wrapperContained.PREVIOUS_PAGE_COMMAND); }
// public void PREVIOUS_PAGE_COMMAND(yarnwrap.client.gui.hud.spectator.SpectatorMenuCommand value) { wrapperContained.PREVIOUS_PAGE_COMMAND = value.wrapperContained; }
// public int page() { return wrapperContained.page; }
// public void page(int value) { wrapperContained.page = value; }
// public yarnwrap.util.Identifier CLOSE_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CLOSE_TEXTURE); }
// public void CLOSE_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.CLOSE_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SCROLL_LEFT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLL_LEFT_TEXTURE); }
// public void SCROLL_LEFT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCROLL_LEFT_TEXTURE = value.wrapperContained; }
// public yarnwrap.util.Identifier SCROLL_RIGHT_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.SCROLL_RIGHT_TEXTURE); }
// public void SCROLL_RIGHT_TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.SCROLL_RIGHT_TEXTURE = value.wrapperContained; }
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