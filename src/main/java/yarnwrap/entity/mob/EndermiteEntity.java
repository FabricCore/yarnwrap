package yarnwrap.entity.mob;
public class EndermiteEntity { public net.minecraft.entity.mob.EndermiteEntity wrapperContained; public EndermiteEntity(net.minecraft.entity.mob.EndermiteEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int lifeTime() { return wrapperContained.lifeTime; }
// public void lifeTime(int value) { wrapperContained.lifeTime = value; }
// public static int lifeTime() { return net.minecraft.entity.mob.EndermiteEntity.lifeTime; }
// public static void lifeTime(int value, ) { net.minecraft.entity.mob.EndermiteEntity.lifeTime = value; }

// public int DESPAWN_TIME() { return wrapperContained.DESPAWN_TIME; }
// public void DESPAWN_TIME(int value) { wrapperContained.DESPAWN_TIME = value; }
// public static int DESPAWN_TIME() { return net.minecraft.entity.mob.EndermiteEntity.DESPAWN_TIME; }
// public static void DESPAWN_TIME(int value, ) { net.minecraft.entity.mob.EndermiteEntity.DESPAWN_TIME = value; }

// public int DEFAULT_LIFETIME() { return wrapperContained.DEFAULT_LIFETIME; }
// public void DEFAULT_LIFETIME(int value) { wrapperContained.DEFAULT_LIFETIME = value; }
// public static int DEFAULT_LIFETIME() { return net.minecraft.entity.mob.EndermiteEntity.DEFAULT_LIFETIME; }
// public static void DEFAULT_LIFETIME(int value, ) { net.minecraft.entity.mob.EndermiteEntity.DEFAULT_LIFETIME = value; }

// public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.mob.EndermiteEntity.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public Object createEndermiteAttributes() { return wrapperContained.createEndermiteAttributes(); }
public static Object createEndermiteAttributes() { return net.minecraft.entity.mob.EndermiteEntity.createEndermiteAttributes(); }

}