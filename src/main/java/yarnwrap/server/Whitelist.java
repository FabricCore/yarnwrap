package yarnwrap.server;
public class Whitelist { public net.minecraft.server.Whitelist wrapperContained; public Whitelist(net.minecraft.server.Whitelist wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isAllowed(com.mojang.authlib.GameProfile profile) { return wrapperContained.isAllowed(profile); }

}