package yarnwrap.block;
public class TargetBlock { public net.minecraft.block.TargetBlock wrapperContained; public TargetBlock(net.minecraft.block.TargetBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(wrapperContained.POWER); }
// public void POWER(yarnwrap.state.property.IntProperty value) { wrapperContained.POWER = value.wrapperContained; }
// public static yarnwrap.state.property.IntProperty POWER() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.TargetBlock.POWER); }
// public static void POWER(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.TargetBlock.POWER = value.wrapperContained; }

// public int RECOVERABLE_POWER_DELAY() { return wrapperContained.RECOVERABLE_POWER_DELAY; }
// public void RECOVERABLE_POWER_DELAY(int value) { wrapperContained.RECOVERABLE_POWER_DELAY = value; }
// public static int RECOVERABLE_POWER_DELAY() { return net.minecraft.block.TargetBlock.RECOVERABLE_POWER_DELAY; }
// public static void RECOVERABLE_POWER_DELAY(int value, ) { net.minecraft.block.TargetBlock.RECOVERABLE_POWER_DELAY = value; }

// public int REGULAR_POWER_DELAY() { return wrapperContained.REGULAR_POWER_DELAY; }
// public void REGULAR_POWER_DELAY(int value) { wrapperContained.REGULAR_POWER_DELAY = value; }
// public static int REGULAR_POWER_DELAY() { return net.minecraft.block.TargetBlock.REGULAR_POWER_DELAY; }
// public static void REGULAR_POWER_DELAY(int value, ) { net.minecraft.block.TargetBlock.REGULAR_POWER_DELAY = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TargetBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TargetBlock.CODEC = value; }

// public void setPower(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,int power,yarnwrap.util.math.BlockPos pos,int delay) { wrapperContained.setPower(world.wrapperContained,state.wrapperContained,power,pos.wrapperContained,delay); }
// public static void setPower(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,int power,yarnwrap.util.math.BlockPos pos,int delay, ) { net.minecraft.block.TargetBlock.setPower(world.wrapperContained,state.wrapperContained,power,pos.wrapperContained,delay); }
// public int trigger(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.entity.Entity entity) { return wrapperContained.trigger(world.wrapperContained,state.wrapperContained,hitResult.wrapperContained,entity.wrapperContained); }
// public static int trigger(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.entity.Entity entity, ) { return net.minecraft.block.TargetBlock.trigger(world.wrapperContained,state.wrapperContained,hitResult.wrapperContained,entity.wrapperContained); }
// public int calculatePower(yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.util.math.Vec3d pos) { return wrapperContained.calculatePower(hitResult.wrapperContained,pos.wrapperContained); }
// public static int calculatePower(yarnwrap.util.hit.BlockHitResult hitResult,yarnwrap.util.math.Vec3d pos, ) { return net.minecraft.block.TargetBlock.calculatePower(hitResult.wrapperContained,pos.wrapperContained); }

}