package yarnwrap.world;
public class BlockView { public net.minecraft.world.BlockView wrapperContained; public BlockView(net.minecraft.world.BlockView wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.hit.BlockHitResult raycast(yarnwrap.world.RaycastContext context) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.raycast(context.wrapperContained)); }
// public yarnwrap.util.hit.BlockHitResult method_17743(yarnwrap.world.RaycastContext innerContext,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.method_17743(innerContext.wrapperContained,pos.wrapperContained)); }
// public java.lang.Object raycast(yarnwrap.util.math.Vec3d start,yarnwrap.util.math.Vec3d end,java.lang.Object context,java.util.function.BiFunction blockHitFactory,java.util.function.Function missFactory) { return wrapperContained.raycast(start.wrapperContained,end.wrapperContained,context,blockHitFactory,missFactory); }
public yarnwrap.util.hit.BlockHitResult raycastBlock(yarnwrap.util.math.Vec3d start,yarnwrap.util.math.Vec3d end,yarnwrap.util.math.BlockPos pos,yarnwrap.util.shape.VoxelShape shape,yarnwrap.block.BlockState state) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.raycastBlock(start.wrapperContained,end.wrapperContained,pos.wrapperContained,shape.wrapperContained,state.wrapperContained)); }
// public yarnwrap.util.hit.BlockHitResult method_17746(yarnwrap.world.RaycastContext innerContext) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.method_17746(innerContext.wrapperContained)); }
public java.util.stream.Stream getStatesInBox(yarnwrap.util.math.Box box) { return wrapperContained.getStatesInBox(box.wrapperContained); }
public double getDismountHeight(yarnwrap.util.shape.VoxelShape blockCollisionShape,java.util.function.Supplier belowBlockCollisionShapeGetter) { return wrapperContained.getDismountHeight(blockCollisionShape.wrapperContained,belowBlockCollisionShapeGetter); }
public double getDismountHeight(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getDismountHeight(pos.wrapperContained); }
public yarnwrap.util.hit.BlockHitResult raycast(yarnwrap.world.BlockStateRaycastContext context) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.raycast(context.wrapperContained)); }
// public yarnwrap.util.hit.BlockHitResult method_32881(yarnwrap.world.BlockStateRaycastContext innerContext,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.method_32881(innerContext.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.util.hit.BlockHitResult method_32882(yarnwrap.world.BlockStateRaycastContext innerContext) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.method_32882(innerContext.wrapperContained)); }
public java.util.Optional getBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.BlockEntityType type) { return wrapperContained.getBlockEntity(pos.wrapperContained,type.wrapperContained); }
public int getMaxLightLevel() { return wrapperContained.getMaxLightLevel(); }
public yarnwrap.fluid.FluidState getFluidState(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.fluid.FluidState(wrapperContained.getFluidState(pos.wrapperContained)); }
public int getLuminance(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getLuminance(pos.wrapperContained); }
public yarnwrap.block.BlockState getBlockState(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(pos.wrapperContained)); }
public yarnwrap.block.entity.BlockEntity getBlockEntity(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.getBlockEntity(pos.wrapperContained)); }

}