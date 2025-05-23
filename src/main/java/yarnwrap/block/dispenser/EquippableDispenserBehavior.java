package yarnwrap.block.dispenser;
public class EquippableDispenserBehavior { public net.minecraft.block.dispenser.EquippableDispenserBehavior wrapperContained; public EquippableDispenserBehavior(net.minecraft.block.dispenser.EquippableDispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.EquippableDispenserBehavior INSTANCE() { return new yarnwrap.block.dispenser.EquippableDispenserBehavior(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.block.dispenser.EquippableDispenserBehavior value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.block.dispenser.EquippableDispenserBehavior INSTANCE() { return new yarnwrap.block.dispenser.EquippableDispenserBehavior(net.minecraft.block.dispenser.EquippableDispenserBehavior.INSTANCE); }
// public static void INSTANCE(yarnwrap.block.dispenser.EquippableDispenserBehavior value, ) { net.minecraft.block.dispenser.EquippableDispenserBehavior.INSTANCE = value.wrapperContained; }

// public boolean method_64105(yarnwrap.item.ItemStack entity) { return wrapperContained.method_64105(entity.wrapperContained); }
// public static boolean method_64105(yarnwrap.item.ItemStack entity, ) { return net.minecraft.block.dispenser.EquippableDispenserBehavior.method_64105(entity.wrapperContained); }
// public boolean dispense(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack) { return wrapperContained.dispense(pointer.wrapperContained,stack.wrapperContained); }
// public static boolean dispense(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack, ) { return net.minecraft.block.dispenser.EquippableDispenserBehavior.dispense(pointer.wrapperContained,stack.wrapperContained); }

}