package yarnwrap.block;
public class PaneBlock { public net.minecraft.block.PaneBlock wrapperContained; public PaneBlock(net.minecraft.block.PaneBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.PaneBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.PaneBlock.CODEC = value; }

public boolean connectsTo(yarnwrap.block.BlockState state,boolean sideSolidFullSquare) { return wrapperContained.connectsTo(state.wrapperContained,sideSolidFullSquare); }
// public static boolean connectsTo(yarnwrap.block.BlockState state,boolean sideSolidFullSquare, ) { return net.minecraft.block.PaneBlock.connectsTo(state.wrapperContained,sideSolidFullSquare); }

}