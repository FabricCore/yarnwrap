package yarnwrap.datafixer.fix;
public class JukeboxTicksSinceSongStartedFix { public net.minecraft.datafixer.fix.JukeboxTicksSinceSongStartedFix wrapperContained; public JukeboxTicksSinceSongStartedFix(net.minecraft.datafixer.fix.JukeboxTicksSinceSongStartedFix wrapperContained) { this.wrapperContained = wrapperContained; }

public JukeboxTicksSinceSongStartedFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.JukeboxTicksSinceSongStartedFix(outputSchema); }
public com.mojang.serialization.Dynamic fixTicksSinceSongStarted(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixTicksSinceSongStarted(dynamic); }
// public static com.mojang.serialization.Dynamic fixTicksSinceSongStarted(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.JukeboxTicksSinceSongStartedFix.fixTicksSinceSongStarted(dynamic); }

}