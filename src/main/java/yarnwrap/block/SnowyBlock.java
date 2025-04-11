package yarnwrap.block;
public class SnowyBlock { public net.minecraft.block.SnowyBlock wrapperContained; public SnowyBlock(net.minecraft.block.SnowyBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty SNOWY() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SNOWY); }
// public void SNOWY(yarnwrap.state.property.BooleanProperty value) { wrapperContained.SNOWY = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean isSnow(yarnwrap.block.BlockState state) { return wrapperContained.isSnow(state.wrapperContained); }

}