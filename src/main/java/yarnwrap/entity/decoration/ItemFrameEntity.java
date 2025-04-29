package yarnwrap.entity.decoration;
public class ItemFrameEntity { public net.minecraft.entity.decoration.ItemFrameEntity wrapperContained; public ItemFrameEntity(net.minecraft.entity.decoration.ItemFrameEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean fixed() { return wrapperContained.fixed; }
// public void fixed(boolean value) { wrapperContained.fixed = value; }
// public static boolean fixed() { return net.minecraft.entity.decoration.ItemFrameEntity.fixed; }
// public static void fixed(boolean value, ) { net.minecraft.entity.decoration.ItemFrameEntity.fixed = value; }

// public float itemDropChance() { return wrapperContained.itemDropChance; }
// public void itemDropChance(float value) { wrapperContained.itemDropChance = value; }
// public static float itemDropChance() { return net.minecraft.entity.decoration.ItemFrameEntity.itemDropChance; }
// public static void itemDropChance(float value, ) { net.minecraft.entity.decoration.ItemFrameEntity.itemDropChance = value; }

// public yarnwrap.entity.data.TrackedData ITEM_STACK() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ITEM_STACK); }
// public void ITEM_STACK(yarnwrap.entity.data.TrackedData value) { wrapperContained.ITEM_STACK = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ITEM_STACK() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.decoration.ItemFrameEntity.ITEM_STACK); }
// public static void ITEM_STACK(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.decoration.ItemFrameEntity.ITEM_STACK = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ROTATION); }
// public void ROTATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.ROTATION = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData ROTATION() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.decoration.ItemFrameEntity.ROTATION); }
// public static void ROTATION(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.decoration.ItemFrameEntity.ROTATION = value.wrapperContained; }

public ItemFrameEntity(yarnwrap.entity.EntityType type,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing) { this.wrapperContained = new net.minecraft.entity.decoration.ItemFrameEntity(type.wrapperContained,world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
public ItemFrameEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing) { this.wrapperContained = new net.minecraft.entity.decoration.ItemFrameEntity(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
// public yarnwrap.item.ItemStack getAsItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getAsItemStack()); }
// public static yarnwrap.item.ItemStack getAsItemStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.decoration.ItemFrameEntity.getAsItemStack()); }
public yarnwrap.sound.SoundEvent getRemoveItemSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getRemoveItemSound()); }
// public static yarnwrap.sound.SoundEvent getRemoveItemSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.decoration.ItemFrameEntity.getRemoveItemSound()); }
public yarnwrap.sound.SoundEvent getBreakSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBreakSound()); }
// public static yarnwrap.sound.SoundEvent getBreakSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.decoration.ItemFrameEntity.getBreakSound()); }
public yarnwrap.sound.SoundEvent getPlaceSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getPlaceSound()); }
// public static yarnwrap.sound.SoundEvent getPlaceSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.decoration.ItemFrameEntity.getPlaceSound()); }
public yarnwrap.sound.SoundEvent getAddItemSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getAddItemSound()); }
// public static yarnwrap.sound.SoundEvent getAddItemSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.decoration.ItemFrameEntity.getAddItemSound()); }
public yarnwrap.sound.SoundEvent getRotateItemSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getRotateItemSound()); }
// public static yarnwrap.sound.SoundEvent getRotateItemSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.decoration.ItemFrameEntity.getRotateItemSound()); }
// public void setAsStackHolder(yarnwrap.item.ItemStack stack) { wrapperContained.setAsStackHolder(stack.wrapperContained); }
// public static void setAsStackHolder(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.decoration.ItemFrameEntity.setAsStackHolder(stack.wrapperContained); }
// public yarnwrap.component.type.MapIdComponent getMapId() { return new yarnwrap.component.type.MapIdComponent(wrapperContained.getMapId()); }
// public static yarnwrap.component.type.MapIdComponent getMapId() { return new yarnwrap.component.type.MapIdComponent(net.minecraft.entity.decoration.ItemFrameEntity.getMapId()); }
public boolean containsMap() { return wrapperContained.containsMap(); }
// public static boolean containsMap() { return net.minecraft.entity.decoration.ItemFrameEntity.containsMap(); }
public void setHeldItemStack(yarnwrap.item.ItemStack value,boolean update) { wrapperContained.setHeldItemStack(value.wrapperContained,update); }
// public static void setHeldItemStack(yarnwrap.item.ItemStack value,boolean update, ) { net.minecraft.entity.decoration.ItemFrameEntity.setHeldItemStack(value.wrapperContained,update); }
public int getRotation() { return wrapperContained.getRotation(); }
// public static int getRotation() { return net.minecraft.entity.decoration.ItemFrameEntity.getRotation(); }
public void setHeldItemStack(yarnwrap.item.ItemStack stack) { wrapperContained.setHeldItemStack(stack.wrapperContained); }
// public static void setHeldItemStack(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.decoration.ItemFrameEntity.setHeldItemStack(stack.wrapperContained); }
// public void dropHeldStack(yarnwrap.entity.Entity entity,boolean alwaysDrop) { wrapperContained.dropHeldStack(entity.wrapperContained,alwaysDrop); }
// public static void dropHeldStack(yarnwrap.entity.Entity entity,boolean alwaysDrop, ) { net.minecraft.entity.decoration.ItemFrameEntity.dropHeldStack(entity.wrapperContained,alwaysDrop); }
// public void removeFromFrame(yarnwrap.item.ItemStack stack) { wrapperContained.removeFromFrame(stack.wrapperContained); }
// public static void removeFromFrame(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.decoration.ItemFrameEntity.removeFromFrame(stack.wrapperContained); }
public int getComparatorPower() { return wrapperContained.getComparatorPower(); }
// public static int getComparatorPower() { return net.minecraft.entity.decoration.ItemFrameEntity.getComparatorPower(); }
public void setRotation(int value) { wrapperContained.setRotation(value); }
// public static void setRotation(int value, ) { net.minecraft.entity.decoration.ItemFrameEntity.setRotation(value); }
public yarnwrap.item.ItemStack getHeldItemStack() { return new yarnwrap.item.ItemStack(wrapperContained.getHeldItemStack()); }
// public static yarnwrap.item.ItemStack getHeldItemStack() { return new yarnwrap.item.ItemStack(net.minecraft.entity.decoration.ItemFrameEntity.getHeldItemStack()); }
// public void setRotation(int value,boolean updateComparators) { wrapperContained.setRotation(value,updateComparators); }
// public static void setRotation(int value,boolean updateComparators, ) { net.minecraft.entity.decoration.ItemFrameEntity.setRotation(value,updateComparators); }

}