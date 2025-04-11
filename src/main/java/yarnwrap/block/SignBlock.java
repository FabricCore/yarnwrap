package yarnwrap.block;
public class SignBlock { public net.minecraft.block.SignBlock wrapperContained; public SignBlock(net.minecraft.block.SignBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(wrapperContained.ROTATION); }
// public void ROTATION(yarnwrap.state.property.IntProperty value) { wrapperContained.ROTATION = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}