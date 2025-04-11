package yarnwrap.entity.mob;
public class PiglinEntity { public net.minecraft.entity.mob.PiglinEntity wrapperContained; public PiglinEntity(net.minecraft.entity.mob.PiglinEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.inventory.SimpleInventory inventory() { return new yarnwrap.inventory.SimpleInventory(wrapperContained.inventory); }
// public void inventory(yarnwrap.inventory.SimpleInventory value) { wrapperContained.inventory = value.wrapperContained; }
// public com.google.common.collect.ImmutableList SENSOR_TYPES() { return wrapperContained.SENSOR_TYPES; }
// public void SENSOR_TYPES(com.google.common.collect.ImmutableList value) { wrapperContained.SENSOR_TYPES = value; }
// public yarnwrap.entity.data.TrackedData BABY() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BABY); }
// public void BABY(yarnwrap.entity.data.TrackedData value) { wrapperContained.BABY = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData CHARGING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CHARGING); }
// public void CHARGING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CHARGING = value.wrapperContained; }
// public yarnwrap.util.Identifier BABY_SPEED_BOOST_ID() { return new yarnwrap.util.Identifier(wrapperContained.BABY_SPEED_BOOST_ID); }
// public void BABY_SPEED_BOOST_ID(yarnwrap.util.Identifier value) { wrapperContained.BABY_SPEED_BOOST_ID = value.wrapperContained; }
// public yarnwrap.entity.attribute.EntityAttributeModifier BABY_SPEED_BOOST() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.BABY_SPEED_BOOST); }
// public void BABY_SPEED_BOOST(yarnwrap.entity.attribute.EntityAttributeModifier value) { wrapperContained.BABY_SPEED_BOOST = value.wrapperContained; }
// public com.google.common.collect.ImmutableList MEMORY_MODULE_TYPES() { return wrapperContained.MEMORY_MODULE_TYPES; }
// public void MEMORY_MODULE_TYPES(com.google.common.collect.ImmutableList value) { wrapperContained.MEMORY_MODULE_TYPES = value; }
// public boolean cannotHunt() { return wrapperContained.cannotHunt; }
// public void cannotHunt(boolean value) { wrapperContained.cannotHunt = value; }
// public yarnwrap.entity.data.TrackedData DANCING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.DANCING); }
// public void DANCING(yarnwrap.entity.data.TrackedData value) { wrapperContained.DANCING = value.wrapperContained; }
// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void equipAtChance(yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack,yarnwrap.util.math.random.Random random) { wrapperContained.equipAtChance(slot.wrapperContained,stack.wrapperContained,random.wrapperContained); }
// public yarnwrap.item.ItemStack makeInitialWeapon() { return new yarnwrap.item.ItemStack(wrapperContained.makeInitialWeapon()); }
// public boolean isCharging() { return wrapperContained.isCharging(); }
// public yarnwrap.item.ItemStack addItem(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.addItem(stack.wrapperContained)); }
// public void equipToMainHand(yarnwrap.item.ItemStack stack) { wrapperContained.equipToMainHand(stack.wrapperContained); }
// public void equipToOffHand(yarnwrap.item.ItemStack stack) { wrapperContained.equipToOffHand(stack.wrapperContained); }
// public boolean canEquipStack(yarnwrap.item.ItemStack stack) { return wrapperContained.canEquipStack(stack.wrapperContained); }
// public yarnwrap.entity.Entity getTopMostPassenger(yarnwrap.entity.Entity entity,int maxLevel) { return new yarnwrap.entity.Entity(wrapperContained.getTopMostPassenger(entity.wrapperContained,maxLevel)); }
public Object createPiglinAttributes() { return wrapperContained.createPiglinAttributes(); }
// public void setCannotHunt(boolean cannotHunt) { wrapperContained.setCannotHunt(cannotHunt); }
// public boolean canInsertIntoInventory(yarnwrap.item.ItemStack stack) { return wrapperContained.canInsertIntoInventory(stack.wrapperContained); }
public boolean isDancing() { return wrapperContained.isDancing(); }
public void setDancing(boolean dancing) { wrapperContained.setDancing(dancing); }

}