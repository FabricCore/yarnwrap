package yarnwrap.block;
public class ShulkerBoxBlock { public net.minecraft.block.ShulkerBoxBlock wrapperContained; public ShulkerBoxBlock(net.minecraft.block.ShulkerBoxBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
public yarnwrap.util.Identifier CONTENTS_DYNAMIC_DROP_ID() { return new yarnwrap.util.Identifier(wrapperContained.CONTENTS_DYNAMIC_DROP_ID); }
public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public yarnwrap.util.shape.VoxelShape UP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UP_SHAPE); }
// public yarnwrap.util.shape.VoxelShape DOWN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_SHAPE); }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public java.util.Map SIDES_SHAPES() { return wrapperContained.SIDES_SHAPES; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.text.Text UNKNOWN_CONTENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNKNOWN_CONTENTS_TEXT); }
public yarnwrap.block.Block get(yarnwrap.util.DyeColor dyeColor) { return new yarnwrap.block.Block(wrapperContained.get(dyeColor.wrapperContained)); }
public yarnwrap.util.DyeColor getColor(yarnwrap.block.Block block) { return new yarnwrap.util.DyeColor(wrapperContained.getColor(block.wrapperContained)); }
public yarnwrap.util.DyeColor getColor(yarnwrap.item.Item item) { return new yarnwrap.util.DyeColor(wrapperContained.getColor(item.wrapperContained)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
public yarnwrap.item.ItemStack getItemStack(yarnwrap.util.DyeColor color) { return new yarnwrap.item.ItemStack(wrapperContained.getItemStack(color.wrapperContained)); }
// public boolean canOpen(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.ShulkerBoxBlockEntity entity) { return wrapperContained.canOpen(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }

}