package yarnwrap.item;
public class HoneycombItem { public net.minecraft.item.HoneycombItem wrapperContained; public HoneycombItem(net.minecraft.item.HoneycombItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier UNWAXED_TO_WAXED_BLOCKS() { return wrapperContained.UNWAXED_TO_WAXED_BLOCKS; }
// public void UNWAXED_TO_WAXED_BLOCKS(java.util.function.Supplier value) { wrapperContained.UNWAXED_TO_WAXED_BLOCKS = value; }
public static java.util.function.Supplier UNWAXED_TO_WAXED_BLOCKS() { return net.minecraft.item.HoneycombItem.UNWAXED_TO_WAXED_BLOCKS; }
// public static void UNWAXED_TO_WAXED_BLOCKS(java.util.function.Supplier value, ) { net.minecraft.item.HoneycombItem.UNWAXED_TO_WAXED_BLOCKS = value; }

// public java.util.function.Supplier WAXED_TO_UNWAXED_BLOCKS() { return wrapperContained.WAXED_TO_UNWAXED_BLOCKS; }
// public void WAXED_TO_UNWAXED_BLOCKS(java.util.function.Supplier value) { wrapperContained.WAXED_TO_UNWAXED_BLOCKS = value; }
public static java.util.function.Supplier WAXED_TO_UNWAXED_BLOCKS() { return net.minecraft.item.HoneycombItem.WAXED_TO_UNWAXED_BLOCKS; }
// public static void WAXED_TO_UNWAXED_BLOCKS(java.util.function.Supplier value, ) { net.minecraft.item.HoneycombItem.WAXED_TO_UNWAXED_BLOCKS = value; }

// public yarnwrap.util.ActionResult method_34719(yarnwrap.item.ItemUsageContext state) { return new yarnwrap.util.ActionResult(wrapperContained.method_34719(state.wrapperContained)); }
// public static yarnwrap.util.ActionResult method_34719(yarnwrap.item.ItemUsageContext state, ) { return new yarnwrap.util.ActionResult(net.minecraft.item.HoneycombItem.method_34719(state.wrapperContained)); }
// public java.util.Optional getWaxedState(yarnwrap.block.BlockState state) { return wrapperContained.getWaxedState(state.wrapperContained); }
// public static java.util.Optional getWaxedState(yarnwrap.block.BlockState state, ) { return net.minecraft.item.HoneycombItem.getWaxedState(state.wrapperContained); }
// public yarnwrap.block.BlockState method_34721(yarnwrap.block.BlockState block) { return new yarnwrap.block.BlockState(wrapperContained.method_34721(block.wrapperContained)); }
// public static yarnwrap.block.BlockState method_34721(yarnwrap.block.BlockState block, ) { return new yarnwrap.block.BlockState(net.minecraft.item.HoneycombItem.method_34721(block.wrapperContained)); }

}