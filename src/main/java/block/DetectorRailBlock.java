package yarnwrap.block;
public class DetectorRailBlock { public net.minecraft.block.DetectorRailBlock wrapperContained; public DetectorRailBlock(net.minecraft.block.DetectorRailBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
public yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SHAPE); }
// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.List getCarts(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,java.lang.Class entityClass,java.util.function.Predicate entityPredicate) { return wrapperContained.getCarts(world.wrapperContained,pos.wrapperContained,entityClass,entityPredicate); }
// public void updatePoweredStatus(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.updatePoweredStatus(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public void updateNearbyRails(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,boolean unpowering) { wrapperContained.updateNearbyRails(world.wrapperContained,pos.wrapperContained,state.wrapperContained,unpowering); }
// public yarnwrap.util.math.Box getCartDetectionBox(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Box(wrapperContained.getCartDetectionBox(pos.wrapperContained)); }

}