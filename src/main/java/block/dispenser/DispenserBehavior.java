package yarnwrap.block.dispenser;
public class DispenserBehavior { public net.minecraft.block.dispenser.DispenserBehavior wrapperContained; public DispenserBehavior(net.minecraft.block.dispenser.DispenserBehavior wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.dispenser.DispenserBehavior NOOP() { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.NOOP); }
public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.item.ItemStack doDispense(yarnwrap.util.math.BlockPointer pointer,yarnwrap.item.ItemStack stack) { return new yarnwrap.item.ItemStack(wrapperContained.doDispense(pointer.wrapperContained,stack.wrapperContained)); }
// public void registerDefaults() { wrapperContained.registerDefaults(); }

}