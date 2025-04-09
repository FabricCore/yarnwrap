package yarnwrap.block;
public class Degradable { public net.minecraft.block.Degradable wrapperContained; public Degradable(net.minecraft.block.Degradable wrapperContained) { this.wrapperContained = wrapperContained; }

public int DEGRADING_RANGE() { return wrapperContained.DEGRADING_RANGE; }
public java.util.Optional getDegradationResult(yarnwrap.block.BlockState state) { return wrapperContained.getDegradationResult(state.wrapperContained); }
public float getDegradationChanceMultiplier() { return wrapperContained.getDegradationChanceMultiplier(); }
public java.lang.Enum getDegradationLevel() { return wrapperContained.getDegradationLevel(); }
public void tickDegradation(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { wrapperContained.tickDegradation(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public java.util.Optional tryDegrade(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.tryDegrade(state.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}