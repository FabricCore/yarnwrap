package yarnwrap.block;
public class FlowerPotBlock { public net.minecraft.block.FlowerPotBlock wrapperContained; public FlowerPotBlock(net.minecraft.block.FlowerPotBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block content() { return new yarnwrap.block.Block(wrapperContained.content); }
// public void content(yarnwrap.block.Block value) { wrapperContained.content = value.wrapperContained; }
// public static yarnwrap.block.Block content() { return new yarnwrap.block.Block(net.minecraft.block.FlowerPotBlock.content); }
// public static void content(yarnwrap.block.Block value, ) { net.minecraft.block.FlowerPotBlock.content = value.wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.FlowerPotBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.FlowerPotBlock.SHAPE = value.wrapperContained; }

// public java.util.Map CONTENT_TO_POTTED() { return wrapperContained.CONTENT_TO_POTTED; }
// public void CONTENT_TO_POTTED(java.util.Map value) { wrapperContained.CONTENT_TO_POTTED = value; }
// public static java.util.Map CONTENT_TO_POTTED() { return net.minecraft.block.FlowerPotBlock.CONTENT_TO_POTTED; }
// public static void CONTENT_TO_POTTED(java.util.Map value, ) { net.minecraft.block.FlowerPotBlock.CONTENT_TO_POTTED = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.FlowerPotBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.FlowerPotBlock.CODEC = value; }

// public FlowerPotBlock(yarnwrap.block.Block content,Object settings) { this.wrapperContained = new net.minecraft.block.FlowerPotBlock(content.wrapperContained,settings); }
public yarnwrap.block.Block getContent() { return new yarnwrap.block.Block(wrapperContained.getContent()); }
// public static yarnwrap.block.Block getContent() { return new yarnwrap.block.Block(net.minecraft.block.FlowerPotBlock.getContent()); }
// public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.block.FlowerPotBlock.isEmpty(); }
// public com.mojang.datafixers.kinds.App method_54017(Object instance) { return wrapperContained.method_54017(instance); }
// public static com.mojang.datafixers.kinds.App method_54017(Object instance, ) { return net.minecraft.block.FlowerPotBlock.method_54017(instance); }
// public yarnwrap.block.Block method_54018(yarnwrap.block.FlowerPotBlock block) { return new yarnwrap.block.Block(wrapperContained.method_54018(block.wrapperContained)); }
// public static yarnwrap.block.Block method_54018(yarnwrap.block.FlowerPotBlock block, ) { return new yarnwrap.block.Block(net.minecraft.block.FlowerPotBlock.method_54018(block.wrapperContained)); }
public yarnwrap.block.BlockState getToggledState(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.getToggledState(state.wrapperContained)); }
// public static yarnwrap.block.BlockState getToggledState(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.block.FlowerPotBlock.getToggledState(state.wrapperContained)); }

}