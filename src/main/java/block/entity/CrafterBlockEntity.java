package yarnwrap.block.entity;
public class CrafterBlockEntity { public net.minecraft.block.entity.CrafterBlockEntity wrapperContained; public CrafterBlockEntity(net.minecraft.block.entity.CrafterBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public int GRID_WIDTH() { return wrapperContained.GRID_WIDTH; }
public int GRID_HEIGHT() { return wrapperContained.GRID_HEIGHT; }
public int GRID_SIZE() { return wrapperContained.GRID_SIZE; }
public int SLOT_DISABLED() { return wrapperContained.SLOT_DISABLED; }
public int SLOT_ENABLED() { return wrapperContained.SLOT_ENABLED; }
public int TRIGGERED_PROPERTY() { return wrapperContained.TRIGGERED_PROPERTY; }
public int PROPERTIES_COUNT() { return wrapperContained.PROPERTIES_COUNT; }
// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public yarnwrap.util.collection.DefaultedList inputStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inputStacks); }
// public int craftingTicksRemaining() { return wrapperContained.craftingTicksRemaining; }
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