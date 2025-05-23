package yarnwrap.util.shape;
public class VoxelShapes { public net.minecraft.util.shape.VoxelShapes wrapperContained; public VoxelShapes(net.minecraft.util.shape.VoxelShapes wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape EMPTY() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.util.shape.VoxelShape value) { wrapperContained.EMPTY = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape EMPTY() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.EMPTY); }
// public static void EMPTY(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.util.shape.VoxelShapes.EMPTY = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape FULL_CUBE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.FULL_CUBE); }
// public void FULL_CUBE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.FULL_CUBE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape FULL_CUBE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.FULL_CUBE); }
// public static void FULL_CUBE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.util.shape.VoxelShapes.FULL_CUBE = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape UNBOUNDED() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.UNBOUNDED); }
// public void UNBOUNDED(yarnwrap.util.shape.VoxelShape value) { wrapperContained.UNBOUNDED = value.wrapperContained; }
public static yarnwrap.util.shape.VoxelShape UNBOUNDED() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.UNBOUNDED); }
// public static void UNBOUNDED(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.util.shape.VoxelShapes.UNBOUNDED = value.wrapperContained; }

// public double MIN_SIZE() { return wrapperContained.MIN_SIZE; }
// public void MIN_SIZE(double value) { wrapperContained.MIN_SIZE = value; }
public static double MIN_SIZE() { return net.minecraft.util.shape.VoxelShapes.MIN_SIZE; }
// public static void MIN_SIZE(double value, ) { net.minecraft.util.shape.VoxelShapes.MIN_SIZE = value; }

// public yarnwrap.util.math.Vec3d BLOCK_CENTER() { return new yarnwrap.util.math.Vec3d(wrapperContained.BLOCK_CENTER); }
// public void BLOCK_CENTER(yarnwrap.util.math.Vec3d value) { wrapperContained.BLOCK_CENTER = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d BLOCK_CENTER() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.shape.VoxelShapes.BLOCK_CENTER); }
// public static void BLOCK_CENTER(yarnwrap.util.math.Vec3d value, ) { net.minecraft.util.shape.VoxelShapes.BLOCK_CENTER = value.wrapperContained; }

// public yarnwrap.util.shape.PairList createListPair(int size,it.unimi.dsi.fastutil.doubles.DoubleList first,it.unimi.dsi.fastutil.doubles.DoubleList second,boolean includeFirst,boolean includeSecond) { return new yarnwrap.util.shape.PairList(wrapperContained.createListPair(size,first,second,includeFirst,includeSecond)); }
// public static yarnwrap.util.shape.PairList createListPair(int size,it.unimi.dsi.fastutil.doubles.DoubleList first,it.unimi.dsi.fastutil.doubles.DoubleList second,boolean includeFirst,boolean includeSecond, ) { return new yarnwrap.util.shape.PairList(net.minecraft.util.shape.VoxelShapes.createListPair(size,first,second,includeFirst,includeSecond)); }
// public boolean method_1070(yarnwrap.util.function.BooleanBiFunction z1,yarnwrap.util.shape.VoxelSet z2,int index3) { return wrapperContained.method_1070(z1.wrapperContained,z2.wrapperContained,index3); }
// public static boolean method_1070(yarnwrap.util.function.BooleanBiFunction z1,yarnwrap.util.shape.VoxelSet z2,int index3, ) { return net.minecraft.util.shape.VoxelShapes.method_1070(z1.wrapperContained,z2.wrapperContained,index3); }
// // // public boolean matchesAnywhere(yarnwrap.util.shape.PairList mergedX,yarnwrap.util.shape.PairList mergedY,yarnwrap.util.shape.PairList mergedZ,yarnwrap.util.shape.VoxelSet shape1,yarnwrap.util.shape.VoxelSet shape2,yarnwrap.util.function.BooleanBiFunction predicate) { return wrapperContained.matchesAnywhere(mergedX.wrapperContained,mergedY.wrapperContained,mergedZ.wrapperContained,shape1.wrapperContained,shape2.wrapperContained,predicate.wrapperContained); }
// // // public static boolean matchesAnywhere(yarnwrap.util.shape.PairList mergedX,yarnwrap.util.shape.PairList mergedY,yarnwrap.util.shape.PairList mergedZ,yarnwrap.util.shape.VoxelSet shape1,yarnwrap.util.shape.VoxelSet shape2,yarnwrap.util.function.BooleanBiFunction predicate, ) { return net.minecraft.util.shape.VoxelShapes.matchesAnywhere(mergedX.wrapperContained,mergedY.wrapperContained,mergedZ.wrapperContained,shape1.wrapperContained,shape2.wrapperContained,predicate.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape combineAndSimplify(yarnwrap.util.shape.VoxelShape first,yarnwrap.util.shape.VoxelShape second,yarnwrap.util.function.BooleanBiFunction function) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.combineAndSimplify(first.wrapperContained,second.wrapperContained,function.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape combineAndSimplify(yarnwrap.util.shape.VoxelShape first,yarnwrap.util.shape.VoxelShape second,yarnwrap.util.function.BooleanBiFunction function, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.combineAndSimplify(first.wrapperContained,second.wrapperContained,function.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape empty() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.empty()); }
public static yarnwrap.util.shape.VoxelShape empty() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.empty()); }
// public boolean matchesAnywhere(yarnwrap.util.shape.VoxelShape shape1,yarnwrap.util.shape.VoxelShape shape2,yarnwrap.util.function.BooleanBiFunction predicate) { return wrapperContained.matchesAnywhere(shape1.wrapperContained,shape2.wrapperContained,predicate.wrapperContained); }
// public static boolean matchesAnywhere(yarnwrap.util.shape.VoxelShape shape1,yarnwrap.util.shape.VoxelShape shape2,yarnwrap.util.function.BooleanBiFunction predicate, ) { return net.minecraft.util.shape.VoxelShapes.matchesAnywhere(shape1.wrapperContained,shape2.wrapperContained,predicate.wrapperContained); }
// // public boolean method_1075(yarnwrap.util.shape.PairList x1,yarnwrap.util.shape.PairList x2,yarnwrap.util.function.BooleanBiFunction index1) { return wrapperContained.method_1075(x1.wrapperContained,x2.wrapperContained,index1.wrapperContained); }
// // public static boolean method_1075(yarnwrap.util.shape.PairList x1,yarnwrap.util.shape.PairList x2,yarnwrap.util.function.BooleanBiFunction index1, ) { return net.minecraft.util.shape.VoxelShapes.method_1075(x1.wrapperContained,x2.wrapperContained,index1.wrapperContained); }
// public boolean method_1076(yarnwrap.util.shape.PairList y1,yarnwrap.util.function.BooleanBiFunction y2,yarnwrap.util.shape.VoxelSet index2) { return wrapperContained.method_1076(y1.wrapperContained,y2.wrapperContained,index2.wrapperContained); }
// public static boolean method_1076(yarnwrap.util.shape.PairList y1,yarnwrap.util.function.BooleanBiFunction y2,yarnwrap.util.shape.VoxelSet index2, ) { return net.minecraft.util.shape.VoxelShapes.method_1076(y1.wrapperContained,y2.wrapperContained,index2.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape fullCube() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.fullCube()); }
public static yarnwrap.util.shape.VoxelShape fullCube() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.fullCube()); }
// public yarnwrap.util.shape.VoxelShape cuboid(yarnwrap.util.math.Box box) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.cuboid(box.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape cuboid(yarnwrap.util.math.Box box, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.cuboid(box.wrapperContained)); }
// public long lcm(int a,int b) { return wrapperContained.lcm(a,b); }
// public static long lcm(int a,int b, ) { return net.minecraft.util.shape.VoxelShapes.lcm(a,b); }
// public boolean adjacentSidesCoverSquare(yarnwrap.util.shape.VoxelShape one,yarnwrap.util.shape.VoxelShape two,yarnwrap.util.math.Direction direction) { return wrapperContained.adjacentSidesCoverSquare(one.wrapperContained,two.wrapperContained,direction.wrapperContained); }
// public static boolean adjacentSidesCoverSquare(yarnwrap.util.shape.VoxelShape one,yarnwrap.util.shape.VoxelShape two,yarnwrap.util.math.Direction direction, ) { return net.minecraft.util.shape.VoxelShapes.adjacentSidesCoverSquare(one.wrapperContained,two.wrapperContained,direction.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape cuboid(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.cuboid(minX,minY,minZ,maxX,maxY,maxZ)); }
// public static yarnwrap.util.shape.VoxelShape cuboid(double minX,double minY,double minZ,double maxX,double maxY,double maxZ, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.cuboid(minX,minY,minZ,maxX,maxY,maxZ)); }
// public yarnwrap.util.shape.VoxelShape combine(yarnwrap.util.shape.VoxelShape one,yarnwrap.util.shape.VoxelShape two,yarnwrap.util.function.BooleanBiFunction function) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.combine(one.wrapperContained,two.wrapperContained,function.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape combine(yarnwrap.util.shape.VoxelShape one,yarnwrap.util.shape.VoxelShape two,yarnwrap.util.function.BooleanBiFunction function, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.combine(one.wrapperContained,two.wrapperContained,function.wrapperContained)); }
// public boolean isSideCovered(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.shape.VoxelShape neighbor,yarnwrap.util.math.Direction direction) { return wrapperContained.isSideCovered(shape.wrapperContained,neighbor.wrapperContained,direction.wrapperContained); }
// public static boolean isSideCovered(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.shape.VoxelShape neighbor,yarnwrap.util.math.Direction direction, ) { return net.minecraft.util.shape.VoxelShapes.isSideCovered(shape.wrapperContained,neighbor.wrapperContained,direction.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape union(yarnwrap.util.shape.VoxelShape first,yarnwrap.util.shape.VoxelShape second) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.union(first.wrapperContained,second.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape union(yarnwrap.util.shape.VoxelShape first,yarnwrap.util.shape.VoxelShape second, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.union(first.wrapperContained,second.wrapperContained)); }
// public double calculateMaxOffset(Object axis,yarnwrap.util.math.Box box,java.lang.Iterable shapes,double maxDist) { return wrapperContained.calculateMaxOffset(axis,box.wrapperContained,shapes,maxDist); }
// public static double calculateMaxOffset(Object axis,yarnwrap.util.math.Box box,java.lang.Iterable shapes,double maxDist, ) { return net.minecraft.util.shape.VoxelShapes.calculateMaxOffset(axis,box.wrapperContained,shapes,maxDist); }
// public int findRequiredBitResolution(double min,double max) { return wrapperContained.findRequiredBitResolution(min,max); }
// public static int findRequiredBitResolution(double min,double max, ) { return net.minecraft.util.shape.VoxelShapes.findRequiredBitResolution(min,max); }
// public yarnwrap.util.shape.VoxelShape union(yarnwrap.util.shape.VoxelShape first,net.minecraft.util.shape.VoxelShape[] others) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.union(first.wrapperContained,others)); }
// public static yarnwrap.util.shape.VoxelShape union(yarnwrap.util.shape.VoxelShape first,net.minecraft.util.shape.VoxelShape[] others, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.union(first.wrapperContained,others)); }
// public boolean unionCoversFullCube(yarnwrap.util.shape.VoxelShape one,yarnwrap.util.shape.VoxelShape two) { return wrapperContained.unionCoversFullCube(one.wrapperContained,two.wrapperContained); }
// public static boolean unionCoversFullCube(yarnwrap.util.shape.VoxelShape one,yarnwrap.util.shape.VoxelShape two, ) { return net.minecraft.util.shape.VoxelShapes.unionCoversFullCube(one.wrapperContained,two.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape cuboidUnchecked(double minX,double minY,double minZ,double maxX,double maxY,double maxZ) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.cuboidUnchecked(minX,minY,minZ,maxX,maxY,maxZ)); }
// public static yarnwrap.util.shape.VoxelShape cuboidUnchecked(double minX,double minY,double minZ,double maxX,double maxY,double maxZ, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.cuboidUnchecked(minX,minY,minZ,maxX,maxY,maxZ)); }
// public java.util.Map createHorizontalAxisShapeMap(yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.createHorizontalAxisShapeMap(shape.wrapperContained); }
// public static java.util.Map createHorizontalAxisShapeMap(yarnwrap.util.shape.VoxelShape shape, ) { return net.minecraft.util.shape.VoxelShapes.createHorizontalAxisShapeMap(shape.wrapperContained); }
// public java.util.Map createHorizontalAxisShapeMap(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Vec3d anchor) { return wrapperContained.createHorizontalAxisShapeMap(shape.wrapperContained,anchor.wrapperContained); }
// public static java.util.Map createHorizontalAxisShapeMap(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Vec3d anchor, ) { return net.minecraft.util.shape.VoxelShapes.createHorizontalAxisShapeMap(shape.wrapperContained,anchor.wrapperContained); }
// public yarnwrap.util.shape.VoxelShape transform(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.DirectionTransformation transformation) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.transform(shape.wrapperContained,transformation.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape transform(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.DirectionTransformation transformation, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.transform(shape.wrapperContained,transformation.wrapperContained)); }
// public yarnwrap.util.shape.VoxelShape transform(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.DirectionTransformation transformation,yarnwrap.util.math.Vec3d anchor) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.transform(shape.wrapperContained,transformation.wrapperContained,anchor.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape transform(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.DirectionTransformation transformation,yarnwrap.util.math.Vec3d anchor, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.util.shape.VoxelShapes.transform(shape.wrapperContained,transformation.wrapperContained,anchor.wrapperContained)); }
// public it.unimi.dsi.fastutil.doubles.DoubleList transform(it.unimi.dsi.fastutil.doubles.DoubleList pointPositions,boolean flip,double component,double anchor) { return wrapperContained.transform(pointPositions,flip,component,anchor); }
// public static it.unimi.dsi.fastutil.doubles.DoubleList transform(it.unimi.dsi.fastutil.doubles.DoubleList pointPositions,boolean flip,double component,double anchor, ) { return net.minecraft.util.shape.VoxelShapes.transform(pointPositions,flip,component,anchor); }
// public java.util.Map createAxisShapeMap(yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.createAxisShapeMap(shape.wrapperContained); }
// public static java.util.Map createAxisShapeMap(yarnwrap.util.shape.VoxelShape shape, ) { return net.minecraft.util.shape.VoxelShapes.createAxisShapeMap(shape.wrapperContained); }
// public java.util.Map createAxisShapeMap(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Vec3d anchor) { return wrapperContained.createAxisShapeMap(shape.wrapperContained,anchor.wrapperContained); }
// public static java.util.Map createAxisShapeMap(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Vec3d anchor, ) { return net.minecraft.util.shape.VoxelShapes.createAxisShapeMap(shape.wrapperContained,anchor.wrapperContained); }
// public java.util.Map createHorizontalFacingShapeMap(yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.createHorizontalFacingShapeMap(shape.wrapperContained); }
// public static java.util.Map createHorizontalFacingShapeMap(yarnwrap.util.shape.VoxelShape shape, ) { return net.minecraft.util.shape.VoxelShapes.createHorizontalFacingShapeMap(shape.wrapperContained); }
// public java.util.Map createHorizontalFacingShapeMap(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Vec3d anchor) { return wrapperContained.createHorizontalFacingShapeMap(shape.wrapperContained,anchor.wrapperContained); }
// public static java.util.Map createHorizontalFacingShapeMap(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Vec3d anchor, ) { return net.minecraft.util.shape.VoxelShapes.createHorizontalFacingShapeMap(shape.wrapperContained,anchor.wrapperContained); }
// public boolean equal(yarnwrap.util.shape.VoxelShape shape1,yarnwrap.util.shape.VoxelShape shape2) { return wrapperContained.equal(shape1.wrapperContained,shape2.wrapperContained); }
// public static boolean equal(yarnwrap.util.shape.VoxelShape shape1,yarnwrap.util.shape.VoxelShape shape2, ) { return net.minecraft.util.shape.VoxelShapes.equal(shape1.wrapperContained,shape2.wrapperContained); }
// public java.util.Map createFacingShapeMap(yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.createFacingShapeMap(shape.wrapperContained); }
// public static java.util.Map createFacingShapeMap(yarnwrap.util.shape.VoxelShape shape, ) { return net.minecraft.util.shape.VoxelShapes.createFacingShapeMap(shape.wrapperContained); }
// public java.util.Map createFacingShapeMap(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Vec3d anchor) { return wrapperContained.createFacingShapeMap(shape.wrapperContained,anchor.wrapperContained); }
// public static java.util.Map createFacingShapeMap(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.Vec3d anchor, ) { return net.minecraft.util.shape.VoxelShapes.createFacingShapeMap(shape.wrapperContained,anchor.wrapperContained); }
// public java.util.Map createBlockFaceHorizontalFacingShapeMap(yarnwrap.util.shape.VoxelShape shape) { return wrapperContained.createBlockFaceHorizontalFacingShapeMap(shape.wrapperContained); }
// public static java.util.Map createBlockFaceHorizontalFacingShapeMap(yarnwrap.util.shape.VoxelShape shape, ) { return net.minecraft.util.shape.VoxelShapes.createBlockFaceHorizontalFacingShapeMap(shape.wrapperContained); }

}