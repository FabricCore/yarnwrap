package yarnwrap.block;
public class GrateBlock { public net.minecraft.block.GrateBlock wrapperContained; public GrateBlock(net.minecraft.block.GrateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }

}