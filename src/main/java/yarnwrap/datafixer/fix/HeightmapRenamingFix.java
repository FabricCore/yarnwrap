package yarnwrap.datafixer.fix;
public class HeightmapRenamingFix { public net.minecraft.datafixer.fix.HeightmapRenamingFix wrapperContained; public HeightmapRenamingFix(net.minecraft.datafixer.fix.HeightmapRenamingFix wrapperContained) { this.wrapperContained = wrapperContained; }

public HeightmapRenamingFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesTyped) { this.wrapperContained = new net.minecraft.datafixer.fix.HeightmapRenamingFix(outputSchema,changesTyped); }
// public com.mojang.serialization.Dynamic renameHeightmapTags(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.renameHeightmapTags(levelDynamic); }
// public com.mojang.datafixers.Typed method_4999(com.mojang.datafixers.OpticFinder chunkTyped) { return wrapperContained.method_4999(chunkTyped); }
// public com.mojang.datafixers.Typed method_5000(com.mojang.datafixers.Typed levelTyped) { return wrapperContained.method_5000(levelTyped); }

}