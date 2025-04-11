package yarnwrap.entity.passive;
public class TameableEntity { public net.minecraft.entity.passive.TameableEntity wrapperContained; public TameableEntity(net.minecraft.entity.passive.TameableEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean sitting() { return wrapperContained.sitting; }
// public void sitting(boolean value) { wrapperContained.sitting = value; }
// public yarnwrap.entity.data.TrackedData OWNER_UUID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.OWNER_UUID); }
// public void OWNER_UUID(yarnwrap.entity.data.TrackedData value) { wrapperContained.OWNER_UUID = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData TAMEABLE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TAMEABLE_FLAGS); }
// public void TAMEABLE_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.TAMEABLE_FLAGS = value.wrapperContained; }
public boolean isSitting() { return wrapperContained.isSitting(); }
public void setSitting(boolean sitting) { wrapperContained.setSitting(sitting); }
// public void updateAttributesForTamed() { wrapperContained.updateAttributesForTamed(); }
// public boolean tryTeleportTo(int x,int y,int z) { return wrapperContained.tryTeleportTo(x,y,z); }
// public void tryTeleportNear(yarnwrap.util.math.BlockPos pos) { wrapperContained.tryTeleportNear(pos.wrapperContained); }
public void tryTeleportToOwner() { wrapperContained.tryTeleportToOwner(); }
public boolean shouldTryTeleportToOwner() { return wrapperContained.shouldTryTeleportToOwner(); }
public boolean cannotFollowOwner() { return wrapperContained.cannotFollowOwner(); }
// public boolean canTeleportOntoLeaves() { return wrapperContained.canTeleportOntoLeaves(); }
// public boolean canTeleportTo(yarnwrap.util.math.BlockPos pos) { return wrapperContained.canTeleportTo(pos.wrapperContained); }
public void setOwner(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.setOwner(player.wrapperContained); }
public boolean isOwner(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isOwner(entity.wrapperContained); }
public boolean isInSittingPose() { return wrapperContained.isInSittingPose(); }
public void setTamed(boolean tamed,boolean updateAttributes) { wrapperContained.setTamed(tamed,updateAttributes); }
public void setOwnerUuid(java.util.UUID uuid) { wrapperContained.setOwnerUuid(uuid); }
public boolean canAttackWithOwner(yarnwrap.entity.LivingEntity target,yarnwrap.entity.LivingEntity owner) { return wrapperContained.canAttackWithOwner(target.wrapperContained,owner.wrapperContained); }
public void setInSittingPose(boolean inSittingPose) { wrapperContained.setInSittingPose(inSittingPose); }
// public void showEmoteParticle(boolean positive) { wrapperContained.showEmoteParticle(positive); }
public boolean isTamed() { return wrapperContained.isTamed(); }

}