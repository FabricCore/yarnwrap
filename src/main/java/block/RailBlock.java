package yarnwrap.block;
public class RailBlock { public net.minecraft.block.RailBlock wrapperContained; public RailBlock(net.minecraft.block.RailBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.EnumProperty SHAPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}