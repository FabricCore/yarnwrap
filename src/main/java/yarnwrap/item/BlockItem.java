package yarnwrap.item;
public class BlockItem { public net.minecraft.item.BlockItem wrapperContained; public BlockItem(net.minecraft.item.BlockItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.item.BlockItem.block); }
// public static void block(yarnwrap.block.Block value, ) { net.minecraft.item.BlockItem.block = value.wrapperContained; }

// public BlockItem(yarnwrap.block.Block block,Object settings) { this.wrapperContained = new net.minecraft.item.BlockItem(block.wrapperContained,settings); }
// public yarnwrap.block.BlockState getPlacementState(yarnwrap.item.ItemPlacementContext context) { return new yarnwrap.block.BlockState(wrapperContained.getPlacementState(context.wrapperContained)); }
// public static yarnwrap.block.BlockState getPlacementState(yarnwrap.item.ItemPlacementContext context, ) { return new yarnwrap.block.BlockState(net.minecraft.item.BlockItem.getPlacementState(context.wrapperContained)); }
// public boolean place(yarnwrap.item.ItemPlacementContext context,yarnwrap.block.BlockState state) { return wrapperContained.place(context.wrapperContained,state.wrapperContained); }
// public static boolean place(yarnwrap.item.ItemPlacementContext context,yarnwrap.block.BlockState state, ) { return net.minecraft.item.BlockItem.place(context.wrapperContained,state.wrapperContained); }
// public boolean canPlace(yarnwrap.item.ItemPlacementContext context,yarnwrap.block.BlockState state) { return wrapperContained.canPlace(context.wrapperContained,state.wrapperContained); }
// public static boolean canPlace(yarnwrap.item.ItemPlacementContext context,yarnwrap.block.BlockState state, ) { return net.minecraft.item.BlockItem.canPlace(context.wrapperContained,state.wrapperContained); }
// public boolean postPlacement(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state) { return wrapperContained.postPlacement(pos.wrapperContained,world.wrapperContained,player.wrapperContained,stack.wrapperContained,state.wrapperContained); }
// public static boolean postPlacement(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state, ) { return net.minecraft.item.BlockItem.postPlacement(pos.wrapperContained,world.wrapperContained,player.wrapperContained,stack.wrapperContained,state.wrapperContained); }
public yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(wrapperContained.getBlock()); }
// public static yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(net.minecraft.item.BlockItem.getBlock()); }
public yarnwrap.util.ActionResult place(yarnwrap.item.ItemPlacementContext context) { return new yarnwrap.util.ActionResult(wrapperContained.place(context.wrapperContained)); }
// public static yarnwrap.util.ActionResult place(yarnwrap.item.ItemPlacementContext context, ) { return new yarnwrap.util.ActionResult(net.minecraft.item.BlockItem.place(context.wrapperContained)); }
public void appendBlocks(java.util.Map map,yarnwrap.item.Item item) { wrapperContained.appendBlocks(map,item.wrapperContained); }
// public static void appendBlocks(java.util.Map map,yarnwrap.item.Item item, ) { net.minecraft.item.BlockItem.appendBlocks(map,item.wrapperContained); }
// public boolean writeNbtToBlockEntity(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { return wrapperContained.writeNbtToBlockEntity(world.wrapperContained,player.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
// public static boolean writeNbtToBlockEntity(yarnwrap.world.World world,yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack, ) { return net.minecraft.item.BlockItem.writeNbtToBlockEntity(world.wrapperContained,player.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
public yarnwrap.item.ItemPlacementContext getPlacementContext(yarnwrap.item.ItemPlacementContext context) { return new yarnwrap.item.ItemPlacementContext(wrapperContained.getPlacementContext(context.wrapperContained)); }
// public static yarnwrap.item.ItemPlacementContext getPlacementContext(yarnwrap.item.ItemPlacementContext context, ) { return new yarnwrap.item.ItemPlacementContext(net.minecraft.item.BlockItem.getPlacementContext(context.wrapperContained)); }
// public yarnwrap.block.BlockState placeFromNbt(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.placeFromNbt(pos.wrapperContained,world.wrapperContained,stack.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.block.BlockState placeFromNbt(yarnwrap.util.math.BlockPos pos,yarnwrap.world.World world,yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.item.BlockItem.placeFromNbt(pos.wrapperContained,world.wrapperContained,stack.wrapperContained,state.wrapperContained)); }
// public yarnwrap.sound.SoundEvent getPlaceSound(yarnwrap.block.BlockState state) { return new yarnwrap.sound.SoundEvent(wrapperContained.getPlaceSound(state.wrapperContained)); }
// public static yarnwrap.sound.SoundEvent getPlaceSound(yarnwrap.block.BlockState state, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.item.BlockItem.getPlaceSound(state.wrapperContained)); }
// public boolean checkStatePlacement() { return wrapperContained.checkStatePlacement(); }
// public static boolean checkStatePlacement() { return net.minecraft.item.BlockItem.checkStatePlacement(); }
// public void setBlockEntityData(yarnwrap.item.ItemStack stack,yarnwrap.block.entity.BlockEntityType type,yarnwrap.storage.NbtWriteView view) { wrapperContained.setBlockEntityData(stack.wrapperContained,type.wrapperContained,view.wrapperContained); }
// public static void setBlockEntityData(yarnwrap.item.ItemStack stack,yarnwrap.block.entity.BlockEntityType type,yarnwrap.storage.NbtWriteView view, ) { net.minecraft.item.BlockItem.setBlockEntityData(stack.wrapperContained,type.wrapperContained,view.wrapperContained); }
// public void copyComponentsToBlockEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack) { wrapperContained.copyComponentsToBlockEntity(world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }
// public static void copyComponentsToBlockEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.item.ItemStack stack, ) { net.minecraft.item.BlockItem.copyComponentsToBlockEntity(world.wrapperContained,pos.wrapperContained,stack.wrapperContained); }

}