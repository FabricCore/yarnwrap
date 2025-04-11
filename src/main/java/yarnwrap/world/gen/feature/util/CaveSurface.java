package yarnwrap.world.gen.feature.util;
public class CaveSurface { public net.minecraft.world.gen.feature.util.CaveSurface wrapperContained; public CaveSurface(net.minecraft.world.gen.feature.util.CaveSurface wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.feature.util.CaveSurface createEmpty() { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.createEmpty()); }
public yarnwrap.world.gen.feature.util.CaveSurface createHalfWithCeiling(int ceiling) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.createHalfWithCeiling(ceiling)); }
public java.util.Optional create(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos,int height,java.util.function.Predicate canGenerate,java.util.function.Predicate canReplace) { return wrapperContained.create(world.wrapperContained,pos.wrapperContained,height,canGenerate,canReplace); }
public yarnwrap.world.gen.feature.util.CaveSurface withFloor(java.util.OptionalInt floor) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.withFloor(floor)); }
public yarnwrap.world.gen.feature.util.CaveSurface create(java.util.OptionalInt ceilingHeight,java.util.OptionalInt floorHeight) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.create(ceilingHeight,floorHeight)); }
public java.util.OptionalInt getCeilingHeight() { return wrapperContained.getCeilingHeight(); }
public Object createBounded(int floor,int ceiling) { return wrapperContained.createBounded(floor,ceiling); }
public java.util.OptionalInt getFloorHeight() { return wrapperContained.getFloorHeight(); }
public yarnwrap.world.gen.feature.util.CaveSurface createHalfWithFloor(int floor) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.createHalfWithFloor(floor)); }
public java.util.OptionalInt getOptionalHeight() { return wrapperContained.getOptionalHeight(); }
// public java.util.OptionalInt getCaveSurface(yarnwrap.world.TestableWorld world,int height,java.util.function.Predicate canGenerate,java.util.function.Predicate canReplace,Object mutablePos,int y,yarnwrap.util.math.Direction direction) { return wrapperContained.getCaveSurface(world.wrapperContained,height,canGenerate,canReplace,mutablePos,y,direction.wrapperContained); }
public yarnwrap.world.gen.feature.util.CaveSurface withCeiling(java.util.OptionalInt ceiling) { return new yarnwrap.world.gen.feature.util.CaveSurface(wrapperContained.withCeiling(ceiling)); }

}