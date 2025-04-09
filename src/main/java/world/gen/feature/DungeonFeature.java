package yarnwrap.world.gen.feature;
public class DungeonFeature { public net.minecraft.world.gen.feature.DungeonFeature wrapperContained; public DungeonFeature(net.minecraft.world.gen.feature.DungeonFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(wrapperContained.AIR); }
// public net.minecraft.entity.EntityType[] MOB_SPAWNER_ENTITIES() { return wrapperContained.MOB_SPAWNER_ENTITIES; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.entity.EntityType getMobSpawnerEntity(yarnwrap.util.math.random.Random random) { return new yarnwrap.entity.EntityType(wrapperContained.getMobSpawnerEntity(random.wrapperContained)); }

}