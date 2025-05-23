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
// public yarnwrap.block.ShapeContext of(yarnwrap.entity.Entity entity,boolean collidesWithFluid) { return new yarnwrap.block.ShapeContext(wrapperContained.of(entity.wrapperContained,collidesWithFluid)); }
// public static yarnwrap.block.ShapeContext of(yarnwrap.entity.Entity entity,boolean collidesWithFluid, ) { return new yarnwrap.block.ShapeContext(net.minecraft.block.ShapeContext.of(entity.wrapperContained,collidesWithFluid)); }
public yarnwrap.util.shape.VoxelShape getCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.shape.VoxelShape(wrapperContained.getCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.shape.VoxelShape getCollisionShape(yarnwrap.block.BlockState state,yarnwrap.world.CollisionView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.ShapeContext.getCollisionShape(state.wrapperContained,world.wrapperContained,pos.wrapperContained)); }
// public boolean method_67713(yarnwrap.entity.LivingEntity state) { return wrapperContained.method_67713(state.wrapperContained); }
// public static boolean method_67713(yarnwrap.entity.LivingEntity state, ) { return net.minecraft.block.ShapeContext.method_67713(state.wrapperContained); }
// public boolean method_67714(yarnwrap.fluid.FluidState state) { return wrapperContained.method_67714(state.wrapperContained); }
// public static boolean method_67714(yarnwrap.fluid.FluidState state, ) { return net.minecraft.block.ShapeContext.method_67714(state.wrapperContained); }
// public yarnwrap.block.ShapeContext ofPlacement(yarnwrap.entity.player.PlayerEntity player) { return new yarnwrap.block.ShapeContext(wrapperContained.ofPlacement(player.wrapperContained)); }
// public static yarnwrap.block.ShapeContext ofPlacement(yarnwrap.entity.player.PlayerEntity player, ) { return new yarnwrap.block.ShapeContext(net.minecraft.block.ShapeContext.ofPlacement(player.wrapperContained)); }
public boolean isPlacement() { return wrapperContained.isPlacement(); }
// public static boolean isPlacement() { return net.minecraft.block.ShapeContext.isPlacement(); }
// public yarnwrap.block.ShapeContext ofCollision(yarnwrap.entity.Entity entity,double y) { return new yarnwrap.block.ShapeContext(wrapperContained.ofCollision(entity.wrapperContained,y)); }
// public static yarnwrap.block.ShapeContext ofCollision(yarnwrap.entity.Entity entity,double y, ) { return new yarnwrap.block.ShapeContext(net.minecraft.block.ShapeContext.ofCollision(entity.wrapperContained,y)); }
// public boolean method_71492(yarnwrap.entity.LivingEntity state) { return wrapperContained.method_71492(state.wrapperContained); }
// public static boolean method_71492(yarnwrap.entity.LivingEntity state, ) { return net.minecraft.block.ShapeContext.method_71492(state.wrapperContained); }
// public boolean method_71493(yarnwrap.fluid.FluidState state) { return wrapperContained.method_71493(state.wrapperContained); }
// public static boolean method_71493(yarnwrap.fluid.FluidState state, ) { return net.minecraft.block.ShapeContext.method_71493(state.wrapperContained); }

}