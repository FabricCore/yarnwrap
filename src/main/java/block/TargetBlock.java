package yarnwrap.block;
public class TargetBlock { public net.minecraft.block.TargetBlock wrapperContained; public TargetBlock(net.minecraft.block.TargetBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
// public int RECOVERABLE_POWER_DELAY() { return wrapperContained.RECOVERABLE_POWER_DELAY; }
// public int REGULAR_POWER_DELAY() { return wrapperContained.REGULAR_POWER_DELAY; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void setPower(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,int power,yarnwrap.util.math.BlockPos pos,int delay) { wrapperContained.setPower(world.wrapperContained,state.wrapperContained,power,pos.wrapperContained,delay); }
// public int trigger(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.entity.Entity entity) { return wrapperContained.trigger(world.wrapperContained,state.wrapperContained,hitResult.wrapperContained,entity.wrapperContained); }
// public int calculatePower(yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.util.math.Vec3d pos) { return wrapperContained.calculatePower(hitResult.wrapperContained,pos.wrapperContained); }

}