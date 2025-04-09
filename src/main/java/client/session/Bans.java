package yarnwrap.client.session;
public class Bans { public net.minecraft.client.session.Bans wrapperContained; public Bans(net.minecraft.client.session.Bans wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TEMPORARY_TITLE() { return new yarnwrap.text.Text(wrapperContained.TEMPORARY_TITLE); }
// public yarnwrap.text.Text PERMANENT_TITLE() { return new yarnwrap.text.Text(wrapperContained.PERMANENT_TITLE); }
public yarnwrap.text.Text NAME_TITLE() { return new yarnwrap.text.Text(wrapperContained.NAME_TITLE); }
// public yarnwrap.text.Text SKIN_TITLE() { return new yarnwrap.text.Text(wrapperContained.SKIN_TITLE); }
// public yarnwrap.text.Text SKIN_DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.SKIN_DESCRIPTION); }
// public yarnwrap.text.Text getTitle(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getTitle(banDetails)); }
public yarnwrap.client.gui.screen.ConfirmLinkScreen createBanScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.client.gui.screen.ConfirmLinkScreen(wrapperContained.createBanScreen(callback,banDetails)); }
// public yarnwrap.text.Text getDescriptionText(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getDescriptionText(banDetails)); }
// public yarnwrap.text.Text getReasonText(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getReasonText(banDetails)); }
// public yarnwrap.text.Text getDurationText(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getDurationText(banDetails)); }
// public yarnwrap.text.Text getTemporaryBanDurationText(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getTemporaryBanDurationText(banDetails)); }
// public boolean isTemporary(com.mojang.authlib.minecraft.BanDetails banDetails) { return wrapperContained.isTemporary(banDetails); }
public yarnwrap.client.gui.screen.ConfirmLinkScreen createSkinBanScreen(java.lang.Runnable onClose) { return new yarnwrap.client.gui.screen.ConfirmLinkScreen(wrapperContained.createSkinBanScreen(onClose)); }
public yarnwrap.client.gui.screen.ConfirmLinkScreen createUsernameBanScreen(java.lang.String username,java.lang.Runnable onClose) { return new yarnwrap.client.gui.screen.ConfirmLinkScreen(wrapperContained.createUsernameBanScreen(username,onClose)); }

}