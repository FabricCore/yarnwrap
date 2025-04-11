package yarnwrap.datafixer.fix;
public class UntaggedSpawnerFix { public net.minecraft.datafixer.fix.UntaggedSpawnerFix wrapperContained; public UntaggedSpawnerFix(net.minecraft.datafixer.fix.UntaggedSpawnerFix wrapperContained) { this.wrapperContained = wrapperContained; }

public UntaggedSpawnerFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.UntaggedSpawnerFix(outputSchema); }
// public com.mojang.datafixers.Typed method_37973(com.mojang.datafixers.OpticFinder untaggedSpawnerTyped) { return wrapperContained.method_37973(untaggedSpawnerTyped); }
// public com.mojang.datafixers.Typed fixSpawnDataTyped(com.mojang.datafixers.types.Type spawnDataType,com.mojang.datafixers.Typed spawnDataTyped) { return wrapperContained.fixSpawnDataTyped(spawnDataType,spawnDataTyped); }
// public com.mojang.datafixers.Typed fixSpawner(com.mojang.datafixers.types.Type spawnPotentialsType,com.mojang.datafixers.Typed spawnPotentialsTyped) { return wrapperContained.fixSpawner(spawnPotentialsType,spawnPotentialsTyped); }
// public com.mojang.datafixers.Typed method_37977(com.mojang.datafixers.types.Type spawnPotentialsTyped) { return wrapperContained.method_37977(spawnPotentialsTyped); }
// public com.mojang.datafixers.Typed method_37978(com.mojang.datafixers.types.Type spawnDataTyped) { return wrapperContained.method_37978(spawnDataTyped); }

}