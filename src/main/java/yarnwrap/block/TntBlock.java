package yarnwrap.block;
public class TntBlock { public net.minecraft.block.TntBlock wrapperContained; public TntBlock(net.minecraft.block.TntBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty UNSTABLE() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.UNSTABLE); }
// public void UNSTABLE(yarnwrap.state.property.BooleanProperty value) { wrapperContained.UNSTABLE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void primeTnt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.LivingEntity igniter) { wrapperContained.primeTnt(world.wrapperContained,pos.wrapperContained,igniter.wrapperContained); }
public void primeTnt(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.primeTnt(world.wrapperContained,pos.wrapperContained); }

}