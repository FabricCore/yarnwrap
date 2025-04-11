package yarnwrap.block;
public class ShapeContext { public net.minecraft.block.ShapeContext wrapperContained; public ShapeContext(net.minecraft.block.ShapeContext wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isAbove(yarnwrap.util.shape.VoxelShape shape,yarnwrap.util.math.BlockPos pos,boolean defaultValue) { return wrapperContained.isAbove(shape.wrapperContained,pos.wrapperContained,defaultValue); }
public boolean isDescending() { return wrapperContained.isDescending(); }
// public yarnwrap.block.ShapeContext absent() { return new yarnwrap.block.ShapeContext(wrapperContained.absent()); }
// public yarnwrap.block.ShapeContext of(yarnwrap.entity.Entity entity) { return new yarnwrap.block.ShapeContext(wrapperContained.of(entity.wrapperContained)); }
public boolean isHolding(yarnwrap.item.Item item) { return wrapperContained.isHolding(item.wrapperContained); }
public boolean canWalkOnFluid(yarnwrap.fluid.FluidState stateAbove,yarnwrap.fluid.FluidState state) { return wrapperContained.canWalkOnFluid(stateAbove.wrapperContained,state.wrapperContained); }

}