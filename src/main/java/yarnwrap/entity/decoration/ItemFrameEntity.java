package yarnwrap.entity.decoration;
public class ItemFrameEntity { public net.minecraft.entity.decoration.ItemFrameEntity wrapperContained; public ItemFrameEntity(net.minecraft.entity.decoration.ItemFrameEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean fixed() { return wrapperContained.fixed; }
// public void fixed(boolean value) { wrapperContained.fixed = value; }
// public float itemDropChance() { return wrapperContained.itemDropChance; }
// public void itemDropChance(float value) { wrapperContained.itemDropChance = value; }
// public yarnwrap.entity.data.TrackedData ITEM_STACK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM_STACK); }
// public void ITEM_STACK(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM_STACK = value.wrapperContained; }
// public yarnwrap.entity.data.TrackedData ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ROTATION); }
// public void ROTATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.ROTATION = value.wrapperContained; }
// public yarnwrap.item.ItemStack getAsItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getAsItemStack()); }
public yarnwrap.sound.SoundEvent getRemoveItemSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getRemoveItemSound()); }
public yarnwrap.sound.SoundEvent getBreakSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBreakSound()); }
public yarnwrap.sound.SoundEvent getPlaceSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getPlaceSound()); }
public yarnwrap.sound.SoundEvent getAddItemSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getAddItemSound()); }
public yarnwrap.sound.SoundEvent getRotateItemSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getRotateItemSound()); }
// public void setAsStackHolder(yarnwrap.item.ItemStack stack) { wrapperContained.setAsStackHolder(stack.wrapperContained); }
// public yarnwrap.component.type.MapIdComponent getMapId() { return new yarnwrap.component.type.MapIdComponent(wrapperContained.getMapId()); }
public boolean containsMap() { return wrapperContained.containsMap(); }
public void setHeldItemStack(yarnwrap.item.ItemStack value,boolean update) { wrapperContained.setHeldItemStack(value.wrapperContained,update); }
public int getRotation() { return wrapperContained.getRotation(); }
public void setHeldItemStack(yarnwrap.item.ItemStack stack) { wrapperContained.setHeldItemStack(stack.wrapperContained); }
// public void dropHeldStack(yarnwrap.entity.Entity entity,boolean alwaysDrop) { wrapperContained.dropHeldStack(entity.wrapperContained,alwaysDrop); }
// public void removeFromFrame(yarnwrap.item.ItemStack stack) { wrapperContained.removeFromFrame(stack.wrapperContained); }
public int getComparatorPower() { return wrapperContained.getComparatorPower(); }
public void setRotation(int value) { wrapperContained.setRotation(value); }
public yarnwrap.item.ItemStack getHeldItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getHeldItemStack()); }
// public void setRotation(int value,boolean updateComparators) { wrapperContained.setRotation(value,updateComparators); }

}