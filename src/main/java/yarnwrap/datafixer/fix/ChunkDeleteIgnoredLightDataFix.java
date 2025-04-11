package yarnwrap.datafixer.fix;
public class ChunkDeleteIgnoredLightDataFix { public net.minecraft.datafixer.fix.ChunkDeleteIgnoredLightDataFix wrapperContained; public ChunkDeleteIgnoredLightDataFix(net.minecraft.datafixer.fix.ChunkDeleteIgnoredLightDataFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ChunkDeleteIgnoredLightDataFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ChunkDeleteIgnoredLightDataFix(outputSchema); }

}