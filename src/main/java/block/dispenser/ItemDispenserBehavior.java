package yarnwrap.block.dispenser;
public class ItemDispenserBehavior { public net.minecraft.block.dispenser.ItemDispenserBehavior wrapperContained; public ItemDispenserBehavior(net.minecraft.block.dispenser.ItemDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public void spawnParticles(yarnwrap.util.math.BlockPointer pointer,yarnwrap.util.math.Direction side) { wrapperContained.spawnParticles(pointer.wrapperContained,side.wrapperContained); }
public void spawnItem(yarnwrap.world.World world,yarnwrap.item.ItemStack stack,int speed,yarnwrap.util.math.Direction side,yarnwrap.util.math.Position pos) { wrapperContained.spawnItem(world.wrapperContained,stack.wrapperContained,speed,side.wrapperContained,pos.wrapperContained); }
// public yarnwrap.item.ItemStack dispenseSilently(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.dispenseSilently(pointer.wrapperContained,stack.wrapperContained)); }
// public void playSound(yarnwrap.util.math.BlockPointer pointer) { wrapperContained.playSound(pointer.wrapperContained); }
// public yarnwrap.item.ItemStack decrementStackWithRemainder(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack,yarnwrap.item.ItemStack remainder) { return new yarnwrap.item.ItemStack(wrapperContained.decrementStackWithRemainder(pointer.wrapperContained,stack.wrapperContained,remainder.wrapperContained)); }
// public void syncDispensesEvent(yarnwrap.util.math.BlockPointer pointer) { wrapperContained.syncDispensesEvent(pointer.wrapperContained); }
// public void addStackOrSpawn(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack) { wrapperContained.addStackOrSpawn(pointer.wrapperContained,stack.wrapperContained); }
// public void syncActivatesEvent(yarnwrap.util.math.BlockPointer pointer,yarnwrap.util.math.Direction side) { wrapperContained.syncActivatesEvent(pointer.wrapperContained,side.wrapperContained); }

}