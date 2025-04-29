package yarnwrap.block;
public class RedstoneWireBlock { public net.minecraft.block.RedstoneWireBlock wrapperContained; public RedstoneWireBlock(net.minecraft.block.RedstoneWireBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
// public void POWER(yarnwrap.state.property.IntProperty value) { wrapperContained.POWER = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.RedstoneWireBlock.POWER); }
// public static void POWER(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.RedstoneWireBlock.POWER = value.wrapperContained; }

// public java.util.Map DIRECTION_TO_WIRE_CONNECTION_PROPERTY() { return wrapperContained.DIRECTION_TO_WIRE_CONNECTION_PROPERTY; }
// public void DIRECTION_TO_WIRE_CONNECTION_PROPERTY(java.util.Map value) { wrapperContained.DIRECTION_TO_WIRE_CONNECTION_PROPERTY = value; }
public static java.util.Map DIRECTION_TO_WIRE_CONNECTION_PROPERTY() { return net.minecraft.block.RedstoneWireBlock.DIRECTION_TO_WIRE_CONNECTION_PROPERTY; }
// public static void DIRECTION_TO_WIRE_CONNECTION_PROPERTY(java.util.Map value, ) { net.minecraft.block.RedstoneWireBlock.DIRECTION_TO_WIRE_CONNECTION_PROPERTY = value; }

// public yarnwrap.state.property.EnumProperty WIRE_CONNECTION_EAST() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WIRE_CONNECTION_EAST); }
// public void WIRE_CONNECTION_EAST(yarnwrap.state.property.EnumProperty value) { wrapperContained.WIRE_CONNECTION_EAST = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty WIRE_CONNECTION_EAST() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.RedstoneWireBlock.WIRE_CONNECTION_EAST); }
// public static void WIRE_CONNECTION_EAST(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.RedstoneWireBlock.WIRE_CONNECTION_EAST = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty WIRE_CONNECTION_SOUTH() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WIRE_CONNECTION_SOUTH); }
// public void WIRE_CONNECTION_SOUTH(yarnwrap.state.property.EnumProperty value) { wrapperContained.WIRE_CONNECTION_SOUTH = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty WIRE_CONNECTION_SOUTH() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.RedstoneWireBlock.WIRE_CONNECTION_SOUTH); }
// public static void WIRE_CONNECTION_SOUTH(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.RedstoneWireBlock.WIRE_CONNECTION_SOUTH = value.wrapperContained; }

// public boolean wiresGivePower() { return wrapperContained.wiresGivePower; }
// public void wiresGivePower(boolean value) { wrapperContained.wiresGivePower = value; }
// public static boolean wiresGivePower() { return net.minecraft.block.RedstoneWireBlock.wiresGivePower; }
// public static void wiresGivePower(boolean value, ) { net.minecraft.block.RedstoneWireBlock.wiresGivePower = value; }

// public yarnwrap.state.property.EnumProperty WIRE_CONNECTION_WEST() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WIRE_CONNECTION_WEST); }
// public void WIRE_CONNECTION_WEST(yarnwrap.state.property.EnumProperty value) { wrapperContained.WIRE_CONNECTION_WEST = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty WIRE_CONNECTION_WEST() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.RedstoneWireBlock.WIRE_CONNECTION_WEST); }
// public static void WIRE_CONNECTION_WEST(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.RedstoneWireBlock.WIRE_CONNECTION_WEST = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty WIRE_CONNECTION_NORTH() { return new yarnwrap.state.property.EnumProperty(wrapperContained.WIRE_CONNECTION_NORTH); }
// public void WIRE_CONNECTION_NORTH(yarnwrap.state.property.EnumProperty value) { wrapperContained.WIRE_CONNECTION_NORTH = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty WIRE_CONNECTION_NORTH() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.RedstoneWireBlock.WIRE_CONNECTION_NORTH); }
// public static void WIRE_CONNECTION_NORTH(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.RedstoneWireBlock.WIRE_CONNECTION_NORTH = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape DOT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.DOT_SHAPE); }
// public void DOT_SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.DOT_SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape DOT_SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.RedstoneWireBlock.DOT_SHAPE); }
// public static void DOT_SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.RedstoneWireBlock.DOT_SHAPE = value.wrapperContained; }

// public java.util.Map DIRECTION_TO_SIDE_SHAPE() { return wrapperContained.DIRECTION_TO_SIDE_SHAPE; }
// public void DIRECTION_TO_SIDE_SHAPE(java.util.Map value) { wrapperContained.DIRECTION_TO_SIDE_SHAPE = value; }
// public static java.util.Map DIRECTION_TO_SIDE_SHAPE() { return net.minecraft.block.RedstoneWireBlock.DIRECTION_TO_SIDE_SHAPE; }
// public static void DIRECTION_TO_SIDE_SHAPE(java.util.Map value, ) { net.minecraft.block.RedstoneWireBlock.DIRECTION_TO_SIDE_SHAPE = value; }

// public java.util.Map DIRECTION_TO_UP_SHAPE() { return wrapperContained.DIRECTION_TO_UP_SHAPE; }
// public void DIRECTION_TO_UP_SHAPE(java.util.Map value) { wrapperContained.DIRECTION_TO_UP_SHAPE = value; }
// public static java.util.Map DIRECTION_TO_UP_SHAPE() { return net.minecraft.block.RedstoneWireBlock.DIRECTION_TO_UP_SHAPE; }
// public static void DIRECTION_TO_UP_SHAPE(java.util.Map value, ) { net.minecraft.block.RedstoneWireBlock.DIRECTION_TO_UP_SHAPE = value; }

// public java.util.Map SHAPES() { return wrapperContained.SHAPES; }
// public void SHAPES(java.util.Map value) { wrapperContained.SHAPES = value; }
// public static java.util.Map SHAPES() { return net.minecraft.block.RedstoneWireBlock.SHAPES; }
// public static void SHAPES(java.util.Map value, ) { net.minecraft.block.RedstoneWireBlock.SHAPES = value; }

// public net.minecraft.util.math.Vec3d[] COLORS() { return wrapperContained.COLORS; }
// public void COLORS(net.minecraft.util.math.Vec3d[] value) { wrapperContained.COLORS = value; }
// public static net.minecraft.util.math.Vec3d[] COLORS() { return net.minecraft.block.RedstoneWireBlock.COLORS; }
// public static void COLORS(net.minecraft.util.math.Vec3d[] value, ) { net.minecraft.block.RedstoneWireBlock.COLORS = value; }

// public yarnwrap.block.BlockState dotState() { return new yarnwrap.block.BlockState(wrapperContained.dotState); }
// public void dotState(yarnwrap.block.BlockState value) { wrapperContained.dotState = value.wrapperContained; }
// public static yarnwrap.block.BlockState dotState() { return new yarnwrap.block.BlockState(net.minecraft.block.RedstoneWireBlock.dotState); }
// public static void dotState(yarnwrap.block.BlockState value, ) { net.minecraft.block.RedstoneWireBlock.dotState = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.RedstoneWireBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.RedstoneWireBlock.CODEC = value; }

// public yarnwrap.block.enums.WireConnection getRenderConnectionType(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return new yarnwrap.block.enums.WireConnection(wrapperContained.getRenderConnectionType(world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// public static yarnwrap.block.enums.WireConnection getRenderConnectionType(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return new yarnwrap.block.enums.WireConnection(net.minecraft.block.RedstoneWireBlock.getRenderConnectionType(world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// public void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateNeighbors(world.wrapperContained,pos.wrapperContained); }
// public static void updateNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.RedstoneWireBlock.updateNeighbors(world.wrapperContained,pos.wrapperContained); }
// public boolean connectsTo(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction dir) { return wrapperContained.connectsTo(state.wrapperContained,dir.wrapperContained); }
// public static boolean connectsTo(yarnwrap.block.BlockState state,yarnwrap.util.math.Direction dir, ) { return net.minecraft.block.RedstoneWireBlock.connectsTo(state.wrapperContained,dir.wrapperContained); }
// public boolean connectsTo(yarnwrap.block.BlockState state) { return wrapperContained.connectsTo(state.wrapperContained); }
// public static boolean connectsTo(yarnwrap.block.BlockState state, ) { return net.minecraft.block.RedstoneWireBlock.connectsTo(state.wrapperContained); }
// public void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void update(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.block.RedstoneWireBlock.update(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public int increasePower(yarnwrap.block.BlockState state) { return wrapperContained.increasePower(state.wrapperContained); }
// public static int increasePower(yarnwrap.block.BlockState state, ) { return net.minecraft.block.RedstoneWireBlock.increasePower(state.wrapperContained); }
// public int getWireColor(int powerLevel) { return wrapperContained.getWireColor(powerLevel); }
// public static int getWireColor(int powerLevel, ) { return net.minecraft.block.RedstoneWireBlock.getWireColor(powerLevel); }
// public yarnwrap.block.BlockState getPlacementState(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getPlacementState(world.wrapperContained,state.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState getPlacementState(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.RedstoneWireBlock.getPlacementState(world.wrapperContained,state.wrapperContained,pos.wrapperContained)); }
// // public yarnwrap.block.enums.WireConnection getRenderConnectionType(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return new yarnwrap.block.enums.WireConnection(wrapperContained.getRenderConnectionType(world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// // public static yarnwrap.block.enums.WireConnection getRenderConnectionType(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction, ) { return new yarnwrap.block.enums.WireConnection(net.minecraft.block.RedstoneWireBlock.getRenderConnectionType(world.wrapperContained,pos.wrapperContained,direction.wrapperContained)); }
// public int getReceivedRedstonePower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.getReceivedRedstonePower(world.wrapperContained,pos.wrapperContained); }
// public static int getReceivedRedstonePower(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.RedstoneWireBlock.getReceivedRedstonePower(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState getDefaultWireState(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getDefaultWireState(world.wrapperContained,state.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState getDefaultWireState(yarnwrap.world.BlockView world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.RedstoneWireBlock.getDefaultWireState(world.wrapperContained,state.wrapperContained,pos.wrapperContained)); }
// public void updateOffsetNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.updateOffsetNeighbors(world.wrapperContained,pos.wrapperContained); }
// public static void updateOffsetNeighbors(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.RedstoneWireBlock.updateOffsetNeighbors(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape getShapeForState(yarnwrap.block.BlockState state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getShapeForState(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getShapeForState(yarnwrap.block.BlockState state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.RedstoneWireBlock.getShapeForState(state.wrapperContained)); }
// public boolean isFullyConnected(yarnwrap.block.BlockState state) { return wrapperContained.isFullyConnected(state.wrapperContained); }
// public static boolean isFullyConnected(yarnwrap.block.BlockState state, ) { return net.minecraft.block.RedstoneWireBlock.isFullyConnected(state.wrapperContained); }
// public void addPoweredParticles(yarnwrap.world.World world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3d color) { wrapperContained.addPoweredParticles(world.wrapperContained,random.wrapperContained,pos.wrapperContained,color.wrapperContained); }
// public static void addPoweredParticles(yarnwrap.world.World world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Vec3d color, ) { net.minecraft.block.RedstoneWireBlock.addPoweredParticles(world.wrapperContained,random.wrapperContained,pos.wrapperContained,color.wrapperContained); }
// public boolean canRunOnTop(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState floor) { return wrapperContained.canRunOnTop(world.wrapperContained,pos.wrapperContained,floor.wrapperContained); }
// public static boolean canRunOnTop(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState floor, ) { return net.minecraft.block.RedstoneWireBlock.canRunOnTop(world.wrapperContained,pos.wrapperContained,floor.wrapperContained); }
// public void updateForNewState(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState) { wrapperContained.updateForNewState(world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained); }
// public static void updateForNewState(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState oldState,yarnwrap.block.BlockState newState, ) { net.minecraft.block.RedstoneWireBlock.updateForNewState(world.wrapperContained,pos.wrapperContained,oldState.wrapperContained,newState.wrapperContained); }
// public boolean isNotConnected(yarnwrap.block.BlockState state) { return wrapperContained.isNotConnected(state.wrapperContained); }
// public static boolean isNotConnected(yarnwrap.block.BlockState state, ) { return net.minecraft.block.RedstoneWireBlock.isNotConnected(state.wrapperContained); }
// public void method_31649(net.minecraft.util.math.Vec3d[] colors) { wrapperContained.method_31649(colors); }
// public static void method_31649(net.minecraft.util.math.Vec3d[] colors, ) { net.minecraft.block.RedstoneWireBlock.method_31649(colors); }

}