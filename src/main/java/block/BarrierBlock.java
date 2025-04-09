package yarnwrap.block;
public class BarrierBlock { public net.minecraft.block.BarrierBlock wrapperContained; public BarrierBlock(net.minecraft.block.BarrierBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}