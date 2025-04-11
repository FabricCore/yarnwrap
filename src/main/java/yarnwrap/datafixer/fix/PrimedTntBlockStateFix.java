package yarnwrap.datafixer.fix;
public class PrimedTntBlockStateFix { public net.minecraft.datafixer.fix.PrimedTntBlockStateFix wrapperContained; public PrimedTntBlockStateFix(net.minecraft.datafixer.fix.PrimedTntBlockStateFix wrapperContained) { this.wrapperContained = wrapperContained; }

public PrimedTntBlockStateFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.PrimedTntBlockStateFix(outputSchema); }
// public com.mojang.serialization.Dynamic fixFuse(com.mojang.serialization.Dynamic data) { return wrapperContained.fixFuse(data); }
// public com.mojang.serialization.Dynamic fixBlockState(com.mojang.serialization.Dynamic data) { return wrapperContained.fixBlockState(data); }

}