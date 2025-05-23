package yarnwrap.block;
public class TripwireHookBlock { public net.minecraft.block.TripwireHookBlock wrapperContained; public TripwireHookBlock(net.minecraft.block.TripwireHookBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.TripwireHookBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.TripwireHookBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.ATTACHED); }
// public void ATTACHED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.ATTACHED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty ATTACHED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TripwireHookBlock.ATTACHED); }
// public static void ATTACHED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TripwireHookBlock.ATTACHED = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.TripwireHookBlock.POWERED); }
// public static void POWERED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.TripwireHookBlock.POWERED = value.wrapperContained; }

// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
// public void SCHEDULED_TICK_DELAY(int value) { wrapperContained.SCHEDULED_TICK_DELAY = value; }
// public static int SCHEDULED_TICK_DELAY() { return net.minecraft.block.TripwireHookBlock.SCHEDULED_TICK_DELAY; }
// public static void SCHEDULED_TICK_DELAY(int value, ) { net.minecraft.block.TripwireHookBlock.SCHEDULED_TICK_DELAY = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TripwireHookBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TripwireHookBlock.CODEC = value; }

// public java.util.Map SHAPES_BY_DIRECTION() { return wrapperContained.SHAPES_BY_DIRECTION; }
// public void SHAPES_BY_DIRECTION(java.util.Map value) { wrapperContained.SHAPES_BY_DIRECTION = value; }
// public static java.util.Map SHAPES_BY_DIRECTION() { return net.minecraft.block.TripwireHookBlock.SHAPES_BY_DIRECTION; }
// public static void SHAPES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.TripwireHookBlock.SHAPES_BY_DIRECTION = value; }

// public void updateNeighborsOnAxis(yarnwrap.block.Block block,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { wrapperContained.updateNeighborsOnAxis(block.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public static void updateNeighborsOnAxis(yarnwrap.block.Block block,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { net.minecraft.block.TripwireHookBlock.updateNeighborsOnAxis(block.wrapperContained,world.wrapperContained,pos.wrapperContained,direction.wrapperContained); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.TripwireHookBlock.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void playSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean attached,boolean on,boolean detached,boolean off) { wrapperContained.playSound(world.wrapperContained,pos.wrapperContained,attached,on,detached,off); }
// public static void playSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,boolean attached,boolean on,boolean detached,boolean off, ) { net.minecraft.block.TripwireHookBlock.playSound(world.wrapperContained,pos.wrapperContained,attached,on,detached,off); }

}