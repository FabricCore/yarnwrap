package yarnwrap.entity.passive;
public class OcelotEntity { public net.minecraft.entity.passive.OcelotEntity wrapperContained; public OcelotEntity(net.minecraft.entity.passive.OcelotEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object fleeGoal() { return wrapperContained.fleeGoal; }
// public yarnwrap.entity.data.TrackedData TRUSTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRUSTING); }
// public Object temptGoal() { return wrapperContained.temptGoal; }
public double CROUCHING_SPEED() { return wrapperContained.CROUCHING_SPEED; }
public double NORMAL_SPEED() { return wrapperContained.NORMAL_SPEED; }
public double SPRINTING_SPEED() { return wrapperContained.SPRINTING_SPEED; }
// public boolean isTrusting() { return wrapperContained.isTrusting(); }
// public void showEmoteParticle(boolean positive) { wrapperContained.showEmoteParticle(positive); }
// public void setTrusting(boolean trusting) { wrapperContained.setTrusting(trusting); }
// public void updateFleeing() { wrapperContained.updateFleeing(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createOcelotAttributes() { return wrapperContained.createOcelotAttributes(); }

}