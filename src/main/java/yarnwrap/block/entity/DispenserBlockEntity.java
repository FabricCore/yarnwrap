package yarnwrap.block.entity;
public class DispenserBlockEntity { public net.minecraft.block.entity.DispenserBlockEntity wrapperContained; public DispenserBlockEntity(net.minecraft.block.entity.DispenserBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.collection.DefaultedList inventory() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.inventory); }
// public void inventory(yarnwrap.util.collection.DefaultedList value) { wrapperContained.inventory = value.wrapperContained; }
public int INVENTORY_SIZE() { return wrapperContained.INVENTORY_SIZE; }
// public void INVENTORY_SIZE(int value) { wrapperContained.INVENTORY_SIZE = value; }
public DispenserBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.DispenserBlockEntity(pos.wrapperContained,state.wrapperContained); }
public yarnwrap.item.ItemStack addToFirstFreeSlot(yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.addToFirstFreeSlot(stack.wrapperContained)); }
public int chooseNonEmptySlot(yarnwrap.util.math.random.Random random) { return wrapperContained.chooseNonEmptySlot(random.wrapperContained); }

}