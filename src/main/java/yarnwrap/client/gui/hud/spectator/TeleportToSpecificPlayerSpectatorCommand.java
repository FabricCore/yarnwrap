package yarnwrap.client.gui.hud.spectator;
public class TeleportToSpecificPlayerSpectatorCommand { public net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand wrapperContained; public TeleportToSpecificPlayerSpectatorCommand(net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public com.mojang.authlib.GameProfile gameProfile() { return wrapperContained.gameProfile; }
// public void gameProfile(com.mojang.authlib.GameProfile value) { wrapperContained.gameProfile = value; }
// public java.util.function.Supplier skinTexturesSupplier() { return wrapperContained.skinTexturesSupplier; }
// public void skinTexturesSupplier(java.util.function.Supplier value) { wrapperContained.skinTexturesSupplier = value; }
public TeleportToSpecificPlayerSpectatorCommand(com.mojang.authlib.GameProfile gameProfile) { this.wrapperContained = new net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand(gameProfile); }

}