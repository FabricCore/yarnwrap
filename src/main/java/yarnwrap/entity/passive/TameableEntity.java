package yarnwrap.entity.passive;
public class TameableEntity { public net.minecraft.entity.passive.TameableEntity wrapperContained; public TameableEntity(net.minecraft.entity.passive.TameableEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean sitting() { return wrapperContained.sitting; }
// public void sitting(boolean value) { wrapperContained.sitting = value; }
// public static boolean sitting() { return net.minecraft.entity.passive.TameableEntity.sitting; }
// public static void sitting(boolean value, ) { net.minecraft.entity.passive.TameableEntity.sitting = value; }

// public yarnwrap.entity.data.TrackedData OWNER_UUID() { return new yarnwrap.entity.data.TrackedData(wrapperContained.OWNER_UUID); }
// public void OWNER_UUID(yarnwrap.entity.data.TrackedData value) { wrapperContained.OWNER_UUID = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData OWNER_UUID() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TameableEntity.OWNER_UUID); }
// public static void OWNER_UUID(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TameableEntity.OWNER_UUID = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData TAMEABLE_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TAMEABLE_FLAGS); }
// public void TAMEABLE_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.TAMEABLE_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData TAMEABLE_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TameableEntity.TAMEABLE_FLAGS); }
// public static void TAMEABLE_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TameableEntity.TAMEABLE_FLAGS = value.wrapperContained; }

public boolean isSitting() { return wrapperContained.isSitting(); }
// public static boolean isSitting() { return net.minecraft.entity.passive.TameableEntity.isSitting(); }
public void setSitting(boolean sitting) { wrapperContained.setSitting(sitting); }
// public static void setSitting(boolean sitting, ) { net.minecraft.entity.passive.TameableEntity.setSitting(sitting); }
// public void updateAttributesForTamed() { wrapperContained.updateAttributesForTamed(); }
// public static void updateAttributesForTamed() { net.minecraft.entity.passive.TameableEntity.updateAttributesForTamed(); }
// public boolean tryTeleportTo(int x,int y,int z) { return wrapperContained.tryTeleportTo(x,y,z); }
// public static boolean tryTeleportTo(int x,int y,int z, ) { return net.minecraft.entity.passive.TameableEntity.tryTeleportTo(x,y,z); }
// public void tryTeleportNear(yarnwrap.util.math.BlockPos pos) { wrapperContained.tryTeleportNear(pos.wrapperContained); }
// public static void tryTeleportNear(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.entity.passive.TameableEntity.tryTeleportNear(pos.wrapperContained); }
public void tryTeleportToOwner() { wrapperContained.tryTeleportToOwner(); }
// public static void tryTeleportToOwner() { net.minecraft.entity.passive.TameableEntity.tryTeleportToOwner(); }
public boolean shouldTryTeleportToOwner() { return wrapperContained.shouldTryTeleportToOwner(); }
// public static boolean shouldTryTeleportToOwner() { return net.minecraft.entity.passive.TameableEntity.shouldTryTeleportToOwner(); }
public boolean cannotFollowOwner() { return wrapperContained.cannotFollowOwner(); }
// public static boolean cannotFollowOwner() { return net.minecraft.entity.passive.TameableEntity.cannotFollowOwner(); }
// public boolean canTeleportOntoLeaves() { return wrapperContained.canTeleportOntoLeaves(); }
// public static boolean canTeleportOntoLeaves() { return net.minecraft.entity.passive.TameableEntity.canTeleportOntoLeaves(); }
// public boolean canTeleportTo(yarnwrap.util.math.BlockPos pos) { return wrapperContained.canTeleportTo(pos.wrapperContained); }
// public static boolean canTeleportTo(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.entity.passive.TameableEntity.canTeleportTo(pos.wrapperContained); }
public void setOwner(yarnwrap.entity.player.PlayerEntity player) { wrapperContained.setOwner(player.wrapperContained); }
// public static void setOwner(yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.entity.passive.TameableEntity.setOwner(player.wrapperContained); }
public boolean isOwner(yarnwrap.entity.LivingEntity entity) { return wrapperContained.isOwner(entity.wrapperContained); }
// public static boolean isOwner(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.passive.TameableEntity.isOwner(entity.wrapperContained); }
public boolean isInSittingPose() { return wrapperContained.isInSittingPose(); }
// public static boolean isInSittingPose() { return net.minecraft.entity.passive.TameableEntity.isInSittingPose(); }
public void setTamed(boolean tamed,boolean updateAttributes) { wrapperContained.setTamed(tamed,updateAttributes); }
// public static void setTamed(boolean tamed,boolean updateAttributes, ) { net.minecraft.entity.passive.TameableEntity.setTamed(tamed,updateAttributes); }
public void setOwnerUuid(java.util.UUID uuid) { wrapperContained.setOwnerUuid(uuid); }
// public static void setOwnerUuid(java.util.UUID uuid, ) { net.minecraft.entity.passive.TameableEntity.setOwnerUuid(uuid); }
public boolean canAttackWithOwner(yarnwrap.entity.LivingEntity target,yarnwrap.entity.LivingEntity owner) { return wrapperContained.canAttackWithOwner(target.wrapperContained,owner.wrapperContained); }
// public static boolean canAttackWithOwner(yarnwrap.entity.LivingEntity target,yarnwrap.entity.LivingEntity owner, ) { return net.minecraft.entity.passive.TameableEntity.canAttackWithOwner(target.wrapperContained,owner.wrapperContained); }
public void setInSittingPose(boolean inSittingPose) { wrapperContained.setInSittingPose(inSittingPose); }
// public static void setInSittingPose(boolean inSittingPose, ) { net.minecraft.entity.passive.TameableEntity.setInSittingPose(inSittingPose); }
// public void showEmoteParticle(boolean positive) { wrapperContained.showEmoteParticle(positive); }
// public static void showEmoteParticle(boolean positive, ) { net.minecraft.entity.passive.TameableEntity.showEmoteParticle(positive); }
public boolean isTamed() { return wrapperContained.isTamed(); }
// public static boolean isTamed() { return net.minecraft.entity.passive.TameableEntity.isTamed(); }

}