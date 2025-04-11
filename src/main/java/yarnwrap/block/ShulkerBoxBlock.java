package yarnwrap.block;
public class ShulkerBoxBlock { public net.minecraft.block.ShulkerBoxBlock wrapperContained; public ShulkerBoxBlock(net.minecraft.block.ShulkerBoxBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
public yarnwrap.util.Identifier CONTENTS_DYNAMIC_DROP_ID() { return new yarnwrap.util.Identifier(wrapperContained.CONTENTS_DYNAMIC_DROP_ID); }
// public void CONTENTS_DYNAMIC_DROP_ID(yarnwrap.util.Identifier value) { wrapperContained.CONTENTS_DYNAMIC_DROP_ID = value.wrapperContained; }
public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape UP_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UP_SHAPE); }
// public void UP_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.UP_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape DOWN_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOWN_SHAPE); }
// public void DOWN_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOWN_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape WEST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.WEST_SHAPE); }
// public void WEST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.WEST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape EAST_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EAST_SHAPE); }
// public void EAST_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EAST_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape NORTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.NORTH_SHAPE); }
// public void NORTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.NORTH_SHAPE = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SOUTH_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SOUTH_SHAPE); }
// public void SOUTH_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SOUTH_SHAPE = value.wrapperContained; }
// public java.util.Map SIDES_SHAPES() { return wrapperContained.SIDES_SHAPES; }
// public void SIDES_SHAPES(java.util.Map value) { wrapperContained.SIDES_SHAPES = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.text.Text UNKNOWN_CONTENTS_TEXT() { return new yarnwrap.text.Text(wrapperContained.UNKNOWN_CONTENTS_TEXT); }
// public void UNKNOWN_CONTENTS_TEXT(yarnwrap.text.Text value) { wrapperContained.UNKNOWN_CONTENTS_TEXT = value.wrapperContained; }
public yarnwrap.block.Block get(yarnwrap.util.DyeColor dyeColor) { return new yarnwrap.block.Block(wrapperContained.get(dyeColor.wrapperContained)); }
public yarnwrap.util.DyeColor getColor(yarnwrap.block.Block block) { return new yarnwrap.util.DyeColor(wrapperContained.getColor(block.wrapperContained)); }
public yarnwrap.util.DyeColor getColor(yarnwrap.item.Item item) { return new yarnwrap.util.DyeColor(wrapperContained.getColor(item.wrapperContained)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
public yarnwrap.item.ItemStack getItemStack(yarnwrap.util.DyeColor color) { return new yarnwrap.item.ItemStack(wrapperContained.getItemStack(color.wrapperContained)); }
// public boolean canOpen(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.ShulkerBoxBlockEntity entity) { return wrapperContained.canOpen(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }

}