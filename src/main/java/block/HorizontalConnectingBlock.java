package yarnwrap.block;
public class HorizontalConnectingBlock { public net.minecraft.block.HorizontalConnectingBlock wrapperContained; public HorizontalConnectingBlock(net.minecraft.block.HorizontalConnectingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public net.minecraft.util.shape.VoxelShape[] collisionShapes() { return wrapperContained.collisionShapes; }
// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public net.minecraft.util.shape.VoxelShape[] boundingShapes() { return wrapperContained.boundingShapes; }
public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public it.unimi.dsi.fastutil.objects.Object2IntMap SHAPE_INDEX_CACHE() { return wrapperContained.SHAPE_INDEX_CACHE; }
// public net.minecraft.util.shape.VoxelShape[] createShapes(float radius1,float radius2,float height1,float offset2,float height2) { return wrapperContained.createShapes(radius1,radius2,height1,offset2,height2); }
// public int getDirectionMask(yarnwrap.util.math.Direction dir) { return wrapperContained.getDirectionMask(dir.wrapperContained); }
// public int getShapeIndex(yarnwrap.block.BlockState state) { return wrapperContained.getShapeIndex(state.wrapperContained); }

}