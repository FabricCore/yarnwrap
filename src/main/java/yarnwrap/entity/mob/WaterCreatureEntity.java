package yarnwrap.entity.mob;
public class WaterCreatureEntity { public net.minecraft.entity.mob.WaterCreatureEntity wrapperContained; public WaterCreatureEntity(net.minecraft.entity.mob.WaterCreatureEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.WaterCreatureEntity.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void tickWaterBreathingAir(int air) { wrapperContained.tickWaterBreathingAir(air); }
// public static void tickWaterBreathingAir(int air, ) { net.minecraft.entity.mob.WaterCreatureEntity.tickWaterBreathingAir(air); }

}