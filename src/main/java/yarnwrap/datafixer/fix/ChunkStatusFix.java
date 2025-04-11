package yarnwrap.datafixer.fix;
public class ChunkStatusFix { public net.minecraft.datafixer.fix.ChunkStatusFix wrapperContained; public ChunkStatusFix(net.minecraft.datafixer.fix.ChunkStatusFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ChunkStatusFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ChunkStatusFix(outputSchema,changesType); }

}