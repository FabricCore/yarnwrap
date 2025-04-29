package yarnwrap.block;
public class Degradable { public net.minecraft.block.Degradable wrapperContained; public Degradable(net.minecraft.block.Degradable wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEGRADING_RANGE() { return wrapperContained.DEGRADING_RANGE; }
// public void DEGRADING_RANGE(int value) { wrapperContained.DEGRADING_RANGE = value; }
public static int DEGRADING_RANGE() { return net.minecraft.block.Degradable.DEGRADING_RANGE; }
// public static void DEGRADING_RANGE(int value, ) { net.minecraft.block.Degradable.DEGRADING_RANGE = value; }

public java.util.Optional getDegradationResult(yarnwrap.block.BlockState state) { return wrapperContained.getDegradationResult(state.wrapperContained); }
// public static java.util.Optional getDegradationResult(yarnwrap.block.BlockState state, ) { return net.minecraft.block.Degradable.getDegradationResult(state.wrapperContained); }
public float getDegradationChanceMultiplier() { return wrapperContained.getDegradationChanceMultiplier(); }
// public static float getDegradationChanceMultiplier() { return net.minecraft.block.Degradable.getDegradationChanceMultiplier(); }
public java.lang.Enum getDegradationLevel() { return wrapperContained.getDegradationLevel(); }
// public static java.lang.Enum getDegradationLevel() { return net.minecraft.block.Degradable.getDegradationLevel(); }
// public void method_54763(yarnwrap.server.world.ServerWorld degraded) { wrapperContained.method_54763(degraded.wrapperContained); }
// public static void method_54763(yarnwrap.server.world.ServerWorld degraded, ) { net.minecraft.block.Degradable.method_54763(degraded.wrapperContained); }
public void tickDegradation(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.tickDegradation(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static void tickDegradation(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { net.minecraft.block.Degradable.tickDegradation(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public java.util.Optional tryDegrade(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.tryDegrade(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static java.util.Optional tryDegrade(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.Degradable.tryDegrade(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}