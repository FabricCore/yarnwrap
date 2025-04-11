package yarnwrap.world.gen.feature;
public class DungeonFeature { public net.minecraft.world.gen.feature.DungeonFeature wrapperContained; public DungeonFeature(net.minecraft.world.gen.feature.DungeonFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(wrapperContained.AIR); }
// public void AIR(yarnwrap.block.BlockState value) { wrapperContained.AIR = value.wrapperContained; }
// public net.minecraft.entity.EntityType[] MOB_SPAWNER_ENTITIES() { return wrapperContained.MOB_SPAWNER_ENTITIES; }
// public void MOB_SPAWNER_ENTITIES(net.minecraft.entity.EntityType[] value) { wrapperContained.MOB_SPAWNER_ENTITIES = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.entity.EntityType getMobSpawnerEntity(yarnwrap.util.math.random.Random random) { return new yarnwrap.entity.EntityType(wrapperContained.getMobSpawnerEntity(random.wrapperContained)); }

}