package yarnwrap.client.realms.gui.screen;
public class RealmsConfigureWorldScreen { public net.minecraft.client.realms.gui.screen.RealmsConfigureWorldScreen wrapperContained; public RealmsConfigureWorldScreen(net.minecraft.client.realms.gui.screen.RealmsConfigureWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.text.Text tooltip() { return new yarnwrap.text.Text(wrapperContained.tooltip); }
// public yarnwrap.client.realms.gui.screen.RealmsMainScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsMainScreen(wrapperContained.parent); }
// public long serverId() { return wrapperContained.serverId; }
// public int left_x() { return wrapperContained.left_x; }
// public int right_x() { return wrapperContained.right_x; }
// public yarnwrap.client.gui.widget.ButtonWidget playersButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.playersButton); }
// public yarnwrap.client.gui.widget.ButtonWidget settingsButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.settingsButton); }
// public yarnwrap.client.gui.widget.ButtonWidget subscriptionButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.subscriptionButton); }
// public yarnwrap.client.gui.widget.ButtonWidget optionsButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.optionsButton); }
// public yarnwrap.client.gui.widget.ButtonWidget backupButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.backupButton); }
// public yarnwrap.client.gui.widget.ButtonWidget resetWorldButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.resetWorldButton); }
// public yarnwrap.client.gui.widget.ButtonWidget switchMinigameButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.switchMinigameButton); }
// public boolean stateChanged() { return wrapperContained.stateChanged; }
// public yarnwrap.client.realms.dto.RealmsServer server() { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.server); }
// public yarnwrap.util.Identifier EXPIRED_STATUS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPIRED_STATUS_TEXTURE); }
// public yarnwrap.util.Identifier EXPIRES_SOON_STATUS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.EXPIRES_SOON_STATUS_TEXTURE); }
// public yarnwrap.text.Text WORLDS_TITLE() { return new yarnwrap.text.Text(wrapperContained.WORLDS_TITLE); }
// public yarnwrap.text.Text CONFIGURE_REALM_TITLE() { return new yarnwrap.text.Text(wrapperContained.CONFIGURE_REALM_TITLE); }
// public yarnwrap.text.Text EXPIRED_TEXT() { return new yarnwrap.text.Text(wrapperContained.EXPIRED_TEXT); }
// public yarnwrap.text.Text EXPIRES_SOON_TEXT() { return new yarnwrap.text.Text(wrapperContained.EXPIRES_SOON_TEXT); }
// public yarnwrap.text.Text EXPIRES_IN_A_DAY_TEXT() { return new yarnwrap.text.Text(wrapperContained.EXPIRES_IN_A_DAY_TEXT); }
// public yarnwrap.text.Text OPEN_TEXT() { return new yarnwrap.text.Text(wrapperContained.OPEN_TEXT); }
// public yarnwrap.text.Text CLOSED_TEXT() { return new yarnwrap.text.Text(wrapperContained.CLOSED_TEXT); }
// public java.util.List slotButtons() { return wrapperContained.slotButtons; }
// public yarnwrap.util.Identifier OPEN_STATUS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.OPEN_STATUS_TEXTURE); }
// public yarnwrap.util.Identifier CLOSED_STATUS_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.CLOSED_STATUS_TEXTURE); }
// public void stateChanged() { wrapperContained.stateChanged(); }
// public yarnwrap.client.realms.gui.RealmsWorldSlotButton addSlotButton(int slotIndex) { return new yarnwrap.client.realms.gui.RealmsWorldSlotButton(wrapperContained.addSlotButton(slotIndex)); }
// public int buttonCenter(int i,int total) { return wrapperContained.buttonCenter(i,total); }
// public void drawServerState(yarnwrap.client.gui.DrawContext context,int x,int y,int mouseX,int mouseY) { wrapperContained.drawServerState(context.wrapperContained,x,y,mouseX,mouseY); }
// public void switchToFullSlot(int selectedSlot,yarnwrap.client.realms.dto.RealmsServer serverData) { wrapperContained.switchToFullSlot(selectedSlot,serverData.wrapperContained); }
// public void fetchServerData(long worldId) { wrapperContained.fetchServerData(worldId); }
// public void joinRealm(yarnwrap.client.realms.dto.RealmsServer serverData) { wrapperContained.joinRealm(serverData.wrapperContained); }
public void saveSlotSettings(yarnwrap.client.realms.dto.RealmsWorldOptions options) { wrapperContained.saveSlotSettings(options.wrapperContained); }
public void saveSettings(java.lang.String name,java.lang.String desc) { wrapperContained.saveSettings(name,desc); }
public void closeTheWorld() { wrapperContained.closeTheWorld(); }
public void openTheWorld(boolean join) { wrapperContained.openTheWorld(join); }
public yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen getNewScreen() { return new yarnwrap.client.realms.gui.screen.RealmsConfigureWorldScreen(wrapperContained.getNewScreen()); }
// public int buttonLeft(int i) { return wrapperContained.buttonLeft(i); }
// public void switchToEmptySlot(int selectedSlot,yarnwrap.client.realms.dto.RealmsServer serverData) { wrapperContained.switchToEmptySlot(selectedSlot,serverData.wrapperContained); }
// public void addButton(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.addButton(button.wrapperContained); }
// public int frame(int ordinal) { return wrapperContained.frame(ordinal); }
// public void disableButtons() { wrapperContained.disableButtons(); }
// public void switchToMinigame() { wrapperContained.switchToMinigame(); }
// public boolean isMinigame() { return wrapperContained.isMinigame(); }
// public void hideRegularButtons() { wrapperContained.hideRegularButtons(); }
// public void hideMinigameButtons() { wrapperContained.hideMinigameButtons(); }
// public void removeButton(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.removeButton(button.wrapperContained); }
// public void switchMinigame(yarnwrap.client.realms.dto.WorldTemplate template) { wrapperContained.switchMinigame(template.wrapperContained); }
// public void drawServerState(yarnwrap.client.gui.DrawContext context,int x,int y,int mouseX,int mouseY,yarnwrap.util.Identifier texture,java.util.function.Supplier tooltipGetter) { wrapperContained.drawServerState(context.wrapperContained,x,y,mouseX,mouseY,texture.wrapperContained,tooltipGetter); }

}