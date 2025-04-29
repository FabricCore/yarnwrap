package yarnwrap.entity.mob;
public class SilverfishEntity { public net.minecraft.entity.mob.SilverfishEntity wrapperContained; public SilverfishEntity(net.minecraft.entity.mob.SilverfishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object callForHelpGoal() { return wrapperContained.callForHelpGoal; }
// // public void callForHelpGoal(Object value) { wrapperContained.callForHelpGoal = value; }
// // public static Object callForHelpGoal() { return net.minecraft.entity.mob.SilverfishEntity.callForHelpGoal; }
// // public static void callForHelpGoal(Object value, ) { net.minecraft.entity.mob.SilverfishEntity.callForHelpGoal = value; }

// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.SilverfishEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createSilverfishAttributes() { return wrapperContained.createSilverfishAttributes(); }
public static Object createSilverfishAttributes() { return net.minecraft.entity.mob.SilverfishEntity.createSilverfishAttributes(); }

}