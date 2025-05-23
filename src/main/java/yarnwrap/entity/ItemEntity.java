package yarnwrap.entity;
public class ItemEntity { public net.minecraft.entity.ItemEntity wrapperContained; public ItemEntity(net.minecraft.entity.ItemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData STACK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.STACK); }
// public void STACK(yarnwrap.entity.data.TrackedData value) { wrapperContained.STACK = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData STACK() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.ItemEntity.STACK); }
// public static void STACK(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.ItemEntity.STACK = value.wrapperContained; }

// // public yarnwrap.entity.LazyEntityReference thrower() { return new yarnwrap.entity.LazyEntityReference(wrapperContained.thrower); }
// // public void thrower(yarnwrap.entity.LazyEntityReference value) { wrapperContained.thrower = value.wrapperContained; }
// // public static yarnwrap.entity.LazyEntityReference thrower() { return new yarnwrap.entity.LazyEntityReference(net.minecraft.entity.ItemEntity.thrower); }
// // public static void thrower(yarnwrap.entity.LazyEntityReference value, ) { net.minecraft.entity.ItemEntity.thrower = value.wrapperContained; }

// public int health() { return wrapperContained.health; }
// public void health(int value) { wrapperContained.health = value; }
// public static int health() { return net.minecraft.entity.ItemEntity.health; }
// public static void health(int value, ) { net.minecraft.entity.ItemEntity.health = value; }

// public int pickupDelay() { return wrapperContained.pickupDelay; }
// public void pickupDelay(int value) { wrapperContained.pickupDelay = value; }
// public static int pickupDelay() { return net.minecraft.entity.ItemEntity.pickupDelay; }
// public static void pickupDelay(int value, ) { net.minecraft.entity.ItemEntity.pickupDelay = value; }

public float uniqueOffset() { return wrapperContained.uniqueOffset; }
// public void uniqueOffset(float value) { wrapperContained.uniqueOffset = value; }
// public static float uniqueOffset() { return net.minecraft.entity.ItemEntity.uniqueOffset; }
// public static void uniqueOffset(float value, ) { net.minecraft.entity.ItemEntity.uniqueOffset = value; }

// public int itemAge() { return wrapperContained.itemAge; }
// public void itemAge(int value) { wrapperContained.itemAge = value; }
// public static int itemAge() { return net.minecraft.entity.ItemEntity.itemAge; }
// public static void itemAge(int value, ) { net.minecraft.entity.ItemEntity.itemAge = value; }

// public int DESPAWN_AGE() { return wrapperContained.DESPAWN_AGE; }
// public void DESPAWN_AGE(int value) { wrapperContained.DESPAWN_AGE = value; }
// public static int DESPAWN_AGE() { return net.minecraft.entity.ItemEntity.DESPAWN_AGE; }
// public static void DESPAWN_AGE(int value, ) { net.minecraft.entity.ItemEntity.DESPAWN_AGE = value; }

// public int CANNOT_PICK_UP_DELAY() { return wrapperContained.CANNOT_PICK_UP_DELAY; }
// public void CANNOT_PICK_UP_DELAY(int value) { wrapperContained.CANNOT_PICK_UP_DELAY = value; }
// public static int CANNOT_PICK_UP_DELAY() { return net.minecraft.entity.ItemEntity.CANNOT_PICK_UP_DELAY; }
// public static void CANNOT_PICK_UP_DELAY(int value, ) { net.minecraft.entity.ItemEntity.CANNOT_PICK_UP_DELAY = value; }

// public int NEVER_DESPAWN_AGE() { return wrapperContained.NEVER_DESPAWN_AGE; }
// public void NEVER_DESPAWN_AGE(int value) { wrapperContained.NEVER_DESPAWN_AGE = value; }
// public static int NEVER_DESPAWN_AGE() { return net.minecraft.entity.ItemEntity.NEVER_DESPAWN_AGE; }
// public static void NEVER_DESPAWN_AGE(int value, ) { net.minecraft.entity.ItemEntity.NEVER_DESPAWN_AGE = value; }

// public java.util.UUID owner() { return wrapperContained.owner; }
// public void owner(java.util.UUID value) { wrapperContained.owner = value; }
// public static java.util.UUID owner() { return net.minecraft.entity.ItemEntity.owner; }
// public static void owner(java.util.UUID value, ) { net.minecraft.entity.ItemEntity.owner = value; }

// public int DEFAULT_HEALTH() { return wrapperContained.DEFAULT_HEALTH; }
// public void DEFAULT_HEALTH(int value) { wrapperContained.DEFAULT_HEALTH = value; }
// public static int DEFAULT_HEALTH() { return net.minecraft.entity.ItemEntity.DEFAULT_HEALTH; }
// public static void DEFAULT_HEALTH(int value, ) { net.minecraft.entity.ItemEntity.DEFAULT_HEALTH = value; }

// public short DEFAULT_AGE() { return wrapperContained.DEFAULT_AGE; }
// public void DEFAULT_AGE(short value) { wrapperContained.DEFAULT_AGE = value; }
// public static short DEFAULT_AGE() { return net.minecraft.entity.ItemEntity.DEFAULT_AGE; }
// public static void DEFAULT_AGE(short value, ) { net.minecraft.entity.ItemEntity.DEFAULT_AGE = value; }

// public short DEFAULT_PICKUP_DELAY() { return wrapperContained.DEFAULT_PICKUP_DELAY; }
// public void DEFAULT_PICKUP_DELAY(short value) { wrapperContained.DEFAULT_PICKUP_DELAY = value; }
// public static short DEFAULT_PICKUP_DELAY() { return net.minecraft.entity.ItemEntity.DEFAULT_PICKUP_DELAY; }
// public static void DEFAULT_PICKUP_DELAY(short value, ) { net.minecraft.entity.ItemEntity.DEFAULT_PICKUP_DELAY = value; }

// public ItemEntity(yarnwrap.entity.ItemEntity entity) { this.wrapperContained = new net.minecraft.entity.ItemEntity(entity.wrapperContained); }
public ItemEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack) { this.wrapperContained = new net.minecraft.entity.ItemEntity(world.wrapperContained,x,y,z,stack.wrapperContained); }
public ItemEntity(yarnwrap.world.World world,double x,double y,double z,yarnwrap.item.ItemStack stack,double velocityX,double velocityY,double velocityZ) { this.wrapperContained = new net.minecraft.entity.ItemEntity(world.wrapperContained,x,y,z,stack.wrapperContained,velocityX,velocityY,velocityZ); }
// public void tryMerge(yarnwrap.entity.ItemEntity other) { wrapperContained.tryMerge(other.wrapperContained); }
// public static void tryMerge(yarnwrap.entity.ItemEntity other, ) { net.minecraft.entity.ItemEntity.tryMerge(other.wrapperContained); }
// public void tryMerge() { wrapperContained.tryMerge(); }
// public static void tryMerge() { net.minecraft.entity.ItemEntity.tryMerge(); }
// public void applyWaterBuoyancy() { wrapperContained.applyWaterBuoyancy(); }
// public static void applyWaterBuoyancy() { net.minecraft.entity.ItemEntity.applyWaterBuoyancy(); }
public void resetPickupDelay() { wrapperContained.resetPickupDelay(); }
// public static void resetPickupDelay() { net.minecraft.entity.ItemEntity.resetPickupDelay(); }
public void setCovetedItem() { wrapperContained.setCovetedItem(); }
// public static void setCovetedItem() { net.minecraft.entity.ItemEntity.setCovetedItem(); }
public boolean cannotPickup() { return wrapperContained.cannotPickup(); }
// public static boolean cannotPickup() { return net.minecraft.entity.ItemEntity.cannotPickup(); }
public void setStack(yarnwrap.item.ItemStack stack) { wrapperContained.setStack(stack.wrapperContained); }
// public static void setStack(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.ItemEntity.setStack(stack.wrapperContained); }
public void setThrower(yarnwrap.entity.Entity thrower) { wrapperContained.setThrower(thrower.wrapperContained); }
// public static void setThrower(yarnwrap.entity.Entity thrower, ) { net.minecraft.entity.ItemEntity.setThrower(thrower.wrapperContained); }
public void setPickupDelay(int pickupDelay) { wrapperContained.setPickupDelay(pickupDelay); }
// public static void setPickupDelay(int pickupDelay, ) { net.minecraft.entity.ItemEntity.setPickupDelay(pickupDelay); }
public yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(wrapperContained.getStack()); }
// public static yarnwrap.item.ItemStack getStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.ItemEntity.getStack()); }
public int getItemAge() { return wrapperContained.getItemAge(); }
// public static int getItemAge() { return net.minecraft.entity.ItemEntity.getItemAge(); }
public void setDespawnImmediately() { wrapperContained.setDespawnImmediately(); }
// public static void setDespawnImmediately() { net.minecraft.entity.ItemEntity.setDespawnImmediately(); }
public void setToDefaultPickupDelay() { wrapperContained.setToDefaultPickupDelay(); }
// public static void setToDefaultPickupDelay() { net.minecraft.entity.ItemEntity.setToDefaultPickupDelay(); }
public void setPickupDelayInfinite() { wrapperContained.setPickupDelayInfinite(); }
// public static void setPickupDelayInfinite() { net.minecraft.entity.ItemEntity.setPickupDelayInfinite(); }
// public void merge(yarnwrap.entity.ItemEntity targetEntity,yarnwrap.item.ItemStack targetStack,yarnwrap.entity.ItemEntity sourceEntity,yarnwrap.item.ItemStack sourceStack) { wrapperContained.merge(targetEntity.wrapperContained,targetStack.wrapperContained,sourceEntity.wrapperContained,sourceStack.wrapperContained); }
// public static void merge(yarnwrap.entity.ItemEntity targetEntity,yarnwrap.item.ItemStack targetStack,yarnwrap.entity.ItemEntity sourceEntity,yarnwrap.item.ItemStack sourceStack, ) { net.minecraft.entity.ItemEntity.merge(targetEntity.wrapperContained,targetStack.wrapperContained,sourceEntity.wrapperContained,sourceStack.wrapperContained); }
// public boolean method_20396(yarnwrap.entity.ItemEntity otherItemEntity) { return wrapperContained.method_20396(otherItemEntity.wrapperContained); }
// public static boolean method_20396(yarnwrap.entity.ItemEntity otherItemEntity, ) { return net.minecraft.entity.ItemEntity.method_20396(otherItemEntity.wrapperContained); }
// public boolean canMerge() { return wrapperContained.canMerge(); }
// public static boolean canMerge() { return net.minecraft.entity.ItemEntity.canMerge(); }
// public void merge(yarnwrap.entity.ItemEntity targetEntity,yarnwrap.item.ItemStack stack1,yarnwrap.item.ItemStack stack2) { wrapperContained.merge(targetEntity.wrapperContained,stack1.wrapperContained,stack2.wrapperContained); }
// public static void merge(yarnwrap.entity.ItemEntity targetEntity,yarnwrap.item.ItemStack stack1,yarnwrap.item.ItemStack stack2, ) { net.minecraft.entity.ItemEntity.merge(targetEntity.wrapperContained,stack1.wrapperContained,stack2.wrapperContained); }
// public boolean canMerge(yarnwrap.item.ItemStack stack1,yarnwrap.item.ItemStack stack2) { return wrapperContained.canMerge(stack1.wrapperContained,stack2.wrapperContained); }
// public static boolean canMerge(yarnwrap.item.ItemStack stack1,yarnwrap.item.ItemStack stack2, ) { return net.minecraft.entity.ItemEntity.canMerge(stack1.wrapperContained,stack2.wrapperContained); }
// public yarnwrap.item.ItemStack merge(yarnwrap.item.ItemStack stack1,yarnwrap.item.ItemStack stack2,int maxCount) { return new yarnwrap.item.ItemStack(wrapperContained.merge(stack1.wrapperContained,stack2.wrapperContained,maxCount)); }
// public static yarnwrap.item.ItemStack merge(yarnwrap.item.ItemStack stack1,yarnwrap.item.ItemStack stack2,int maxCount, ) { return new yarnwrap.item.ItemStack(net.minecraft.entity.ItemEntity.merge(stack1.wrapperContained,stack2.wrapperContained,maxCount)); }
// public void applyLavaBuoyancy() { wrapperContained.applyLavaBuoyancy(); }
// public static void applyLavaBuoyancy() { net.minecraft.entity.ItemEntity.applyLavaBuoyancy(); }
// public float getRotation() { return wrapperContained.getRotation(); }
// public static float getRotation() { return net.minecraft.entity.ItemEntity.getRotation(); }
public yarnwrap.entity.ItemEntity copy() { return new yarnwrap.entity.ItemEntity(wrapperContained.copy()); }
// public static yarnwrap.entity.ItemEntity copy() { return new yarnwrap.entity.ItemEntity(net.minecraft.entity.ItemEntity.copy()); }
public void setNeverDespawn() { wrapperContained.setNeverDespawn(); }
// public static void setNeverDespawn() { net.minecraft.entity.ItemEntity.setNeverDespawn(); }
public void setOwner(java.util.UUID owner) { wrapperContained.setOwner(owner); }
// public static void setOwner(java.util.UUID owner, ) { net.minecraft.entity.ItemEntity.setOwner(owner); }
// public void applyBuoyancy(double horizontalMultiplier) { wrapperContained.applyBuoyancy(horizontalMultiplier); }
// public static void applyBuoyancy(double horizontalMultiplier, ) { net.minecraft.entity.ItemEntity.applyBuoyancy(horizontalMultiplier); }

}