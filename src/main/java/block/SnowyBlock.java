package yarnwrap.block;
public class SnowyBlock { public net.minecraft.block.SnowyBlock wrapperContained; public SnowyBlock(net.minecraft.block.SnowyBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty SNOWY() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SNOWY); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public boolean isSnow(yarnwrap.block.BlockState state) { return wrapperContained.isSnow(state.wrapperContained); }

}