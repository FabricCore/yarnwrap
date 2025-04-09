package yarnwrap.world.biome;
public class SpawnSettings { public net.minecraft.world.biome.SpawnSettings wrapperContained; public SpawnSettings(net.minecraft.world.biome.SpawnSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public float creatureSpawnProbability() { return wrapperContained.creatureSpawnProbability; }
// public java.util.Map spawners() { return wrapperContained.spawners; }
// public java.util.Map spawnCosts() { return wrapperContained.spawnCosts; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.world.biome.SpawnSettings INSTANCE() { return new yarnwrap.world.biome.SpawnSettings(wrapperContained.INSTANCE); }
public yarnwrap.util.collection.Pool EMPTY_ENTRY_POOL() { return new yarnwrap.util.collection.Pool(wrapperContained.EMPTY_ENTRY_POOL); }
public float getCreatureSpawnProbability() { return wrapperContained.getCreatureSpawnProbability(); }
public Object getSpawnDensity(yarnwrap.entity.EntityType entityType) { return wrapperContained.getSpawnDensity(entityType.wrapperContained); }
public yarnwrap.util.collection.Pool getSpawnEntries(yarnwrap.entity.SpawnGroup spawnGroup) { return new yarnwrap.util.collection.Pool(wrapperContained.getSpawnEntries(spawnGroup.wrapperContained)); }

}