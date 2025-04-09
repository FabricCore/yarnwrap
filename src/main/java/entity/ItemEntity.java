package yarnwrap.entity;
public class ItemEntity { public net.minecraft.entity.ItemEntity wrapperContained; public ItemEntity(net.minecraft.entity.ItemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DESPAWN_AGE() { return wrapperContained.DESPAWN_AGE; }
// public int CANNOT_PICK_UP_DELAY() { return wrapperContained.CANNOT_PICK_UP_DELAY; }
// public int NEVER_DESPAWN_AGE() { return wrapperContained.NEVER_DESPAWN_AGE; }
// public java.util.UUID owner() { return wrapperContained.owner; }
// public yarnwrap.entity.Entity thrower() { return new yarnwrap.entity.Entity(wrapperContained.thrower); }
// public yarnwrap.entity.data.TrackedData STACK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STACK); }
// public java.util.UUID throwerUuid() { return wrapperContained.throwerUuid; }
// public int health() { return wrapperContained.health; }
// public int pickupDelay() { return wrapperContained.pickupDelay; }
public float uniqueOffset() { return wrapperContained.uniqueOffset; }
// public int itemAge() { return wrapperContained.itemAge; }
// public void merge(yarnwrap.entity.ItemEntity targetEntity,yarnwrap.item.ItemStack targetStack,yarnwrap.entity.ItemEntity sourceEntity,yarnwrap.item.ItemStack sourceStack) { wrapperContained.merge(targetEntity.wrapperContained,targetStack.wrapperContained,sourceEntity.wrapperContained,sourceStack.wrapperContained); }
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