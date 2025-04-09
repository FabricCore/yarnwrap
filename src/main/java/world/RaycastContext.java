package yarnwrap.world;
public class RaycastContext { public net.minecraft.world.RaycastContext wrapperContained; public RaycastContext(net.minecraft.world.RaycastContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d start() { return new yarnwrap.util.math.Vec3d(wrapperContained.start); }
// public yarnwrap.util.math.Vec3d end() { return new yarnwrap.util.math.Vec3d(wrapperContained.end); }
// public Object shapeType() { return wrapperContained.shapeType; }
// public Object fluid() { return wrapperContained.fluid; }
// public yarnwrap.block.ShapeContext shapeContext() { return new yarnwrap.block.ShapeContext(wrapperContained.shapeContext); }
public yarnwrap.util.math.Vec3d getEnd() { return new yarnwrap.util.math.Vec3d(wrapperContained.getEnd()); }
public yarnwrap.util.shape.VoxelShape getBlockShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getBlockShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public yarnwrap.util.shape.VoxelShape getFluidShape(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getFluidShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public yarnwrap.util.math.Vec3d getStart() { return new yarnwrap.util.math.Vec3d(wrapperContained.getStart()); }

}