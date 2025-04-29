package yarnwrap.world.biome;
public class SpawnSettings { public net.minecraft.world.biome.SpawnSettings wrapperContained; public SpawnSettings(net.minecraft.world.biome.SpawnSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.biome.SpawnSettings.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.biome.SpawnSettings.CODEC = value; }

// public float creatureSpawnProbability() { return wrapperContained.creatureSpawnProbability; }
// public void creatureSpawnProbability(float value) { wrapperContained.creatureSpawnProbability = value; }
// public static float creatureSpawnProbability() { return net.minecraft.world.biome.SpawnSettings.creatureSpawnProbability; }
// public static void creatureSpawnProbability(float value, ) { net.minecraft.world.biome.SpawnSettings.creatureSpawnProbability = value; }

// public java.util.Map spawners() { return wrapperContained.spawners; }
// public void spawners(java.util.Map value) { wrapperContained.spawners = value; }
// public static java.util.Map spawners() { return net.minecraft.world.biome.SpawnSettings.spawners; }
// public static void spawners(java.util.Map value, ) { net.minecraft.world.biome.SpawnSettings.spawners = value; }

// public java.util.Map spawnCosts() { return wrapperContained.spawnCosts; }
// public void spawnCosts(java.util.Map value) { wrapperContained.spawnCosts = value; }
// public static java.util.Map spawnCosts() { return net.minecraft.world.biome.SpawnSettings.spawnCosts; }
// public static void spawnCosts(java.util.Map value, ) { net.minecraft.world.biome.SpawnSettings.spawnCosts = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.biome.SpawnSettings.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.biome.SpawnSettings.LOGGER = value; }

// public yarnwrap.world.biome.SpawnSettings INSTANCE() { return new yarnwrap.world.biome.SpawnSettings(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.biome.SpawnSettings value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.world.biome.SpawnSettings INSTANCE() { return new yarnwrap.world.biome.SpawnSettings(net.minecraft.world.biome.SpawnSettings.INSTANCE); }
// public static void INSTANCE(yarnwrap.world.biome.SpawnSettings value, ) { net.minecraft.world.biome.SpawnSettings.INSTANCE = value.wrapperContained; }

// public yarnwrap.util.collection.Pool EMPTY_ENTRY_POOL() { return new yarnwrap.util.collection.Pool(wrapperContained.EMPTY_ENTRY_POOL); }
// public void EMPTY_ENTRY_POOL(yarnwrap.util.collection.Pool value) { wrapperContained.EMPTY_ENTRY_POOL = value.wrapperContained; }
public static yarnwrap.util.collection.Pool EMPTY_ENTRY_POOL() { return new yarnwrap.util.collection.Pool(net.minecraft.world.biome.SpawnSettings.EMPTY_ENTRY_POOL); }
// public static void EMPTY_ENTRY_POOL(yarnwrap.util.collection.Pool value, ) { net.minecraft.world.biome.SpawnSettings.EMPTY_ENTRY_POOL = value.wrapperContained; }

// public SpawnSettings(float creatureSpawnProbability,java.util.Map spawners,java.util.Map spawnCosts) { this.wrapperContained = new net.minecraft.world.biome.SpawnSettings(creatureSpawnProbability,spawners,spawnCosts); }
// public com.mojang.datafixers.kinds.App method_30791(Object instance) { return wrapperContained.method_30791(instance); }
// public static com.mojang.datafixers.kinds.App method_30791(Object instance, ) { return net.minecraft.world.biome.SpawnSettings.method_30791(instance); }
public float getCreatureSpawnProbability() { return wrapperContained.getCreatureSpawnProbability(); }
// public static float getCreatureSpawnProbability() { return net.minecraft.world.biome.SpawnSettings.getCreatureSpawnProbability(); }
public Object getSpawnDensity(yarnwrap.entity.EntityType entityType) { return wrapperContained.getSpawnDensity(entityType.wrapperContained); }
// public static Object getSpawnDensity(yarnwrap.entity.EntityType entityType, ) { return net.minecraft.world.biome.SpawnSettings.getSpawnDensity(entityType.wrapperContained); }
public yarnwrap.util.collection.Pool getSpawnEntries(yarnwrap.entity.SpawnGroup spawnGroup) { return new yarnwrap.util.collection.Pool(wrapperContained.getSpawnEntries(spawnGroup.wrapperContained)); }
// public static yarnwrap.util.collection.Pool getSpawnEntries(yarnwrap.entity.SpawnGroup spawnGroup, ) { return new yarnwrap.util.collection.Pool(net.minecraft.world.biome.SpawnSettings.getSpawnEntries(spawnGroup.wrapperContained)); }

}