package yarnwrap.block.spawner;
public class TrialSpawnerConfig { public net.minecraft.block.spawner.TrialSpawnerConfig wrapperContained; public TrialSpawnerConfig(net.minecraft.block.spawner.TrialSpawnerConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.Pool spawnPotentials() { return new yarnwrap.util.collection.Pool(wrapperContained.spawnPotentials); }
// public void spawnPotentials(yarnwrap.util.collection.Pool value) { wrapperContained.spawnPotentials = value.wrapperContained; }
// public static yarnwrap.util.collection.Pool spawnPotentials() { return new yarnwrap.util.collection.Pool(net.minecraft.block.spawner.TrialSpawnerConfig.spawnPotentials); }
// public static void spawnPotentials(yarnwrap.util.collection.Pool value, ) { net.minecraft.block.spawner.TrialSpawnerConfig.spawnPotentials = value.wrapperContained; }

// public yarnwrap.block.spawner.TrialSpawnerConfig DEFAULT() { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.block.spawner.TrialSpawnerConfig value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.block.spawner.TrialSpawnerConfig DEFAULT() { return new yarnwrap.block.spawner.TrialSpawnerConfig(net.minecraft.block.spawner.TrialSpawnerConfig.DEFAULT); }
// public static void DEFAULT(yarnwrap.block.spawner.TrialSpawnerConfig value, ) { net.minecraft.block.spawner.TrialSpawnerConfig.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.block.spawner.TrialSpawnerConfig.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.spawner.TrialSpawnerConfig.ENTRY_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.spawner.TrialSpawnerConfig.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.spawner.TrialSpawnerConfig.CODEC = value; }

// public yarnwrap.util.collection.Pool spawnPotentials() { return new yarnwrap.util.collection.Pool(wrapperContained.spawnPotentials()); }
// // public static yarnwrap.util.collection.Pool spawnPotentials() { return new yarnwrap.util.collection.Pool(net.minecraft.block.spawner.TrialSpawnerConfig.spawnPotentials()); }
public int getTotalMobs(int additionalPlayers) { return wrapperContained.getTotalMobs(additionalPlayers); }
// public static int getTotalMobs(int additionalPlayers, ) { return net.minecraft.block.spawner.TrialSpawnerConfig.getTotalMobs(additionalPlayers); }
// public com.mojang.datafixers.kinds.App method_55180(Object instance) { return wrapperContained.method_55180(instance); }
// public static com.mojang.datafixers.kinds.App method_55180(Object instance, ) { return net.minecraft.block.spawner.TrialSpawnerConfig.method_55180(instance); }
public int getSimultaneousMobs(int additionalPlayers) { return wrapperContained.getSimultaneousMobs(additionalPlayers); }
// public static int getSimultaneousMobs(int additionalPlayers, ) { return net.minecraft.block.spawner.TrialSpawnerConfig.getSimultaneousMobs(additionalPlayers); }
public long getCooldownLength() { return wrapperContained.getCooldownLength(); }
// public static long getCooldownLength() { return net.minecraft.block.spawner.TrialSpawnerConfig.getCooldownLength(); }
// public Object builder() { return wrapperContained.builder(); }
public static Object builder() { return net.minecraft.block.spawner.TrialSpawnerConfig.builder(); }
public yarnwrap.block.spawner.TrialSpawnerConfig withSpawnPotential(yarnwrap.entity.EntityType entityType) { return new yarnwrap.block.spawner.TrialSpawnerConfig(wrapperContained.withSpawnPotential(entityType.wrapperContained)); }
// public static yarnwrap.block.spawner.TrialSpawnerConfig withSpawnPotential(yarnwrap.entity.EntityType entityType, ) { return new yarnwrap.block.spawner.TrialSpawnerConfig(net.minecraft.block.spawner.TrialSpawnerConfig.withSpawnPotential(entityType.wrapperContained)); }

}