package yarnwrap.block;
public class ConnectingBlock { public net.minecraft.block.ConnectingBlock wrapperContained; public ConnectingBlock(net.minecraft.block.ConnectingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
// public void UP(yarnwrap.state.property.BooleanProperty value) { wrapperContained.UP = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ConnectingBlock.UP); }
// public static void UP(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ConnectingBlock.UP = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
// public void WEST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WEST = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ConnectingBlock.WEST); }
// public static void WEST(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ConnectingBlock.WEST = value.wrapperContained; }

// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public void FACING_PROPERTIES(java.util.Map value) { wrapperContained.FACING_PROPERTIES = value; }
public static java.util.Map FACING_PROPERTIES() { return net.minecraft.block.ConnectingBlock.FACING_PROPERTIES; }
// public static void FACING_PROPERTIES(java.util.Map value, ) { net.minecraft.block.ConnectingBlock.FACING_PROPERTIES = value; }

// public yarnwrap.state.property.BooleanProperty DOWN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.DOWN); }
// public void DOWN(yarnwrap.state.property.BooleanProperty value) { wrapperContained.DOWN = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty DOWN() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ConnectingBlock.DOWN); }
// public static void DOWN(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ConnectingBlock.DOWN = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public void SOUTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SOUTH = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ConnectingBlock.SOUTH); }
// public static void SOUTH(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ConnectingBlock.SOUTH = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public void NORTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.NORTH = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ConnectingBlock.NORTH); }
// public static void NORTH(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ConnectingBlock.NORTH = value.wrapperContained; }

// public net.minecraft.util.shape.VoxelShape[] facingsToShape() { return wrapperContained.facingsToShape; }
// public void facingsToShape(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.facingsToShape = value; }
// public static net.minecraft.util.shape.VoxelShape[] facingsToShape() { return net.minecraft.block.ConnectingBlock.facingsToShape; }
// public static void facingsToShape(net.minecraft.util.shape.VoxelShape[] value, ) { net.minecraft.block.ConnectingBlock.facingsToShape = value; }

// public net.minecraft.util.math.Direction[] FACINGS() { return wrapperContained.FACINGS; }
// public void FACINGS(net.minecraft.util.math.Direction[] value) { wrapperContained.FACINGS = value; }
// public static net.minecraft.util.math.Direction[] FACINGS() { return net.minecraft.block.ConnectingBlock.FACINGS; }
// public static void FACINGS(net.minecraft.util.math.Direction[] value, ) { net.minecraft.block.ConnectingBlock.FACINGS = value; }

// public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EAST = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ConnectingBlock.EAST); }
// public static void EAST(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ConnectingBlock.EAST = value.wrapperContained; }

// public ConnectingBlock(float radius,Object settings) { this.wrapperContained = new net.minecraft.block.ConnectingBlock(radius,settings); }
// public int getConnectionMask(yarnwrap.block.BlockState state) { return wrapperContained.getConnectionMask(state.wrapperContained); }
// public static int getConnectionMask(yarnwrap.block.BlockState state, ) { return net.minecraft.block.ConnectingBlock.getConnectionMask(state.wrapperContained); }
// public void method_10369(java.util.EnumMap directions) { wrapperContained.method_10369(directions); }
// public static void method_10369(java.util.EnumMap directions, ) { net.minecraft.block.ConnectingBlock.method_10369(directions); }
// public net.minecraft.util.shape.VoxelShape[] generateFacingsToShapeMap(float radius) { return wrapperContained.generateFacingsToShapeMap(radius); }
// public static net.minecraft.util.shape.VoxelShape[] generateFacingsToShapeMap(float radius, ) { return net.minecraft.block.ConnectingBlock.generateFacingsToShapeMap(radius); }

}