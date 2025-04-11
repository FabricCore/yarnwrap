package yarnwrap.block.entity;
public class CrafterBlockEntity { public net.minecraft.block.entity.CrafterBlockEntity wrapperContained; public CrafterBlockEntity(net.minecraft.block.entity.CrafterBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int GRID_WIDTH() { return wrapperContained.GRID_WIDTH; }
// public void GRID_WIDTH(int value) { wrapperContained.GRID_WIDTH = value; }
public int GRID_HEIGHT() { return wrapperContained.GRID_HEIGHT; }
// public void GRID_HEIGHT(int value) { wrapperContained.GRID_HEIGHT = value; }
public int GRID_SIZE() { return wrapperContained.GRID_SIZE; }
// public void GRID_SIZE(int value) { wrapperContained.GRID_SIZE = value; }
public int SLOT_DISABLED() { return wrapperContained.SLOT_DISABLED; }
// public void SLOT_DISABLED(int value) { wrapperContained.SLOT_DISABLED = value; }
public int SLOT_ENABLED() { return wrapperContained.SLOT_ENABLED; }
// public void SLOT_ENABLED(int value) { wrapperContained.SLOT_ENABLED = value; }
public int TRIGGERED_PROPERTY() { return wrapperContained.TRIGGERED_PROPERTY; }
// public void TRIGGERED_PROPERTY(int value) { wrapperContained.TRIGGERED_PROPERTY = value; }
public int PROPERTIES_COUNT() { return wrapperContained.PROPERTIES_COUNT; }
// public void PROPERTIES_COUNT(int value) { wrapperContained.PROPERTIES_COUNT = value; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public yarnwrap.util.collection.DefaultedList inputStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inputStacks); }
// public void inputStacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inputStacks = value.wrapperContained; }
// public int craftingTicksRemaining() { return wrapperContained.craftingTicksRemaining; }
// public void craftingTicksRemaining(int value) { wrapperContained.craftingTicksRemaining = value; }
public CrafterBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.CrafterBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public boolean betterSlotExists(int count,yarnwrap.item.ItemStack stack,int slot) { return wrapperContained.betterSlotExists(count,stack.wrapperContained,slot); }
public void setSlotEnabled(int slot,boolean enabled) { wrapperContained.setSlotEnabled(slot,enabled); }
public void tickCrafting(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CrafterBlockEntity blockEntity) { wrapperContained.tickCrafting(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void setTriggered(boolean triggered) { wrapperContained.setTriggered(triggered); }
public boolean isSlotDisabled(int slot) { return wrapperContained.isSlotDisabled(slot); }
public void setCraftingTicksRemaining(int craftingTicksRemaining) { wrapperContained.setCraftingTicksRemaining(craftingTicksRemaining); }
// public boolean canToggleSlot(int slot) { return wrapperContained.canToggleSlot(slot); }
// public void putDisabledSlots(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.putDisabledSlots(nbt.wrapperContained); }
// public void putTriggered(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.putTriggered(nbt.wrapperContained); }
public boolean isTriggered() { return wrapperContained.isTriggered(); }
public int getComparatorOutput() { return wrapperContained.getComparatorOutput(); }

}