package yarnwrap.entity.passive;
public class WaterAnimalEntity { public net.minecraft.entity.passive.WaterAnimalEntity wrapperContained; public WaterAnimalEntity(net.minecraft.entity.passive.WaterAnimalEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.WaterAnimalEntity.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void tickBreathing(int air) { wrapperContained.tickBreathing(air); }
// public static void tickBreathing(int air, ) { net.minecraft.entity.passive.WaterAnimalEntity.tickBreathing(air); }

}