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

// public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EAST = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.ConnectingBlock.EAST); }
// public static void EAST(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.ConnectingBlock.EAST = value.wrapperContained; }

// public java.util.function.Function shapeFunction() { return wrapperContained.shapeFunction; }
// public void shapeFunction(java.util.function.Function value) { wrapperContained.shapeFunction = value; }
// public static java.util.function.Function shapeFunction() { return net.minecraft.block.ConnectingBlock.shapeFunction; }
// public static void shapeFunction(java.util.function.Function value, ) { net.minecraft.block.ConnectingBlock.shapeFunction = value; }

// public ConnectingBlock(float radius,Object settings) { this.wrapperContained = new net.minecraft.block.ConnectingBlock(radius,settings); }
// public java.util.function.Function createShapeFunction(float radius) { return wrapperContained.createShapeFunction(radius); }
// public static java.util.function.Function createShapeFunction(float radius, ) { return net.minecraft.block.ConnectingBlock.createShapeFunction(radius); }
// public yarnwrap.util.shape.VoxelShape method_66457(yarnwrap.util.shape.VoxelShape state) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.method_66457(state.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape method_66457(yarnwrap.util.shape.VoxelShape state, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ConnectingBlock.method_66457(state.wrapperContained)); }

}