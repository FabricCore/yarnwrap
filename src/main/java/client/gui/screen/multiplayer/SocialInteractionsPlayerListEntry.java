package yarnwrap.client.gui.screen.multiplayer;
public class SocialInteractionsPlayerListEntry { public net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry wrapperContained; public SocialInteractionsPlayerListEntry(net.minecraft.client.gui.screen.multiplayer.SocialInteractionsPlayerListEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public int BLACK_COLOR() { return wrapperContained.BLACK_COLOR; }
public int GRAY_COLOR() { return wrapperContained.GRAY_COLOR; }
public int DARK_GRAY_COLOR() { return wrapperContained.DARK_GRAY_COLOR; }
public int WHITE_COLOR() { return wrapperContained.WHITE_COLOR; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.List buttons() { return wrapperContained.buttons; }
// public java.util.UUID uuid() { return wrapperContained.uuid; }
// public java.lang.String name() { return wrapperContained.name; }
// public boolean offline() { return wrapperContained.offline; }
// public yarnwrap.client.gui.widget.ButtonWidget hideButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.hideButton); }
// public yarnwrap.client.gui.widget.ButtonWidget showButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.showButton); }
// public float timeCounter() { return wrapperContained.timeCounter; }
public int LIGHT_GRAY_COLOR() { return wrapperContained.LIGHT_GRAY_COLOR; }
// public java.util.function.Supplier skinSupplier() { return wrapperContained.skinSupplier; }
// public yarnwrap.text.Text HIDDEN_TEXT() { return new yarnwrap.text.Text(wrapperContained.HIDDEN_TEXT); }
// public yarnwrap.text.Text BLOCKED_TEXT() { return new yarnwrap.text.Text(wrapperContained.BLOCKED_TEXT); }
// public yarnwrap.text.Text OFFLINE_TEXT() { return new yarnwrap.text.Text(wrapperContained.OFFLINE_TEXT); }
// public yarnwrap.text.Text HIDDEN_OFFLINE_TEXT() { return new yarnwrap.text.Text(wrapperContained.HIDDEN_OFFLINE_TEXT); }
// public yarnwrap.text.Text BLOCKED_OFFLINE_TEXT() { return new yarnwrap.text.Text(wrapperContained.BLOCKED_OFFLINE_TEXT); }
// public java.time.Duration TOOLTIP_DELAY() { return wrapperContained.TOOLTIP_DELAY; }
// public yarnwrap.text.Text hideText() { return new yarnwrap.text.Text(wrapperContained.hideText); }
// public yarnwrap.text.Text showText() { return new yarnwrap.text.Text(wrapperContained.showText); }
// public yarnwrap.client.gui.widget.ButtonWidget reportButton() { return new yarnwrap.client.gui.widget.ButtonWidget(wrapperContained.reportButton); }
// public yarnwrap.text.Text reportText() { return new yarnwrap.text.Text(wrapperContained.reportText); }
// public yarnwrap.text.Text REPORT_DISABLED_TEXT() { return new yarnwrap.text.Text(wrapperContained.REPORT_DISABLED_TEXT); }
// public boolean sentMessage() { return wrapperContained.sentMessage; }
// public boolean canSendReports() { return wrapperContained.canSendReports; }
// public boolean reportable() { return wrapperContained.reportable; }
// public boolean hasDraftReport() { return wrapperContained.hasDraftReport; }
// public yarnwrap.util.Identifier DRAFT_REPORT_ICON_TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.DRAFT_REPORT_ICON_TEXTURE); }
// public yarnwrap.client.gui.screen.ButtonTextures REPORT_BUTTON_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.REPORT_BUTTON_TEXTURES); }
// public yarnwrap.client.gui.screen.ButtonTextures MUTE_BUTTON_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.MUTE_BUTTON_TEXTURES); }
// public yarnwrap.client.gui.screen.ButtonTextures UNMUTE_BUTTON_TEXTURES() { return new yarnwrap.client.gui.screen.ButtonTextures(wrapperContained.UNMUTE_BUTTON_TEXTURES); }
// public void onButtonClick(boolean showButtonVisible,yarnwrap.text.Text chatMessage) { wrapperContained.onButtonClick(showButtonVisible,chatMessage.wrapperContained); }
public java.lang.String getName() { return wrapperContained.getName(); }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
public void setOffline(boolean offline) { wrapperContained.setOffline(offline); }
// public yarnwrap.text.MutableText getNarrationMessage(yarnwrap.text.MutableText text) { return new yarnwrap.text.MutableText(wrapperContained.getNarrationMessage(text.wrapperContained)); }
// public yarnwrap.text.Text getStatusText() { return new yarnwrap.text.Text(wrapperContained.getStatusText()); }
public void setSentMessage(boolean sentMessage) { wrapperContained.setSentMessage(sentMessage); }
public boolean isOffline() { return wrapperContained.isOffline(); }
public boolean hasSentMessage() { return wrapperContained.hasSentMessage(); }
// public yarnwrap.client.gui.tooltip.Tooltip getReportButtonTooltip() { return new yarnwrap.client.gui.tooltip.Tooltip(wrapperContained.getReportButtonTooltip()); }
// public void setShowButtonVisible(boolean showButtonVisible) { wrapperContained.setShowButtonVisible(showButtonVisible); }
public java.util.function.Supplier getSkinSupplier() { return wrapperContained.getSkinSupplier(); }
public boolean isReportable() { return wrapperContained.isReportable(); }

}