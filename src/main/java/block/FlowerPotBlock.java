package yarnwrap.block;
public class FlowerPotBlock { public net.minecraft.block.FlowerPotBlock wrapperContained; public FlowerPotBlock(net.minecraft.block.FlowerPotBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block content() { return new yarnwrap.block.Block(wrapperContained.content); }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public java.util.Map CONTENT_TO_POTTED() { return wrapperContained.CONTENT_TO_POTTED; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.block.Block getContent() { return new yarnwrap.block.Block(wrapperContained.getContent()); }
// public boolean isEmpty() { return wrapperContained.isEmpty(); }

}