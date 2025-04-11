package yarnwrap.util.shape;
public class ArrayVoxelShape { public net.minecraft.util.shape.ArrayVoxelShape wrapperContained; public ArrayVoxelShape(net.minecraft.util.shape.ArrayVoxelShape wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.doubles.DoubleList xPoints() { return wrapperContained.xPoints; }
// public void xPoints(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.xPoints = value; }
// public it.unimi.dsi.fastutil.doubles.DoubleList yPoints() { return wrapperContained.yPoints; }
// public void yPoints(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.yPoints = value; }
// public it.unimi.dsi.fastutil.doubles.DoubleList zPoints() { return wrapperContained.zPoints; }
// public void zPoints(it.unimi.dsi.fastutil.doubles.DoubleList value) { wrapperContained.zPoints = value; }
// public ArrayVoxelShape(yarnwrap.util.shape.VoxelSet shape,it.unimi.dsi.fastutil.doubles.DoubleList xPoints,it.unimi.dsi.fastutil.doubles.DoubleList yPoints,it.unimi.dsi.fastutil.doubles.DoubleList zPoints) { this.wrapperContained = new net.minecraft.util.shape.ArrayVoxelShape(shape.wrapperContained,xPoints,yPoints,zPoints); }
// public ArrayVoxelShape(yarnwrap.util.shape.VoxelSet shape,double xPoints,double yPoints,double zPoints) { this.wrapperContained = new net.minecraft.util.shape.ArrayVoxelShape(shape.wrapperContained,xPoints,yPoints,zPoints); }

}