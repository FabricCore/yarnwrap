package yarnwrap.block;
public class PressurePlateBlock { public net.minecraft.block.PressurePlateBlock wrapperContained; public PressurePlateBlock(net.minecraft.block.PressurePlateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}