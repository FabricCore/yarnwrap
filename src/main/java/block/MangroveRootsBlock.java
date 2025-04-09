package yarnwrap.block;
public class MangroveRootsBlock { public net.minecraft.block.MangroveRootsBlock wrapperContained; public MangroveRootsBlock(net.minecraft.block.MangroveRootsBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}