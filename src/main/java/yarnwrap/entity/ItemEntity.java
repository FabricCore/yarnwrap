package yarnwrap.entity;
public class ItemEntity { public net.minecraft.entity.ItemEntity wrapperContained; public ItemEntity(net.minecraft.entity.ItemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DESPAWN_AGE() { return wrapperContained.DESPAWN_AGE; }
// public void DESPAWN_AGE(int value) { wrapperContained.DESPAWN_AGE = value; }
// public int CANNOT_PICK_UP_DELAY() { return wrapperContained.CANNOT_PICK_UP_DELAY; }
// public void CANNOT_PICK_UP_DELAY(int value) { wrapperContained.CANNOT_PICK_UP_DELAY = value; }
// public int NEVER_DESPAWN_AGE() { return wrapperContained.NEVER_DESPAWN_AGE; }
// public void NEVER_DESPAWN_AGE(int value) { wrapperContained.NEVER_DESPAWN_AGE = value; }
// public java.util.UUID owner() { return wrapperContained.owner; }
// public void owner(java.util.UUID value) { wrapperContained.owner = value; }
// public yarnwrap.entity.Entity thrower() { return new yarnwrap.entity.Entity(wrapperContained.thrower); }
// public void thrower(yarnwrap.entity.Entity value) { wrapperContained.thrower = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData STACK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STACK); }
// public void STACK(yarnwrap.entity.data.TrackedData value) { wrapperContained.STACK = value.wrapperContained; }
// public java.util.UUID throwerUuid() { return wrapperContained.throwerUuid; }
// public void throwerUuid(java.util.UUID value) { wrapperContained.throwerUuid = value; }
// public int health() { return wrapperContained.health; }
// public void health(int value) { wrapperContained.health = value; }
// public int pickupDelay() { return wrapperContained.pickupDelay; }
// public void pickupDelay(int value) { wrapperContained.pickupDelay = value; }
public float uniqueOffset() { return wrapperContained.uniqueOffset; }
// public void uniqueOffset(float value) { wrapperContained.uniqueOffset = value; }
// public int itemAge() { return wrapperContained.itemAge; }
// public void itemAge(int value) { wrapperContained.itemAge = value; }
// public ItemEntity(yarnwrap.entity.ItemEntity entity) { this.wrapperContained = new net.minecraft.entity.ItemEntity(entity.wrapperContained); }
public ItemEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.ItemEntity(world.wrapperContained,x,y,z,stack.wrapperContained); }
public ItemEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack,double velocityX,double velocityY,double velocityZ) { this.wrapperContained = new net.minecraft.entity.ItemEntity(world.wrapperContained,x,y,z,stack.wrapperContained,velocityX,velocityY,velocityZ); }
// public void merge(yarnwrap.entity.ItemEntity targetEntity,yarnwrap.item.ItemStack targetStack,yarnwrap.entity.ItemEntity sourceEntity,yarnwrap.item.ItemStack sourceStack) { wrapperContained.merge(targetEntity.wrapperContained,targetStack.wrapperContained,sourceEntity.wrapperContained,sourceStack.wrapperContained); }
// public boolean method_20396(yarnwrap.entity.ItemEntity otherItemEntity) { return wrapperContained.method_20396(otherItemEntity.wrapperContained); }
// public boolean canMerge() { return wrapperContained.canMerge(); }
// public void merge(yarnwrap.entity.ItemEntity targetEntity,yarnwrap.item.ItemStack stack1,yarnwrap.item.ItemStack stack2) { wrapperContained.merge(targetEntity.wrapperContained,stack1.wrapperContained,stack2.wrapperContained); }
public boolean canMerge(yarnwrap.item.ItemStack stack1,yarnwrap.item.ItemStack stack2) { return wrapperContained.canMerge(stack1.wrapperContained,stack2.wrapperContained); }
public yarnwrap.item.ItemStack merge(yarnwrap.item.ItemStack stack1,yarnwrap.item.ItemStack stack2,int maxCount) { return new yarnwrap.item.ItemStack(wrapperContained.merge(stack1.wrapperContained,stack2.wrapperContained,maxCount)); }
// public void applyLavaBuoyancy() { wrapperContained.applyLavaBuoyancy(); }
public float getRotation(float tickDelta) { return wrapperContained.getRotation(tickDelta); }
public yarnwrap.entity.ItemEntity copy() { return new yarnwrap.entity.ItemEntity(wrapperContained.copy()); }
public void setNeverDespawn() { wrapperContained.setNeverDespawn(); }
public void setOwner(java.util.UUID owner) { wrapperContained.setOwner(owner); }
// public void tryMerge(yarnwrap.entity.ItemEntity other) { wrapperContained.tryMerge(other.wrapperContained); }
// public void tryMerge() { wrapperContained.tryMerge(); }
// public void applyWaterBuoyancy() { wrapperContained.applyWaterBuoyancy(); }
public void resetPickupDelay() { wrapperContained.resetPickupDelay(); }
public void setCovetedItem() { wrapperContained.setCovetedItem(); }
public boolean cannotPickup() { return wrapperContained.cannotPickup(); }
public void setStack(yarnwrap.item.ItemStack stack) { wrapperContained.setStack(stack.wrapperContained); }
public void setThrower(yarnwrap.entity.Entity thrower) { wrapperContained.setThrower(thrower.wrapperContained); }
public void setPickupDelay(int pickupDelay) { wrapperContained.setPickupDelay(pickupDelay); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
public int getItemAge() { return wrapperContained.getItemAge(); }
public void setDespawnImmediately() { wrapperContained.setDespawnImmediately(); }
public void setToDefaultPickupDelay() { wrapperContained.setToDefaultPickupDelay(); }
public void setPickupDelayInfinite() { wrapperContained.setPickupDelayInfinite(); }

}