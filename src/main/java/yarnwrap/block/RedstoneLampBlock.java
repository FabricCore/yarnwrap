package yarnwrap.block;
public class RedstoneLampBlock { public net.minecraft.block.RedstoneLampBlock wrapperContained; public RedstoneLampBlock(net.minecraft.block.RedstoneLampBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}