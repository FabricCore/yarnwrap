package yarnwrap.block.entity;
public class CrafterBlockEntity { public net.minecraft.block.entity.CrafterBlockEntity wrapperContained; public CrafterBlockEntity(net.minecraft.block.entity.CrafterBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int GRID_WIDTH() { return wrapperContained.GRID_WIDTH; }
// public void GRID_WIDTH(int value) { wrapperContained.GRID_WIDTH = value; }
public static int GRID_WIDTH() { return net.minecraft.block.entity.CrafterBlockEntity.GRID_WIDTH; }
// public static void GRID_WIDTH(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.GRID_WIDTH = value; }

// public int GRID_HEIGHT() { return wrapperContained.GRID_HEIGHT; }
// public void GRID_HEIGHT(int value) { wrapperContained.GRID_HEIGHT = value; }
public static int GRID_HEIGHT() { return net.minecraft.block.entity.CrafterBlockEntity.GRID_HEIGHT; }
// public static void GRID_HEIGHT(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.GRID_HEIGHT = value; }

// public int GRID_SIZE() { return wrapperContained.GRID_SIZE; }
// public void GRID_SIZE(int value) { wrapperContained.GRID_SIZE = value; }
public static int GRID_SIZE() { return net.minecraft.block.entity.CrafterBlockEntity.GRID_SIZE; }
// public static void GRID_SIZE(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.GRID_SIZE = value; }

// public int SLOT_DISABLED() { return wrapperContained.SLOT_DISABLED; }
// public void SLOT_DISABLED(int value) { wrapperContained.SLOT_DISABLED = value; }
public static int SLOT_DISABLED() { return net.minecraft.block.entity.CrafterBlockEntity.SLOT_DISABLED; }
// public static void SLOT_DISABLED(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.SLOT_DISABLED = value; }

// public int SLOT_ENABLED() { return wrapperContained.SLOT_ENABLED; }
// public void SLOT_ENABLED(int value) { wrapperContained.SLOT_ENABLED = value; }
public static int SLOT_ENABLED() { return net.minecraft.block.entity.CrafterBlockEntity.SLOT_ENABLED; }
// public static void SLOT_ENABLED(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.SLOT_ENABLED = value; }

// public int TRIGGERED_PROPERTY() { return wrapperContained.TRIGGERED_PROPERTY; }
// public void TRIGGERED_PROPERTY(int value) { wrapperContained.TRIGGERED_PROPERTY = value; }
public static int TRIGGERED_PROPERTY() { return net.minecraft.block.entity.CrafterBlockEntity.TRIGGERED_PROPERTY; }
// public static void TRIGGERED_PROPERTY(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.TRIGGERED_PROPERTY = value; }

// public int PROPERTIES_COUNT() { return wrapperContained.PROPERTIES_COUNT; }
// public void PROPERTIES_COUNT(int value) { wrapperContained.PROPERTIES_COUNT = value; }
public static int PROPERTIES_COUNT() { return net.minecraft.block.entity.CrafterBlockEntity.PROPERTIES_COUNT; }
// public static void PROPERTIES_COUNT(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.PROPERTIES_COUNT = value; }

// public yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(wrapperContained.propertyDelegate); }
// public void propertyDelegate(yarnwrap.screen.PropertyDelegate value) { wrapperContained.propertyDelegate = value.wrapperContained; }
// public static yarnwrap.screen.PropertyDelegate propertyDelegate() { return new yarnwrap.screen.PropertyDelegate(net.minecraft.block.entity.CrafterBlockEntity.propertyDelegate); }
// public static void propertyDelegate(yarnwrap.screen.PropertyDelegate value, ) { net.minecraft.block.entity.CrafterBlockEntity.propertyDelegate = value.wrapperContained; }

// public yarnwrap.util.collection.DefaultedList inputStacks() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inputStacks); }
// public void inputStacks(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inputStacks = value.wrapperContained; }
// public static yarnwrap.util.collection.DefaultedList inputStacks() { return new yarnwrap.util.collection.DefaultedList(net.minecraft.block.entity.CrafterBlockEntity.inputStacks); }
// public static void inputStacks(yarnwrap.util.collection.DefaultedList value, ) { net.minecraft.block.entity.CrafterBlockEntity.inputStacks = value.wrapperContained; }

// public int craftingTicksRemaining() { return wrapperContained.craftingTicksRemaining; }
// public void craftingTicksRemaining(int value) { wrapperContained.craftingTicksRemaining = value; }
// public static int craftingTicksRemaining() { return net.minecraft.block.entity.CrafterBlockEntity.craftingTicksRemaining; }
// public static void craftingTicksRemaining(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.craftingTicksRemaining = value; }

// public int DEFAULT_CRAFTING_TICKS_REMAINING() { return wrapperContained.DEFAULT_CRAFTING_TICKS_REMAINING; }
// public void DEFAULT_CRAFTING_TICKS_REMAINING(int value) { wrapperContained.DEFAULT_CRAFTING_TICKS_REMAINING = value; }
// public static int DEFAULT_CRAFTING_TICKS_REMAINING() { return net.minecraft.block.entity.CrafterBlockEntity.DEFAULT_CRAFTING_TICKS_REMAINING; }
// public static void DEFAULT_CRAFTING_TICKS_REMAINING(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.DEFAULT_CRAFTING_TICKS_REMAINING = value; }

// public int DEFAULT_TRIGGERED() { return wrapperContained.DEFAULT_TRIGGERED; }
// public void DEFAULT_TRIGGERED(int value) { wrapperContained.DEFAULT_TRIGGERED = value; }
// public static int DEFAULT_TRIGGERED() { return net.minecraft.block.entity.CrafterBlockEntity.DEFAULT_TRIGGERED; }
// public static void DEFAULT_TRIGGERED(int value, ) { net.minecraft.block.entity.CrafterBlockEntity.DEFAULT_TRIGGERED = value; }

public CrafterBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.CrafterBlockEntity(pos.wrapperContained,state.wrapperContained); }
// public boolean betterSlotExists(int count,yarnwrap.item.ItemStack stack,int slot) { return wrapperContained.betterSlotExists(count,stack.wrapperContained,slot); }
// public static boolean betterSlotExists(int count,yarnwrap.item.ItemStack stack,int slot, ) { return net.minecraft.block.entity.CrafterBlockEntity.betterSlotExists(count,stack.wrapperContained,slot); }
public void setSlotEnabled(int slot,boolean enabled) { wrapperContained.setSlotEnabled(slot,enabled); }
// public static void setSlotEnabled(int slot,boolean enabled, ) { net.minecraft.block.entity.CrafterBlockEntity.setSlotEnabled(slot,enabled); }
// public void tickCrafting(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CrafterBlockEntity blockEntity) { wrapperContained.tickCrafting(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tickCrafting(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.CrafterBlockEntity blockEntity, ) { net.minecraft.block.entity.CrafterBlockEntity.tickCrafting(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
public void setTriggered(boolean triggered) { wrapperContained.setTriggered(triggered); }
// public static void setTriggered(boolean triggered, ) { net.minecraft.block.entity.CrafterBlockEntity.setTriggered(triggered); }
public boolean isSlotDisabled(int slot) { return wrapperContained.isSlotDisabled(slot); }
// public static boolean isSlotDisabled(int slot, ) { return net.minecraft.block.entity.CrafterBlockEntity.isSlotDisabled(slot); }
public void setCraftingTicksRemaining(int craftingTicksRemaining) { wrapperContained.setCraftingTicksRemaining(craftingTicksRemaining); }
// public static void setCraftingTicksRemaining(int craftingTicksRemaining, ) { net.minecraft.block.entity.CrafterBlockEntity.setCraftingTicksRemaining(craftingTicksRemaining); }
// public boolean canToggleSlot(int slot) { return wrapperContained.canToggleSlot(slot); }
// public static boolean canToggleSlot(int slot, ) { return net.minecraft.block.entity.CrafterBlockEntity.canToggleSlot(slot); }
// public void putDisabledSlots(yarnwrap.storage.WriteView view) { wrapperContained.putDisabledSlots(view.wrapperContained); }
// public static void putDisabledSlots(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.CrafterBlockEntity.putDisabledSlots(view.wrapperContained); }
// public void putTriggered(yarnwrap.storage.WriteView view) { wrapperContained.putTriggered(view.wrapperContained); }
// public static void putTriggered(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.CrafterBlockEntity.putTriggered(view.wrapperContained); }
public boolean isTriggered() { return wrapperContained.isTriggered(); }
// public static boolean isTriggered() { return net.minecraft.block.entity.CrafterBlockEntity.isTriggered(); }
public int getComparatorOutput() { return wrapperContained.getComparatorOutput(); }
// public static int getComparatorOutput() { return net.minecraft.block.entity.CrafterBlockEntity.getComparatorOutput(); }
// public void method_68285(int slots) { wrapperContained.method_68285(slots); }
// public static void method_68285(int slots, ) { net.minecraft.block.entity.CrafterBlockEntity.method_68285(slots); }

}