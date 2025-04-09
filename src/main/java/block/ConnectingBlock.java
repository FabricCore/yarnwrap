package yarnwrap.block;
public class ConnectingBlock { public net.minecraft.block.ConnectingBlock wrapperContained; public ConnectingBlock(net.minecraft.block.ConnectingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty UP() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UP); }
public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
public yarnwrap.state.property.BooleanProperty DOWN() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.DOWN); }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public net.minecraft.util.shape.VoxelShape[] facingsToShape() { return wrapperContained.facingsToShape; }
// public net.minecraft.util.math.Direction[] FACINGS() { return wrapperContained.FACINGS; }
public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public int getConnectionMask(yarnwrap.block.BlockState state) { return wrapperContained.getConnectionMask(state.wrapperContained); }
// public net.minecraft.util.shape.VoxelShape[] generateFacingsToShapeMap(float radius) { return wrapperContained.generateFacingsToShapeMap(radius); }

}