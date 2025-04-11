package yarnwrap.block;
public class RedstoneOreBlock { public net.minecraft.block.RedstoneOreBlock wrapperContained; public RedstoneOreBlock(net.minecraft.block.RedstoneOreBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void spawnParticles(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.spawnParticles(world.wrapperContained,pos.wrapperContained); }
// public void light(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.light(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}