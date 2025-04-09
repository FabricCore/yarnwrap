package yarnwrap.entity.mob;
public class ZombieHorseEntity { public net.minecraft.entity.mob.ZombieHorseEntity wrapperContained; public ZombieHorseEntity(net.minecraft.entity.mob.ZombieHorseEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
public Object createZombieHorseAttributes() { return wrapperContained.createZombieHorseAttributes(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}