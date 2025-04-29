package yarnwrap.util.shape;
public class SlicedVoxelShape { public net.minecraft.util.shape.SlicedVoxelShape wrapperContained; public SlicedVoxelShape(net.minecraft.util.shape.SlicedVoxelShape wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.doubles.DoubleList POINTS() { return wrapperContained.POINTS; }
// public void POINTS(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.POINTS = value; }
// public static it.unimi.dsi.fastutil.doubles.DoubleList POINTS() { return net.minecraft.util.shape.SlicedVoxelShape.POINTS; }
// public static void POINTS(it.unimi.dsi.fastutil.doubles.DoubleList value, ) { net.minecraft.util.shape.SlicedVoxelShape.POINTS = value; }

// public Object axis() { return wrapperContained.axis; }
// // public void axis(Object value) { wrapperContained.axis = value; }
// // public static Object axis() { return net.minecraft.util.shape.SlicedVoxelShape.axis; }
// // public static void axis(Object value, ) { net.minecraft.util.shape.SlicedVoxelShape.axis = value; }

// public yarnwrap.util.shape.VoxelShape shape() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.shape); }
// public void shape(yarnwrap.util.shape.VoxelShape value) { wrapperContained.shape = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape shape() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.SlicedVoxelShape.shape); }
// public static void shape(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.util.shape.SlicedVoxelShape.shape = value.wrapperContained; }

// public SlicedVoxelShape(yarnwrap.util.shape.VoxelShape shape,Object axis,int sliceWidth) { this.wrapperContained = new net.minecraft.util.shape.SlicedVoxelShape(shape.wrapperContained,axis,sliceWidth); }
// public yarnwrap.util.shape.VoxelSet createVoxelSet(yarnwrap.util.shape.VoxelSet voxelSet,Object axis,int sliceWidth) { return new yarnwrap.util.shape.VoxelSet(wrapperContained.createVoxelSet(voxelSet.wrapperContained,axis,sliceWidth)); }
// public static yarnwrap.util.shape.VoxelSet createVoxelSet(yarnwrap.util.shape.VoxelSet voxelSet,Object axis,int sliceWidth, ) { return new yarnwrap.util.shape.VoxelSet(net.minecraft.util.shape.SlicedVoxelShape.createVoxelSet(voxelSet.wrapperContained,axis,sliceWidth)); }

}