package yarnwrap.block;
public class InventoryProvider { public net.minecraft.block.InventoryProvider wrapperContained; public InventoryProvider(net.minecraft.block.InventoryProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.inventory.SidedInventory getInventory(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.inventory.SidedInventory(wrapperContained.getInventory(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.inventory.SidedInventory getInventory(yarnwrap.block.BlockState state,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.inventory.SidedInventory(net.minecraft.block.InventoryProvider.getInventory(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }

}