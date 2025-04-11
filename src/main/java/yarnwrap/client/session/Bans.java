package yarnwrap.client.session;
public class Bans { public net.minecraft.client.session.Bans wrapperContained; public Bans(net.minecraft.client.session.Bans wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text TEMPORARY_TITLE() { return new yarnwrap.text.Text(wrapperContained.TEMPORARY_TITLE); }
// public void TEMPORARY_TITLE(yarnwrap.text.Text value) { wrapperContained.TEMPORARY_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text PERMANENT_TITLE() { return new yarnwrap.text.Text(wrapperContained.PERMANENT_TITLE); }
// public void PERMANENT_TITLE(yarnwrap.text.Text value) { wrapperContained.PERMANENT_TITLE = value.wrapperContained; }
public yarnwrap.text.Text NAME_TITLE() { return new yarnwrap.text.Text(wrapperContained.NAME_TITLE); }
// public void NAME_TITLE(yarnwrap.text.Text value) { wrapperContained.NAME_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text SKIN_TITLE() { return new yarnwrap.text.Text(wrapperContained.SKIN_TITLE); }
// public void SKIN_TITLE(yarnwrap.text.Text value) { wrapperContained.SKIN_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text SKIN_DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.SKIN_DESCRIPTION); }
// public void SKIN_DESCRIPTION(yarnwrap.text.Text value) { wrapperContained.SKIN_DESCRIPTION = value.wrapperContained; }
// public yarnwrap.text.Text getTitle(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getTitle(banDetails)); }
public yarnwrap.client.gui.screen.ConfirmLinkScreen createBanScreen(it.unimi.dsi.fastutil.booleans.BooleanConsumer callback,com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.client.gui.screen.ConfirmLinkScreen(wrapperContained.createBanScreen(callback,banDetails)); }
// public yarnwrap.text.Text getDescriptionText(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getDescriptionText(banDetails)); }
// public yarnwrap.text.Text getReasonText(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getReasonText(banDetails)); }
// public yarnwrap.text.Text getDurationText(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getDurationText(banDetails)); }
// public yarnwrap.text.Text getTemporaryBanDurationText(com.mojang.authlib.minecraft.BanDetails banDetails) { return new yarnwrap.text.Text(wrapperContained.getTemporaryBanDurationText(banDetails)); }
// public boolean isTemporary(com.mojang.authlib.minecraft.BanDetails banDetails) { return wrapperContained.isTemporary(banDetails); }
public yarnwrap.client.gui.screen.ConfirmLinkScreen createSkinBanScreen(java.lang.Runnable onClose) { return new yarnwrap.client.gui.screen.ConfirmLinkScreen(wrapperContained.createSkinBanScreen(onClose)); }
// public void method_53555(java.net.URI confirmed) { wrapperContained.method_53555(confirmed); }
public yarnwrap.client.gui.screen.ConfirmLinkScreen createUsernameBanScreen(java.lang.String username,java.lang.Runnable onClose) { return new yarnwrap.client.gui.screen.ConfirmLinkScreen(wrapperContained.createUsernameBanScreen(username,onClose)); }
// public void method_53557(java.net.URI confirmed) { wrapperContained.method_53557(confirmed); }

}