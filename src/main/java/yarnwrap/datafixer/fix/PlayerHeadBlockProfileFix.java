package yarnwrap.datafixer.fix;
public class PlayerHeadBlockProfileFix { public net.minecraft.datafixer.fix.PlayerHeadBlockProfileFix wrapperContained; public PlayerHeadBlockProfileFix(net.minecraft.datafixer.fix.PlayerHeadBlockProfileFix wrapperContained) { this.wrapperContained = wrapperContained; }

public PlayerHeadBlockProfileFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.PlayerHeadBlockProfileFix(outputSchema); }
// public com.mojang.serialization.Dynamic fixProfile(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixProfile(dynamic); }
// public static com.mojang.serialization.Dynamic fixProfile(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.PlayerHeadBlockProfileFix.fixProfile(dynamic); }

}