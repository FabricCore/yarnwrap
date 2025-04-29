package yarnwrap.block.dispenser;
public class DispenserBehavior { public net.minecraft.block.dispenser.DispenserBehavior wrapperContained; public DispenserBehavior(net.minecraft.block.dispenser.DispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.DispenserBehavior NOOP() { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.NOOP); }
// public void NOOP(yarnwrap.block.dispenser.DispenserBehavior value) { wrapperContained.NOOP = value.wrapperContained; }
public static yarnwrap.block.dispenser.DispenserBehavior NOOP() { return new yarnwrap.block.dispenser.DispenserBehavior(net.minecraft.block.dispenser.DispenserBehavior.NOOP); }
// public static void NOOP(yarnwrap.block.dispenser.DispenserBehavior value, ) { net.minecraft.block.dispenser.DispenserBehavior.NOOP = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.block.dispenser.DispenserBehavior.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.dispenser.DispenserBehavior.LOGGER = value; }

public yarnwrap.item.ItemStack dispense(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.dispense(pointer.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack dispense(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.dispenser.DispenserBehavior.dispense(pointer.wrapperContained,stack.wrapperContained)); }
// public yarnwrap.item.ItemStack doDispense(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.doDispense(pointer.wrapperContained,stack.wrapperContained)); }
// public static yarnwrap.item.ItemStack doDispense(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.dispenser.DispenserBehavior.doDispense(pointer.wrapperContained,stack.wrapperContained)); }
// public void registerDefaults() { wrapperContained.registerDefaults(); }
public static void registerDefaults() { net.minecraft.block.dispenser.DispenserBehavior.registerDefaults(); }

}