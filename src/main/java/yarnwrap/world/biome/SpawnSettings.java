package yarnwrap.world.biome;
public class SpawnSettings { public net.minecraft.world.biome.SpawnSettings wrapperContained; public SpawnSettings(net.minecraft.world.biome.SpawnSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public float creatureSpawnProbability() { return wrapperContained.creatureSpawnProbability; }
// public void creatureSpawnProbability(float value) { wrapperContained.creatureSpawnProbability = value; }
// public java.util.Map spawners() { return wrapperContained.spawners; }
// public void spawners(java.util.Map value) { wrapperContained.spawners = value; }
// public java.util.Map spawnCosts() { return wrapperContained.spawnCosts; }
// public void spawnCosts(java.util.Map value) { wrapperContained.spawnCosts = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public yarnwrap.world.biome.SpawnSettings INSTANCE() { return new yarnwrap.world.biome.SpawnSettings(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.world.biome.SpawnSettings value) { wrapperContained.INSTANCE = value.wrapperContained; }
public yarnwrap.util.collection.Pool EMPTY_ENTRY_POOL() { return new yarnwrap.util.collection.Pool(wrapperContained.EMPTY_ENTRY_POOL); }
// public void EMPTY_ENTRY_POOL(yarnwrap.util.collection.Pool value) { wrapperContained.EMPTY_ENTRY_POOL = value.wrapperContained; }
public float getCreatureSpawnProbability() { return wrapperContained.getCreatureSpawnProbability(); }
public Object getSpawnDensity(yarnwrap.entity.EntityType entityType) { return wrapperContained.getSpawnDensity(entityType.wrapperContained); }
public yarnwrap.util.collection.Pool getSpawnEntries(yarnwrap.entity.SpawnGroup spawnGroup) { return new yarnwrap.util.collection.Pool(wrapperContained.getSpawnEntries(spawnGroup.wrapperContained)); }

}