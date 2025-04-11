package yarnwrap.block;
public class HorizontalConnectingBlock { public net.minecraft.block.HorizontalConnectingBlock wrapperContained; public HorizontalConnectingBlock(net.minecraft.block.HorizontalConnectingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public net.minecraft.util.shape.VoxelShape[] collisionShapes() { return wrapperContained.collisionShapes; }
// public void collisionShapes(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.collisionShapes = value; }
// public java.util.Map FACING_PROPERTIES() { return wrapperContained.FACING_PROPERTIES; }
// public void FACING_PROPERTIES(java.util.Map value) { wrapperContained.FACING_PROPERTIES = value; }
public yarnwrap.state.property.BooleanProperty WEST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WEST); }
// public void WEST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WEST = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty SOUTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SOUTH); }
// public void SOUTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SOUTH = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty NORTH() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NORTH); }
// public void NORTH(yarnwrap.state.property.BooleanProperty value) { wrapperContained.NORTH = value.wrapperContained; }
// public net.minecraft.util.shape.VoxelShape[] boundingShapes() { return wrapperContained.boundingShapes; }
// public void boundingShapes(net.minecraft.util.shape.VoxelShape[] value) { wrapperContained.boundingShapes = value; }
public yarnwrap.state.property.BooleanProperty EAST() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.EAST); }
// public void EAST(yarnwrap.state.property.BooleanProperty value) { wrapperContained.EAST = value.wrapperContained; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap SHAPE_INDEX_CACHE() { return wrapperContained.SHAPE_INDEX_CACHE; }
// public void SHAPE_INDEX_CACHE(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.SHAPE_INDEX_CACHE = value; }
// public net.minecraft.util.shape.VoxelShape[] createShapes(float radius1,float radius2,float height1,float offset2,float height2) { return wrapperContained.createShapes(radius1,radius2,height1,offset2,height2); }
// public int getDirectionMask(yarnwrap.util.math.Direction dir) { return wrapperContained.getDirectionMask(dir.wrapperContained); }
// public int getShapeIndex(yarnwrap.block.BlockState state) { return wrapperContained.getShapeIndex(state.wrapperContained); }

}