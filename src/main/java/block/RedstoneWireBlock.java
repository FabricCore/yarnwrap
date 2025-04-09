package yarnwrap.block;
public class RedstoneWireBlock { public net.minecraft.block.RedstoneWireBlock wrapperContained; public RedstoneWireBlock(net.minecraft.block.RedstoneWireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
public java.util.Map DIRECTION_TO_WIRE_CONNECTION_PROPERTY() { return wrapperContained.DIRECTION_TO_WIRE_CONNECTION_PROPERTY; }
public yarnwrap.state.property.EnumProperty WIRE_CONNECTION_EAST() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WIRE_CONNECTION_EAST); }
public yarnwrap.state.property.EnumProperty WIRE_CONNECTION_SOUTH() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WIRE_CONNECTION_SOUTH); }
// public boolean wiresGivePower() { return wrapperContained.wiresGivePower; }
public yarnwrap.state.property.EnumProperty WIRE_CONNECTION_WEST() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WIRE_CONNECTION_WEST); }
public yarnwrap.state.property.EnumProperty WIRE_CONNECTION_NORTH() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WIRE_CONNECTION_NORTH); }
// public yarnwrap.util.shape.VoxelShape DOT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOT_SHAPE); }
// public java.util.Map DIRECTION_TO_SIDE_SHAPE() { return wrapperContained.DIRECTION_TO_SIDE_SHAPE; }
// public java.util.Map DIRECTION_TO_UP_SHAPE() { return wrapperContained.DIRECTION_TO_UP_SHAPE; }
// public java.util.Map SHAPES() { return wrapperContained.SHAPES; }
// public net.minecraft.util.math.Vec3d[] COLORS() { return wrapperContained.COLORS; }
// public yarnwrap.block.BlockState dotState() { return new yarnwrap.block.BlockState(wrapperContained.dotState); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.block.enums.WireConnection getRenderConnectionType(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return new yarnwrap.block.enums.WireConnection(wrapperContained.getRenderConnectionType(world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// public void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateNeighbors(world.wrapperContained,pos.wrapperContained); }
// public boolean connectsTo(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction dir) { return wrapperContained.connectsTo(state.wrapperContained,dir.wrapperContained); }
// public boolean connectsTo(yarnwrap.block.BlockState state) { return wrapperContained.connectsTo(state.wrapperContained); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public int increasePower(yarnwrap.block.BlockState state) { return wrapperContained.increasePower(state.wrapperContained); }
public int getWireColor(int powerLevel) { return wrapperContained.getWireColor(powerLevel); }
// public yarnwrap.block.BlockState getPlacementState(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getPlacementState(world.wrapperContained,state.wrapperContained,pos.wrapperContained)); }
// // public yarnwrap.block.enums.WireConnection getRenderConnectionType(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return new yarnwrap.block.enums.WireConnection(wrapperContained.getRenderConnectionType(world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// public int getReceivedRedstonePower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getReceivedRedstonePower(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState getDefaultWireState(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getDefaultWireState(world.wrapperContained,state.wrapperContained,pos.wrapperContained)); }
// public void updateOffsetNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateOffsetNeighbors(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getShapeForState(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShapeForState(state.wrapperContained)); }
// public boolean isFullyConnected(yarnwrap.block.BlockState state) { return wrapperContained.isFullyConnected(state.wrapperContained); }
// public void addPoweredParticles(yarnwrap.world.World world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3d color) { wrapperContained.addPoweredParticles(world.wrapperContained,random.wrapperContained,pos.wrapperContained,color.wrapperContained); }
// public boolean canRunOnTop(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState floor) { return wrapperContained.canRunOnTop(world.wrapperContained,pos.wrapperContained,floor.wrapperContained); }
// public void updateForNewState(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState) { wrapperContained.updateForNewState(world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained); }
// public boolean isNotConnected(yarnwrap.block.BlockState state) { return wrapperContained.isNotConnected(state.wrapperContained); }

}