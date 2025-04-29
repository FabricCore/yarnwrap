package yarnwrap.block;
public class ShapeContext { public net.minecraft.block.ShapeContext wrapperContained; public ShapeContext(net.minecraft.block.ShapeContext wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isAbove(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.BlockPos pos,boolean defaultValue) { return wrapperContained.isAbove(shape.wrapperContained,pos.wrapperContained,defaultValue); }
// public static boolean isAbove(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.BlockPos pos,boolean defaultValue, ) { return net.minecraft.block.ShapeContext.isAbove(shape.wrapperContained,pos.wrapperContained,defaultValue); }
public boolean isDescending() { return wrapperContained.isDescending(); }
// public static boolean isDescending() { return net.minecraft.block.ShapeContext.isDescending(); }
// public yarnwrap.block.ShapeContext absent() { return new yarnwrap.block.ShapeContext(wrapperContained.absent()); }
public static yarnwrap.block.ShapeContext absent() { return new yarnwrap.block.ShapeContext(net.minecraft.block.ShapeContext.absent()); }
// public yarnwrap.block.ShapeContext of(yarnwrap.entity.Entity entity) { return new yarnwrap.block.ShapeContext(wrapperContained.of(entity.wrapperContained)); }
// public static yarnwrap.block.ShapeContext of(yarnwrap.entity.Entity entity, ) { return new yarnwrap.block.ShapeContext(net.minecraft.block.ShapeContext.of(entity.wrapperContained)); }
public boolean isHolding(yarnwrap.item.Item item) { return wrapperContained.isHolding(item.wrapperContained); }
// public static boolean isHolding(yarnwrap.item.Item item, ) { return net.minecraft.block.ShapeContext.isHolding(item.wrapperContained); }
public boolean canWalkOnFluid(yarnwrap.fluid.FluidState stateAbove,yarnwrap.fluid.FluidState state) { return wrapperContained.canWalkOnFluid(stateAbove.wrapperContained,state.wrapperContained); }
// public static boolean canWalkOnFluid(yarnwrap.fluid.FluidState stateAbove,yarnwrap.fluid.FluidState state, ) { return net.minecraft.block.ShapeContext.canWalkOnFluid(stateAbove.wrapperContained,state.wrapperContained); }

}