package yarnwrap.item;
public class BlockItem { public net.minecraft.item.BlockItem wrapperContained; public BlockItem(net.minecraft.item.BlockItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
public yarnwrap.item.ItemPlacementContext getPlacementContext(yarnwrap.item.ItemPlacementContext context) { return new yarnwrap.item.ItemPlacementContext(wrapperContained.getPlacementContext(context.wrapperContained)); }
// public yarnwrap.block.BlockState placeFromNbt(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.placeFromNbt(pos.wrapperContained,world.wrapperContained,stack.wrapperContained,state.wrapperContained)); }
// public yarnwrap.sound.SoundEvent getPlaceSound(yarnwrap.block.BlockState state) { return new yarnwrap.sound.SoundEvent(wrapperContained.getPlaceSound(state.wrapperContained)); }
// public boolean checkStatePlacement() { return wrapperContained.checkStatePlacement(); }
public void setBlockEntityData(yarnwrap.item.ItemStack stack,yarnwrap.block.entity.BlockEntityType type,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.setBlockEntityData(stack.wrapperContained,type.wrapperContained,nbt.wrapperContained); }
// public void copyComponentsToBlockEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { wrapperContained.copyComponentsToBlockEntity(world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
// public yarnwrap.block.BlockState getPlacementState(yarnwrap.item.ItemPlacementContext context) { return new yarnwrap.block.BlockState(wrapperContained.getPlacementState(context.wrapperContained)); }
// public boolean place(yarnwrap.item.ItemPlacementContext context,yarnwrap.block.BlockState state) { return wrapperContained.place(context.wrapperContained,state.wrapperContained); }
// public boolean canPlace(yarnwrap.item.ItemPlacementContext context,yarnwrap.block.BlockState state) { return wrapperContained.canPlace(context.wrapperContained,state.wrapperContained); }
// public boolean postPlacement(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state) { return wrapperContained.postPlacement(pos.wrapperContained,world.wrapperContained,player.wrapperContained,stack.wrapperContained,state.wrapperContained); }
public yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(wrapperContained.getBlock()); }
public yarnwrap.util.ActionResult place(yarnwrap.item.ItemPlacementContext context) { return new yarnwrap.util.ActionResult(wrapperContained.place(context.wrapperContained)); }
public void appendBlocks(java.util.Map map,yarnwrap.item.Item item) { wrapperContained.appendBlocks(map,item.wrapperContained); }
public boolean writeNbtToBlockEntity(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { return wrapperContained.writeNbtToBlockEntity(world.wrapperContained,player.wrapperContained,pos.wrapperContained,stack.wrapperContained); }

}