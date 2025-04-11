package yarnwrap.datafixer.fix;
public class ChunkDeleteLightFix { public net.minecraft.datafixer.fix.ChunkDeleteLightFix wrapperContained; public ChunkDeleteLightFix(net.minecraft.datafixer.fix.ChunkDeleteLightFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ChunkDeleteLightFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ChunkDeleteLightFix(outputSchema); }

}