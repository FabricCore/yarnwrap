package yarnwrap.entity.mob;
public class WaterCreatureEntity { public net.minecraft.entity.mob.WaterCreatureEntity wrapperContained; public WaterCreatureEntity(net.minecraft.entity.mob.WaterCreatureEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MIN_AMBIENT_SOUND_DELAY() { return wrapperContained.MIN_AMBIENT_SOUND_DELAY; }
// public void MIN_AMBIENT_SOUND_DELAY(int value) { wrapperContained.MIN_AMBIENT_SOUND_DELAY = value; }
public static int MIN_AMBIENT_SOUND_DELAY() { return net.minecraft.entity.mob.WaterCreatureEntity.MIN_AMBIENT_SOUND_DELAY; }
// public static void MIN_AMBIENT_SOUND_DELAY(int value, ) { net.minecraft.entity.mob.WaterCreatureEntity.MIN_AMBIENT_SOUND_DELAY = value; }

// public void tickWaterBreathingAir(yarnwrap.server.world.ServerWorld world,int air) { wrapperContained.tickWaterBreathingAir(world.wrapperContained,air); }
// public static void tickWaterBreathingAir(yarnwrap.server.world.ServerWorld world,int air, ) { net.minecraft.entity.mob.WaterCreatureEntity.tickWaterBreathingAir(world.wrapperContained,air); }
// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.WaterCreatureEntity.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}