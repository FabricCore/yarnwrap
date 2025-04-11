package yarnwrap.server;
public class OperatorList { public net.minecraft.server.OperatorList wrapperContained; public OperatorList(net.minecraft.server.OperatorList wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canBypassPlayerLimit(com.mojang.authlib.GameProfile profile) { return wrapperContained.canBypassPlayerLimit(profile); }

}