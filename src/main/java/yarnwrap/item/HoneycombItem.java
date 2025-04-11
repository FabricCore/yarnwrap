package yarnwrap.item;
public class HoneycombItem { public net.minecraft.item.HoneycombItem wrapperContained; public HoneycombItem(net.minecraft.item.HoneycombItem wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Supplier UNWAXED_TO_WAXED_BLOCKS() { return wrapperContained.UNWAXED_TO_WAXED_BLOCKS; }
// public void UNWAXED_TO_WAXED_BLOCKS(java.util.function.Supplier value) { wrapperContained.UNWAXED_TO_WAXED_BLOCKS = value; }
public java.util.function.Supplier WAXED_TO_UNWAXED_BLOCKS() { return wrapperContained.WAXED_TO_UNWAXED_BLOCKS; }
// public void WAXED_TO_UNWAXED_BLOCKS(java.util.function.Supplier value) { wrapperContained.WAXED_TO_UNWAXED_BLOCKS = value; }
public java.util.Optional getWaxedState(yarnwrap.block.BlockState state) { return wrapperContained.getWaxedState(state.wrapperContained); }

}