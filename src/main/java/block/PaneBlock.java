package yarnwrap.block;
public class PaneBlock { public net.minecraft.block.PaneBlock wrapperContained; public PaneBlock(net.minecraft.block.PaneBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean connectsTo(yarnwrap.block.BlockState state,boolean sideSolidFullSquare) { return wrapperContained.connectsTo(state.wrapperContained,sideSolidFullSquare); }

}