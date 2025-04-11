package yarnwrap.block;
public class ConnectingBlock { public net.minecraft.block.ConnectingBlock wrapperContained; public ConnectingBlock(net.minecraft.block.ConnectingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
// public void UP(yarnwrap.state.property.BooleanProperty value) { wrapperContained.UP = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
// public void WEST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WEST = value.wrapperContained; }
public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public void FACING_PROPERTIES(java.util.Map value) { wrapperContained.FACING_PROPERTIES = value; }
public yarnwrap.state.property.BooleanProperty DOWN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.DOWN); }
// public void DOWN(yarnwrap.state.property.BooleanProperty value) { wrapperContained.DOWN = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public void SOUTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SOUTH = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public void NORTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.NORTH = value.wrapperContained; }
// public net.minecraft.util.shape.VoxelShape[] facingsToShape() { return wrapperContained.facingsToShape; }
// public void facingsToShape(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.facingsToShape = value; }
// public net.minecraft.util.math.Direction[] FACINGS() { return wrapperContained.FACINGS; }
// public void FACINGS(net.minecraft.util.math.Direction[] value) { wrapperContained.FACINGS = value; }
public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EAST = value.wrapperContained; }
// public int getConnectionMask(yarnwrap.block.BlockState state) { return wrapperContained.getConnectionMask(state.wrapperContained); }
// public net.minecraft.util.shape.VoxelShape[] generateFacingsToShapeMap(float radius) { return wrapperContained.generateFacingsToShapeMap(radius); }

}