package yarnwrap.util.shape;
public class VoxelShapes { public net.minecraft.util.shape.VoxelShapes wrapperContained; public VoxelShapes(net.minecraft.util.shape.VoxelShapes wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EMPTY() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EMPTY = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape FULL_CUBE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FULL_CUBE); }
// public void FULL_CUBE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.FULL_CUBE = value.wrapperContained; }
public yarnwrap.util.shape.VoxelShape UNBOUNDED() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UNBOUNDED); }
// public void UNBOUNDED(yarnwrap.util.shape.VoxelShape value) { wrapperContained.UNBOUNDED = value.wrapperContained; }
public double MIN_SIZE() { return wrapperContained.MIN_SIZE; }
// public void MIN_SIZE(double value) { wrapperContained.MIN_SIZE = value; }
// public yarnwrap.util.shape.PairList createListPair(int size,it.unimi.dsi.fastutil.doubles.DoubleList first,it.unimi.dsi.fastutil.doubles.DoubleList second,boolean includeFirst,boolean includeSecond) { return new yarnwrap.util.shape.PairList(wrapperContained.createListPair(size,first,second,includeFirst,includeSecond)); }
// public boolean method_1070(yarnwrap.util.function.BooleanBiFunction z1,yarnwrap.util.shape.VoxelSet z2,int index3) { return wrapperContained.method_1070(z1.wrapperContained,z2.wrapperContained,index3); }
// // // public boolean matchesAnywhere(yarnwrap.util.shape.PairList mergedX,yarnwrap.util.shape.PairList mergedY,yarnwrap.util.shape.PairList mergedZ,yarnwrap.util.shape.VoxelSet shape1,yarnwrap.util.shape.VoxelSet shape2,yarnwrap.util.function.BooleanBiFunction predicate) { return wrapperContained.matchesAnywhere(mergedX.wrapperContained,mergedY.wrapperContained,mergedZ.wrapperContained,shape1.wrapperContained,shape2.wrapperContained,predicate.wrapperContained); }
public yarnwrap.util.shape.VoxelShape combineAndSimplify(yarnwrap.util.shape.VoxelShape first,yarnwrap.util.shape.VoxelShape second,yarnwrap.util.function.BooleanBiFunction function) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.combineAndSimplify(first.wrapperContained,second.wrapperContained,function.wrapperContained)); }
public yarnwrap.util.shape.VoxelShape empty() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.empty()); }
public boolean matchesAnywhere(yarnwrap.util.shape.VoxelShape shape1,yarnwrap.util.shape.VoxelShape shape2,yarnwrap.util.function.BooleanBiFunction predicate) { return wrapperContained.matchesAnywhere(shape1.wrapperContained,shape2.wrapperContained,predicate.wrapperContained); }
// // public boolean method_1075(yarnwrap.util.shape.PairList x1,yarnwrap.util.shape.PairList x2,yarnwrap.util.function.BooleanBiFunction index1) { return wrapperContained.method_1075(x1.wrapperContained,x2.wrapperContained,index1.wrapperContained); }
// public boolean method_1076(yarnwrap.util.shape.PairList y1,yarnwrap.util.function.BooleanBiFunction y2,yarnwrap.util.shape.VoxelSet index2) { return wrapperContained.method_1076(y1.wrapperContained,y2.wrapperContained,index2.wrapperContained); }
public yarnwrap.util.shape.VoxelShape fullCube() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.fullCube()); }
public yarnwrap.util.shape.VoxelShape cuboid(yarnwrap.util.math.Box box) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.cuboid(box.wrapperContained)); }
// public long lcm(int a,int b) { return wrapperContained.lcm(a,b); }
public boolean adjacentSidesCoverSquare(yarnwrap.util.shape.VoxelShape one,yarnwrap.util.shape.VoxelShape two,yarnwrap.util.math.Direction direction) { return wrapperContained.adjacentSidesCoverSquare(one.wrapperContained,two.wrapperContained,direction.wrapperContained); }
public yarnwrap.util.shape.VoxelShape cuboid(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.cuboid(minX,minY,minZ,maxX,maxY,maxZ)); }
public yarnwrap.util.shape.VoxelShape combine(yarnwrap.util.shape.VoxelShape one,yarnwrap.util.shape.VoxelShape two,yarnwrap.util.function.BooleanBiFunction function) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.combine(one.wrapperContained,two.wrapperContained,function.wrapperContained)); }
public boolean isSideCovered(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.shape.VoxelShape neighbor,yarnwrap.util.math.Direction direction) { return wrapperContained.isSideCovered(shape.wrapperContained,neighbor.wrapperContained,direction.wrapperContained); }
public yarnwrap.util.shape.VoxelShape union(yarnwrap.util.shape.VoxelShape first,yarnwrap.util.shape.VoxelShape second) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.union(first.wrapperContained,second.wrapperContained)); }
// public double calculateMaxOffset(Object axis,yarnwrap.util.math.Box box,java.lang.Iterable shapes,double maxDist) { return wrapperContained.calculateMaxOffset(axis,box.wrapperContained,shapes,maxDist); }
// public int findRequiredBitResolution(double min,double max) { return wrapperContained.findRequiredBitResolution(min,max); }
public yarnwrap.util.shape.VoxelShape extrudeFace(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Direction direction) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.extrudeFace(shape.wrapperContained,direction.wrapperContained)); }
public yarnwrap.util.shape.VoxelShape union(yarnwrap.util.shape.VoxelShape first,net.minecraft.util.shape.VoxelShape[] others) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.union(first.wrapperContained,others)); }
public boolean unionCoversFullCube(yarnwrap.util.shape.VoxelShape one,yarnwrap.util.shape.VoxelShape two) { return wrapperContained.unionCoversFullCube(one.wrapperContained,two.wrapperContained); }
public yarnwrap.util.shape.VoxelShape cuboidUnchecked(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.cuboidUnchecked(minX,minY,minZ,maxX,maxY,maxZ)); }

}