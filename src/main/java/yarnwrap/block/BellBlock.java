package yarnwrap.block;
public class BellBlock { public net.minecraft.block.BellBlock wrapperContained; public BellBlock(net.minecraft.block.BellBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.BellBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.BellBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty ATTACHMENT() { return new yarnwrap.state.property.EnumProperty(wrapperContained.ATTACHMENT); }
// public void ATTACHMENT(yarnwrap.state.property.EnumProperty value) { wrapperContained.ATTACHMENT = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty ATTACHMENT() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.BellBlock.ATTACHMENT); }
// public static void ATTACHMENT(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.BellBlock.ATTACHMENT = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape BELL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.BELL_SHAPE); }
// public void BELL_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.BELL_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape BELL_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BellBlock.BELL_SHAPE); }
// public static void BELL_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.BellBlock.BELL_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape CEILING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.CEILING_SHAPE); }
// public void CEILING_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.CEILING_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape CEILING_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BellBlock.CEILING_SHAPE); }
// public static void CEILING_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.BellBlock.CEILING_SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.BellBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.BellBlock.POWERED = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BellBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BellBlock.CODEC = value; }

// public java.util.Map SINGLE_WALL_SHAPES() { return wrapperContained.SINGLE_WALL_SHAPES; }
// public void SINGLE_WALL_SHAPES(java.util.Map value) { wrapperContained.SINGLE_WALL_SHAPES = value; }
// public static java.util.Map SINGLE_WALL_SHAPES() { return net.minecraft.block.BellBlock.SINGLE_WALL_SHAPES; }
// public static void SINGLE_WALL_SHAPES(java.util.Map value, ) { net.minecraft.block.BellBlock.SINGLE_WALL_SHAPES = value; }

// public java.util.Map FLOOR_SHAPES() { return wrapperContained.FLOOR_SHAPES; }
// public void FLOOR_SHAPES(java.util.Map value) { wrapperContained.FLOOR_SHAPES = value; }
// public static java.util.Map FLOOR_SHAPES() { return net.minecraft.block.BellBlock.FLOOR_SHAPES; }
// public static void FLOOR_SHAPES(java.util.Map value, ) { net.minecraft.block.BellBlock.FLOOR_SHAPES = value; }

// public java.util.Map DOUBLE_WALL_SHAPES() { return wrapperContained.DOUBLE_WALL_SHAPES; }
// public void DOUBLE_WALL_SHAPES(java.util.Map value) { wrapperContained.DOUBLE_WALL_SHAPES = value; }
// public static java.util.Map DOUBLE_WALL_SHAPES() { return net.minecraft.block.BellBlock.DOUBLE_WALL_SHAPES; }
// public static void DOUBLE_WALL_SHAPES(java.util.Map value, ) { net.minecraft.block.BellBlock.DOUBLE_WALL_SHAPES = value; }

// public yarnwrap.util.math.Direction getPlacementSide(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.getPlacementSide(state.wrapperContained)); }
// public static yarnwrap.util.math.Direction getPlacementSide(yarnwrap.block.BlockState state, ) { return new yarnwrap.util.math.Direction(net.minecraft.block.BellBlock.getPlacementSide(state.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape getShape(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShape(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getShape(yarnwrap.block.BlockState state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BellBlock.getShape(state.wrapperContained)); }
public boolean ring(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.ring(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static boolean ring(yarnwrap.entity.Entity entity,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.BellBlock.ring(entity.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public boolean isPointOnBell(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side,double y) { return wrapperContained.isPointOnBell(state.wrapperContained,side.wrapperContained,y); }
// public static boolean isPointOnBell(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction side,double y, ) { return net.minecraft.block.BellBlock.isPointOnBell(state.wrapperContained,side.wrapperContained,y); }
public boolean ring(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.entity.player.PlayerEntity player,boolean checkHitPos) { return wrapperContained.ring(world.wrapperContained,state.wrapperContained,hitResult.wrapperContained,player.wrapperContained,checkHitPos); }
// public static boolean ring(yarnwrap.world.World world,yarnwrap.block.BlockState state,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.entity.player.PlayerEntity player,boolean checkHitPos, ) { return net.minecraft.block.BellBlock.ring(world.wrapperContained,state.wrapperContained,hitResult.wrapperContained,player.wrapperContained,checkHitPos); }
public boolean ring(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.ring(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static boolean ring(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return net.minecraft.block.BellBlock.ring(world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }

}