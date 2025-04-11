package yarnwrap.datafixer.fix;
public class MobSpawnerEntityIdentifiersFix { public net.minecraft.datafixer.fix.MobSpawnerEntityIdentifiersFix wrapperContained; public MobSpawnerEntityIdentifiersFix(net.minecraft.datafixer.fix.MobSpawnerEntityIdentifiersFix wrapperContained) { this.wrapperContained = wrapperContained; }

public MobSpawnerEntityIdentifiersFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.MobSpawnerEntityIdentifiersFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic fixSpawner(com.mojang.serialization.Dynamic spawnerDynamic) { return wrapperContained.fixSpawner(spawnerDynamic); }
// public com.mojang.datafixers.Typed method_5107(com.mojang.datafixers.types.Type untaggedSpawnerTyped) { return wrapperContained.method_5107(untaggedSpawnerTyped); }
// public com.mojang.serialization.Dynamic method_5108(com.mojang.serialization.Dynamic spawnPotentialsDynamic) { return wrapperContained.method_5108(spawnPotentialsDynamic); }

}