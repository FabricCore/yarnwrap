package yarnwrap.client.gui.hud.spectator;
public class TeleportToSpecificPlayerSpectatorCommand { public net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand wrapperContained; public TeleportToSpecificPlayerSpectatorCommand(net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.authlib.GameProfile gameProfile() { return wrapperContained.gameProfile; }
// public void gameProfile(com.mojang.authlib.GameProfile value) { wrapperContained.gameProfile = value; }
// public static com.mojang.authlib.GameProfile gameProfile() { return net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand.gameProfile; }
// public static void gameProfile(com.mojang.authlib.GameProfile value, ) { net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand.gameProfile = value; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand.name); }
// public static void name(yarnwrap.text.Text value, ) { net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand.name = value.wrapperContained; }

// public java.util.function.Supplier skinTexturesSupplier() { return wrapperContained.skinTexturesSupplier; }
// public void skinTexturesSupplier(java.util.function.Supplier value) { wrapperContained.skinTexturesSupplier = value; }
// public static java.util.function.Supplier skinTexturesSupplier() { return net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand.skinTexturesSupplier; }
// public static void skinTexturesSupplier(java.util.function.Supplier value, ) { net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand.skinTexturesSupplier = value; }

public TeleportToSpecificPlayerSpectatorCommand(com.mojang.authlib.GameProfile gameProfile) { this.wrapperContained = new net.minecraft.client.gui.hud.spectator.TeleportToSpecificPlayerSpectatorCommand(gameProfile); }

}