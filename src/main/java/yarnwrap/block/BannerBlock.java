package yarnwrap.block;
public class BannerBlock { public net.minecraft.block.BannerBlock wrapperContained; public BannerBlock(net.minecraft.block.BannerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BannerBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BannerBlock.CODEC = value; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public static yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(net.minecraft.block.BannerBlock.SHAPE); }
// public static void SHAPE(yarnwrap.util.shape.VoxelShape value, ) { net.minecraft.block.BannerBlock.SHAPE = value.wrapperContained; }

// public yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(wrapperContained.ROTATION); }
// public void ROTATION(yarnwrap.state.property.IntProperty value) { wrapperContained.ROTATION = value.wrapperContained; }
public static yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(net.minecraft.block.BannerBlock.ROTATION); }
// public static void ROTATION(yarnwrap.state.property.IntProperty value, ) { net.minecraft.block.BannerBlock.ROTATION = value.wrapperContained; }

// public java.util.Map COLORED_BANNERS() { return wrapperContained.COLORED_BANNERS; }
// public void COLORED_BANNERS(java.util.Map value) { wrapperContained.COLORED_BANNERS = value; }
// public static java.util.Map COLORED_BANNERS() { return net.minecraft.block.BannerBlock.COLORED_BANNERS; }
// public static void COLORED_BANNERS(java.util.Map value, ) { net.minecraft.block.BannerBlock.COLORED_BANNERS = value; }

// public com.mojang.datafixers.kinds.App method_53977(Object instance) { return wrapperContained.method_53977(instance); }
// public static com.mojang.datafixers.kinds.App method_53977(Object instance, ) { return net.minecraft.block.BannerBlock.method_53977(instance); }
// public yarnwrap.block.Block getForColor(yarnwrap.util.DyeColor color) { return new yarnwrap.block.Block(wrapperContained.getForColor(color.wrapperContained)); }
// public static yarnwrap.block.Block getForColor(yarnwrap.util.DyeColor color, ) { return new yarnwrap.block.Block(net.minecraft.block.BannerBlock.getForColor(color.wrapperContained)); }

}