package yarnwrap.entity.passive;
public class OcelotEntity { public net.minecraft.entity.passive.OcelotEntity wrapperContained; public OcelotEntity(net.minecraft.entity.passive.OcelotEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object fleeGoal() { return wrapperContained.fleeGoal; }
// // public void fleeGoal(Object value) { wrapperContained.fleeGoal = value; }
// public yarnwrap.entity.data.TrackedData TRUSTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRUSTING); }
// public void TRUSTING(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRUSTING = value.wrapperContained; }
// public Object temptGoal() { return wrapperContained.temptGoal; }
// // public void temptGoal(Object value) { wrapperContained.temptGoal = value; }
public double CROUCHING_SPEED() { return wrapperContained.CROUCHING_SPEED; }
// public void CROUCHING_SPEED(double value) { wrapperContained.CROUCHING_SPEED = value; }
public double NORMAL_SPEED() { return wrapperContained.NORMAL_SPEED; }
// public void NORMAL_SPEED(double value) { wrapperContained.NORMAL_SPEED = value; }
public double SPRINTING_SPEED() { return wrapperContained.SPRINTING_SPEED; }
// public void SPRINTING_SPEED(double value) { wrapperContained.SPRINTING_SPEED = value; }
// public boolean isTrusting() { return wrapperContained.isTrusting(); }
// public void showEmoteParticle(boolean positive) { wrapperContained.showEmoteParticle(positive); }
// public void setTrusting(boolean trusting) { wrapperContained.setTrusting(trusting); }
// public void updateFleeing() { wrapperContained.updateFleeing(); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public Object createOcelotAttributes() { return wrapperContained.createOcelotAttributes(); }
// public boolean method_58370(yarnwrap.item.ItemStack stack) { return wrapperContained.method_58370(stack.wrapperContained); }

}