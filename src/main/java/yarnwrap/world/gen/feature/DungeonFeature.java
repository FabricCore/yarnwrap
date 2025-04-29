package yarnwrap.world.gen.feature;
public class DungeonFeature { public net.minecraft.world.gen.feature.DungeonFeature wrapperContained; public DungeonFeature(net.minecraft.world.gen.feature.DungeonFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(wrapperContained.AIR); }
// public void AIR(yarnwrap.block.BlockState value) { wrapperContained.AIR = value.wrapperContained; }
// public static yarnwrap.block.BlockState AIR() { return new yarnwrap.block.BlockState(net.minecraft.world.gen.feature.DungeonFeature.AIR); }
// public static void AIR(yarnwrap.block.BlockState value, ) { net.minecraft.world.gen.feature.DungeonFeature.AIR = value.wrapperContained; }

// public net.minecraft.entity.EntityType[] MOB_SPAWNER_ENTITIES() { return wrapperContained.MOB_SPAWNER_ENTITIES; }
// public void MOB_SPAWNER_ENTITIES(net.minecraft.entity.EntityType[] value) { wrapperContained.MOB_SPAWNER_ENTITIES = value; }
// public static net.minecraft.entity.EntityType[] MOB_SPAWNER_ENTITIES() { return net.minecraft.world.gen.feature.DungeonFeature.MOB_SPAWNER_ENTITIES; }
// public static void MOB_SPAWNER_ENTITIES(net.minecraft.entity.EntityType[] value, ) { net.minecraft.world.gen.feature.DungeonFeature.MOB_SPAWNER_ENTITIES = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.gen.feature.DungeonFeature.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.gen.feature.DungeonFeature.LOGGER = value; }

// public yarnwrap.entity.EntityType getMobSpawnerEntity(yarnwrap.util.math.random.Random random) { return new yarnwrap.entity.EntityType(wrapperContained.getMobSpawnerEntity(random.wrapperContained)); }
// public static yarnwrap.entity.EntityType getMobSpawnerEntity(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.entity.EntityType(net.minecraft.world.gen.feature.DungeonFeature.getMobSpawnerEntity(random.wrapperContained)); }

}