package yarnwrap.block;
public class FlowerPotBlock { public net.minecraft.block.FlowerPotBlock wrapperContained; public FlowerPotBlock(net.minecraft.block.FlowerPotBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block content() { return new yarnwrap.block.Block(wrapperContained.content); }
// public void content(yarnwrap.block.Block value) { wrapperContained.content = value.wrapperContained; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public java.util.Map CONTENT_TO_POTTED() { return wrapperContained.CONTENT_TO_POTTED; }
// public void CONTENT_TO_POTTED(java.util.Map value) { wrapperContained.CONTENT_TO_POTTED = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.block.Block getContent() { return new yarnwrap.block.Block(wrapperContained.getContent()); }
// public boolean isEmpty() { return wrapperContained.isEmpty(); }

}