package yarnwrap.entity.mob;
public class GhastEntity { public net.minecraft.entity.mob.GhastEntity wrapperContained; public GhastEntity(net.minecraft.entity.mob.GhastEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int fireballStrength() { return wrapperContained.fireballStrength; }
// public void fireballStrength(int value) { wrapperContained.fireballStrength = value; }
// public yarnwrap.entity.data.TrackedData SHOOTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SHOOTING); }
// public void SHOOTING(yarnwrap.entity.data.TrackedData value) { wrapperContained.SHOOTING = value.wrapperContained; }
// public boolean method_18450(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18450(entity.wrapperContained); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createGhastAttributes() { return wrapperContained.createGhastAttributes(); }
// public boolean isFireballFromPlayer(yarnwrap.entity.damage.DamageSource damageSource) { return wrapperContained.isFireballFromPlayer(damageSource.wrapperContained); }
public void setShooting(boolean shooting) { wrapperContained.setShooting(shooting); }
public int getFireballStrength() { return wrapperContained.getFireballStrength(); }
public boolean isShooting() { return wrapperContained.isShooting(); }

}