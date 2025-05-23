package yarnwrap.block;
public class TripwireBlock { public net.minecraft.block.TripwireBlock wrapperContained; public TripwireBlock(net.minecraft.block.TripwireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EAST = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TripwireBlock.EAST); }
// public static void EAST(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TripwireBlock.EAST = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
// public void WEST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WEST = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TripwireBlock.WEST); }
// public static void WEST(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TripwireBlock.WEST = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public void NORTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.NORTH = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TripwireBlock.NORTH); }
// public static void NORTH(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TripwireBlock.NORTH = value.wrapperContained; }

// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public void FACING_PROPERTIES(java.util.Map value) { wrapperContained.FACING_PROPERTIES = value; }
// public static java.util.Map FACING_PROPERTIES() { return net.minecraft.block.TripwireBlock.FACING_PROPERTIES; }
// public static void FACING_PROPERTIES(java.util.Map value, ) { net.minecraft.block.TripwireBlock.FACING_PROPERTIES = value; }

// public yarnwrap.block.Block hookBlock() { return new yarnwrap.block.Block(wrapperContained.hookBlock); }
// public void hookBlock(yarnwrap.block.Block value) { wrapperContained.hookBlock = value.wrapperContained; }
// public static yarnwrap.block.Block hookBlock() { return new yarnwrap.block.Block(net.minecraft.block.TripwireBlock.hookBlock); }
// public static void hookBlock(yarnwrap.block.Block value, ) { net.minecraft.block.TripwireBlock.hookBlock = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public void SOUTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SOUTH = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TripwireBlock.SOUTH); }
// public static void SOUTH(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TripwireBlock.SOUTH = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty DISARMED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.DISARMED); }
// public void DISARMED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.DISARMED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty DISARMED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TripwireBlock.DISARMED); }
// public static void DISARMED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TripwireBlock.DISARMED = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TripwireBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TripwireBlock.POWERED = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ATTACHED); }
// public void ATTACHED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.ATTACHED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TripwireBlock.ATTACHED); }
// public static void ATTACHED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TripwireBlock.ATTACHED = value.wrapperContained; }

// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
// public static int SCHEDULED_TICK_DELAY() { return net.minecraft.block.TripwireBlock.SCHEDULED_TICK_DELAY; }
// public static void SCHEDULED_TICK_DELAY(int value, ) { net.minecraft.block.TripwireBlock.SCHEDULED_TICK_DELAY = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TripwireBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TripwireBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape ATTACHED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.ATTACHED_SHAPE); }
// public void ATTACHED_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.ATTACHED_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape ATTACHED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.TripwireBlock.ATTACHED_SHAPE); }
// public static void ATTACHED_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.TripwireBlock.ATTACHED_SHAPE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape UNATTACHED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UNATTACHED_SHAPE); }
// public void UNATTACHED_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.UNATTACHED_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape UNATTACHED_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.TripwireBlock.UNATTACHED_SHAPE); }
// public static void UNATTACHED_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.TripwireBlock.UNATTACHED_SHAPE = value.wrapperContained; }

// public TripwireBlock(yarnwrap.block.Block hookBlock,Object settings) { this.wrapperContained = new net.minecraft.block.TripwireBlock(hookBlock.wrapperContained,settings); }
public boolean shouldConnectTo(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction facing) { return wrapperContained.shouldConnectTo(state.wrapperContained,facing.wrapperContained); }
// public static boolean shouldConnectTo(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction facing, ) { return net.minecraft.block.TripwireBlock.shouldConnectTo(state.wrapperContained,facing.wrapperContained); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.TripwireBlock.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updatePowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List entities) { wrapperContained.updatePowered(world.wrapperContained,pos.wrapperContained,entities); }
// public static void updatePowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.util.List entities, ) { net.minecraft.block.TripwireBlock.updatePowered(world.wrapperContained,pos.wrapperContained,entities); }
// public com.mojang.datafixers.kinds.App method_54060(Object instance) { return wrapperContained.method_54060(instance); }
// public static com.mojang.datafixers.kinds.App method_54060(Object instance, ) { return net.minecraft.block.TripwireBlock.method_54060(instance); }
// public yarnwrap.block.Block method_54061(yarnwrap.block.TripwireBlock block) { return new yarnwrap.block.Block(wrapperContained.method_54061(block.wrapperContained)); }
// public static yarnwrap.block.Block method_54061(yarnwrap.block.TripwireBlock block, ) { return new yarnwrap.block.Block(net.minecraft.block.TripwireBlock.method_54061(block.wrapperContained)); }
// public void updatePowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updatePowered(world.wrapperContained,pos.wrapperContained); }
// public static void updatePowered(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.TripwireBlock.updatePowered(world.wrapperContained,pos.wrapperContained); }

}