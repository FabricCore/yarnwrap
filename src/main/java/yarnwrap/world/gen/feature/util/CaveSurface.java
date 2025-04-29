package yarnwrap.world.gen.feature.util;
public class CaveSurface { public net.minecraft.world.gen.feature.util.CaveSurface wrapperContained; public CaveSurface(net.minecraft.world.gen.feature.util.CaveSurface wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.feature.util.CaveSurface createEmpty() { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.createEmpty()); }
public static yarnwrap.world.gen.feature.util.CaveSurface createEmpty() { return new yarnwrap.world.gen.feature.util.CaveSurface(net.minecraft.world.gen.feature.util.CaveSurface.createEmpty()); }
// public yarnwrap.world.gen.feature.util.CaveSurface createHalfWithCeiling(int ceiling) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.createHalfWithCeiling(ceiling)); }
// public static yarnwrap.world.gen.feature.util.CaveSurface createHalfWithCeiling(int ceiling, ) { return new yarnwrap.world.gen.feature.util.CaveSurface(net.minecraft.world.gen.feature.util.CaveSurface.createHalfWithCeiling(ceiling)); }
// public java.util.Optional create(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos,int height,java.util.function.Predicate canGenerate,java.util.function.Predicate canReplace) { return wrapperContained.create(world.wrapperContained,pos.wrapperContained,height,canGenerate,canReplace); }
// public static java.util.Optional create(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos,int height,java.util.function.Predicate canGenerate,java.util.function.Predicate canReplace, ) { return net.minecraft.world.gen.feature.util.CaveSurface.create(world.wrapperContained,pos.wrapperContained,height,canGenerate,canReplace); }
public yarnwrap.world.gen.feature.util.CaveSurface withFloor(java.util.OptionalInt floor) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.withFloor(floor)); }
// public static yarnwrap.world.gen.feature.util.CaveSurface withFloor(java.util.OptionalInt floor, ) { return new yarnwrap.world.gen.feature.util.CaveSurface(net.minecraft.world.gen.feature.util.CaveSurface.withFloor(floor)); }
// public yarnwrap.world.gen.feature.util.CaveSurface create(java.util.OptionalInt ceilingHeight,java.util.OptionalInt floorHeight) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.create(ceilingHeight,floorHeight)); }
// public static yarnwrap.world.gen.feature.util.CaveSurface create(java.util.OptionalInt ceilingHeight,java.util.OptionalInt floorHeight, ) { return new yarnwrap.world.gen.feature.util.CaveSurface(net.minecraft.world.gen.feature.util.CaveSurface.create(ceilingHeight,floorHeight)); }
public java.util.OptionalInt getCeilingHeight() { return wrapperContained.getCeilingHeight(); }
// public static java.util.OptionalInt getCeilingHeight() { return net.minecraft.world.gen.feature.util.CaveSurface.getCeilingHeight(); }
// public Object createBounded(int floor,int ceiling) { return wrapperContained.createBounded(floor,ceiling); }
// public static Object createBounded(int floor,int ceiling, ) { return net.minecraft.world.gen.feature.util.CaveSurface.createBounded(floor,ceiling); }
public java.util.OptionalInt getFloorHeight() { return wrapperContained.getFloorHeight(); }
// public static java.util.OptionalInt getFloorHeight() { return net.minecraft.world.gen.feature.util.CaveSurface.getFloorHeight(); }
// public yarnwrap.world.gen.feature.util.CaveSurface createHalfWithFloor(int floor) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.createHalfWithFloor(floor)); }
// public static yarnwrap.world.gen.feature.util.CaveSurface createHalfWithFloor(int floor, ) { return new yarnwrap.world.gen.feature.util.CaveSurface(net.minecraft.world.gen.feature.util.CaveSurface.createHalfWithFloor(floor)); }
public java.util.OptionalInt getOptionalHeight() { return wrapperContained.getOptionalHeight(); }
// public static java.util.OptionalInt getOptionalHeight() { return net.minecraft.world.gen.feature.util.CaveSurface.getOptionalHeight(); }
// public java.util.OptionalInt getCaveSurface(yarnwrap.world.TestableWorld world,int height,java.util.function.Predicate canGenerate,java.util.function.Predicate canReplace,Object mutablePos,int y,yarnwrap.util.math.Direction direction) { return wrapperContained.getCaveSurface(world.wrapperContained,height,canGenerate,canReplace,mutablePos,y,direction.wrapperContained); }
// public static java.util.OptionalInt getCaveSurface(yarnwrap.world.TestableWorld world,int height,java.util.function.Predicate canGenerate,java.util.function.Predicate canReplace,Object mutablePos,int y,yarnwrap.util.math.Direction direction, ) { return net.minecraft.world.gen.feature.util.CaveSurface.getCaveSurface(world.wrapperContained,height,canGenerate,canReplace,mutablePos,y,direction.wrapperContained); }
public yarnwrap.world.gen.feature.util.CaveSurface withCeiling(java.util.OptionalInt ceiling) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.withCeiling(ceiling)); }
// public static yarnwrap.world.gen.feature.util.CaveSurface withCeiling(java.util.OptionalInt ceiling, ) { return new yarnwrap.world.gen.feature.util.CaveSurface(net.minecraft.world.gen.feature.util.CaveSurface.withCeiling(ceiling)); }

}