package yarnwrap.util.shape;
public class SlicedVoxelShape { public net.minecraft.util.shape.SlicedVoxelShape wrapperContained; public SlicedVoxelShape(net.minecraft.util.shape.SlicedVoxelShape wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.doubles.DoubleList POINTS() { return wrapperContained.POINTS; }
// public void POINTS(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.POINTS = value; }
// public Object axis() { return wrapperContained.axis; }
// // public void axis(Object value) { wrapperContained.axis = value; }
// public yarnwrap.util.shape.VoxelShape shape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.shape); }
// public void shape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.shape = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelSet createVoxelSet(yarnwrap.util.shape.VoxelSet voxelSet,Object axis,int sliceWidth) { return new yarnwrap.util.shape.VoxelSet(wrapperContained.createVoxelSet(voxelSet.wrapperContained,axis,sliceWidth)); }

}