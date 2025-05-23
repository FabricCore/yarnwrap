package yarnwrap.block;
public class LadderBlock { public net.minecraft.block.LadderBlock wrapperContained; public LadderBlock(net.minecraft.block.LadderBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.LadderBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.LadderBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.LadderBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.LadderBlock.WATERLOGGED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.LadderBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.LadderBlock.CODEC = value; }

// public java.util.Map SHAPES_BY_DIRECTION() { return wrapperContained.SHAPES_BY_DIRECTION; }
// public void SHAPES_BY_DIRECTION(java.util.Map value) { wrapperContained.SHAPES_BY_DIRECTION = value; }
public static java.util.Map SHAPES_BY_DIRECTION() { return net.minecraft.block.LadderBlock.SHAPES_BY_DIRECTION; }
// public static void SHAPES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.LadderBlock.SHAPES_BY_DIRECTION = value; }

// public boolean canPlaceOn(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side) { return wrapperContained.canPlaceOn(world.wrapperContained,pos.wrapperContained,side.wrapperContained); }
// public static boolean canPlaceOn(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction side, ) { return net.minecraft.block.LadderBlock.canPlaceOn(world.wrapperContained,pos.wrapperContained,side.wrapperContained); }

}