package yarnwrap.block;
public class PaleMossCarpetBlock { public net.minecraft.block.PaleMossCarpetBlock wrapperContained; public PaleMossCarpetBlock(net.minecraft.block.PaleMossCarpetBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PaleMossCarpetBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PaleMossCarpetBlock.CODEC = value; }

// public yarnwrap.state.property.BooleanProperty BOTTOM() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.BOTTOM); }
// public void BOTTOM(yarnwrap.state.property.BooleanProperty value) { wrapperContained.BOTTOM = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty BOTTOM() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.PaleMossCarpetBlock.BOTTOM); }
// public static void BOTTOM(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.PaleMossCarpetBlock.BOTTOM = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty NORTH() { return new yarnwrap.state.property.EnumProperty(wrapperContained.NORTH); }
// public void NORTH(yarnwrap.state.property.EnumProperty value) { wrapperContained.NORTH = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty NORTH() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.PaleMossCarpetBlock.NORTH); }
// public static void NORTH(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.PaleMossCarpetBlock.NORTH = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty EAST() { return new yarnwrap.state.property.EnumProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.EnumProperty value) { wrapperContained.EAST = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty EAST() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.PaleMossCarpetBlock.EAST); }
// public static void EAST(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.PaleMossCarpetBlock.EAST = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty SOUTH() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SOUTH); }
// public void SOUTH(yarnwrap.state.property.EnumProperty value) { wrapperContained.SOUTH = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty SOUTH() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.PaleMossCarpetBlock.SOUTH); }
// public static void SOUTH(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.PaleMossCarpetBlock.SOUTH = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty WEST() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WEST); }
// public void WEST(yarnwrap.state.property.EnumProperty value) { wrapperContained.WEST = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty WEST() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.PaleMossCarpetBlock.WEST); }
// public static void WEST(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.PaleMossCarpetBlock.WEST = value.wrapperContained; }

// public java.util.Map WALL_SHAPE_PROPERTIES_BY_DIRECTION() { return wrapperContained.WALL_SHAPE_PROPERTIES_BY_DIRECTION; }
// public void WALL_SHAPE_PROPERTIES_BY_DIRECTION(java.util.Map value) { wrapperContained.WALL_SHAPE_PROPERTIES_BY_DIRECTION = value; }
public static java.util.Map WALL_SHAPE_PROPERTIES_BY_DIRECTION() { return net.minecraft.block.PaleMossCarpetBlock.WALL_SHAPE_PROPERTIES_BY_DIRECTION; }
// public static void WALL_SHAPE_PROPERTIES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.PaleMossCarpetBlock.WALL_SHAPE_PROPERTIES_BY_DIRECTION = value; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.PaleMossCarpetBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.PaleMossCarpetBlock.shapeFunction = value; }

// public yarnwrap.block.BlockState createUpperState(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.createUpperState(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState createUpperState(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.PaleMossCarpetBlock.createUpperState(world.wrapperContained,pos.wrapperContained)); }
// public boolean canGrowOnFace(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canGrowOnFace(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static boolean canGrowOnFace(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.PaleMossCarpetBlock.canGrowOnFace(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public void placeAt(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int flags) { wrapperContained.placeAt(world.wrapperContained,pos.wrapperContained,random.wrapperContained,flags); }
// public static void placeAt(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,int flags, ) { net.minecraft.block.PaleMossCarpetBlock.placeAt(world.wrapperContained,pos.wrapperContained,random.wrapperContained,flags); }
// public yarnwrap.block.BlockState updateState(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.updateState(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState updateState(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.PaleMossCarpetBlock.updateState(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.state.property.EnumProperty getWallShape(yarnwrap.util.math.Direction face) { return new yarnwrap.state.property.EnumProperty(wrapperContained.getWallShape(face.wrapperContained)); }
// public static yarnwrap.state.property.EnumProperty getWallShape(yarnwrap.util.math.Direction face, ) { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.PaleMossCarpetBlock.getWallShape(face.wrapperContained)); }
// public boolean hasAnyShape(yarnwrap.block.BlockState state) { return wrapperContained.hasAnyShape(state.wrapperContained); }
// public static boolean hasAnyShape(yarnwrap.block.BlockState state, ) { return net.minecraft.block.PaleMossCarpetBlock.hasAnyShape(state.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape method_66452(java.util.Map state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66452(state)); }
// public static yarnwrap.util.shape.VoxelShape method_66452(java.util.Map state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.PaleMossCarpetBlock.method_66452(state)); }
public java.util.function.Function createShapeFunction() { return wrapperContained.createShapeFunction(); }
// public static java.util.function.Function createShapeFunction() { return net.minecraft.block.PaleMossCarpetBlock.createShapeFunction(); }

}