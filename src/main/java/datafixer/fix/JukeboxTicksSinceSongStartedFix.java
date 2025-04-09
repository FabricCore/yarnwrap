package yarnwrap.datafixer.fix;
public class JukeboxTicksSinceSongStartedFix { public net.minecraft.datafixer.fix.JukeboxTicksSinceSongStartedFix wrapperContained; public JukeboxTicksSinceSongStartedFix(net.minecraft.datafixer.fix.JukeboxTicksSinceSongStartedFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixTicksSinceSongStarted(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixTicksSinceSongStarted(dynamic); }

}