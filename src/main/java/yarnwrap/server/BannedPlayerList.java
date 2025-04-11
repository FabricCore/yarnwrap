package yarnwrap.server;
public class BannedPlayerList { public net.minecraft.server.BannedPlayerList wrapperContained; public BannedPlayerList(net.minecraft.server.BannedPlayerList wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean contains(com.mojang.authlib.GameProfile profile) { return wrapperContained.contains(profile); }

}