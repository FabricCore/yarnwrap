package yarnwrap.item;
public class MinecartItem { public net.minecraft.item.MinecartItem wrapperContained; public MinecartItem(net.minecraft.item.MinecartItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.dispenser.DispenserBehavior DISPENSER_BEHAVIOR() { return new yarnwrap.block.dispenser.DispenserBehavior(wrapperContained.DISPENSER_BEHAVIOR); }
// public Object type() { return wrapperContained.type; }

}