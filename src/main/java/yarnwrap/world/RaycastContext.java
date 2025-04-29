package yarnwrap.world;
public class RaycastContext { public net.minecraft.world.RaycastContext wrapperContained; public RaycastContext(net.minecraft.world.RaycastContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Vec3d start() { return new yarnwrap.util.math.Vec3d(wrapperContained.start); }
// public void start(yarnwrap.util.math.Vec3d value) { wrapperContained.start = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d start() { return new yarnwrap.util.math.Vec3d(net.minecraft.world.RaycastContext.start); }
// public static void start(yarnwrap.util.math.Vec3d value, ) { net.minecraft.world.RaycastContext.start = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d end() { return new yarnwrap.util.math.Vec3d(wrapperContained.end); }
// public void end(yarnwrap.util.math.Vec3d value) { wrapperContained.end = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d end() { return new yarnwrap.util.math.Vec3d(net.minecraft.world.RaycastContext.end); }
// public static void end(yarnwrap.util.math.Vec3d value, ) { net.minecraft.world.RaycastContext.end = value.wrapperContained; }

// public Object shapeType() { return wrapperContained.shapeType; }
// // public void shapeType(Object value) { wrapperContained.shapeType = value; }
// // public static Object shapeType() { return net.minecraft.world.RaycastContext.shapeType; }
// // public static void shapeType(Object value, ) { net.minecraft.world.RaycastContext.shapeType = value; }

// public Object fluid() { return wrapperContained.fluid; }
// // public void fluid(Object value) { wrapperContained.fluid = value; }
// // public static Object fluid() { return net.minecraft.world.RaycastContext.fluid; }
// // public static void fluid(Object value, ) { net.minecraft.world.RaycastContext.fluid = value; }

// public yarnwrap.block.ShapeContext shapeContext() { return new yarnwrap.block.ShapeContext(wrapperContained.shapeContext); }
// public void shapeContext(yarnwrap.block.ShapeContext value) { wrapperContained.shapeContext = value.wrapperContained; }
// public static yarnwrap.block.ShapeContext shapeContext() { return new yarnwrap.block.ShapeContext(net.minecraft.world.RaycastContext.shapeContext); }
// public static void shapeContext(yarnwrap.block.ShapeContext value, ) { net.minecraft.world.RaycastContext.shapeContext = value.wrapperContained; }

// public RaycastContext(yarnwrap.util.math.Vec3d start,yarnwrap.util.math.Vec3d end,Object shapeType,Object fluidHandling,yarnwrap.entity.Entity entity) { this.wrapperContained = new net.minecraft.world.RaycastContext(start.wrapperContained,end.wrapperContained,shapeType,fluidHandling,entity.wrapperContained); }
// public RaycastContext(yarnwrap.util.math.Vec3d start,yarnwrap.util.math.Vec3d end,Object shapeType,Object fluidHandling,yarnwrap.block.ShapeContext shapeContext) { this.wrapperContained = new net.minecraft.world.RaycastContext(start.wrapperContained,end.wrapperContained,shapeType,fluidHandling,shapeContext.wrapperContained); }
public yarnwrap.util.math.Vec3d getEnd() { return new yarnwrap.util.math.Vec3d(wrapperContained.getEnd()); }
// public static yarnwrap.util.math.Vec3d getEnd() { return new yarnwrap.util.math.Vec3d(net.minecraft.world.RaycastContext.getEnd()); }
public yarnwrap.util.shape.VoxelShape getBlockShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getBlockShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getBlockShape(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.world.RaycastContext.getBlockShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public yarnwrap.util.shape.VoxelShape getFluidShape(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getFluidShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getFluidShape(yarnwrap.fluid.FluidState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.world.RaycastContext.getFluidShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
public yarnwrap.util.math.Vec3d getStart() { return new yarnwrap.util.math.Vec3d(wrapperContained.getStart()); }
// public static yarnwrap.util.math.Vec3d getStart() { return new yarnwrap.util.math.Vec3d(net.minecraft.world.RaycastContext.getStart()); }

}