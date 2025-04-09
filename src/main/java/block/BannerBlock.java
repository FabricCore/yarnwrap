package yarnwrap.block;
public class BannerBlock { public net.minecraft.block.BannerBlock wrapperContained; public BannerBlock(net.minecraft.block.BannerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public yarnwrap.state.property.IntProperty ROTATION() { return new yarnwrap.state.property.IntProperty(wrapperContained.ROTATION); }
// public java.util.Map COLORED_BANNERS() { return wrapperContained.COLORED_BANNERS; }
public yarnwrap.block.Block getForColor(yarnwrap.util.DyeColor color) { return new yarnwrap.block.Block(wrapperContained.getForColor(color.wrapperContained)); }

}