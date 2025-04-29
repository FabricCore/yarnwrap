package yarnwrap.block;
public class WallBannerBlock { public net.minecraft.block.WallBannerBlock wrapperContained; public WallBannerBlock(net.minecraft.block.WallBannerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.WallBannerBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.WallBannerBlock.FACING = value.wrapperContained; }

// public java.util.Map FACING_TO_SHAPE() { return wrapperContained.FACING_TO_SHAPE; }
// public void FACING_TO_SHAPE(java.util.Map value) { wrapperContained.FACING_TO_SHAPE = value; }
// public static java.util.Map FACING_TO_SHAPE() { return net.minecraft.block.WallBannerBlock.FACING_TO_SHAPE; }
// public static void FACING_TO_SHAPE(java.util.Map value, ) { net.minecraft.block.WallBannerBlock.FACING_TO_SHAPE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.WallBannerBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.WallBannerBlock.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_54062(Object instance) { return wrapperContained.method_54062(instance); }
// public static com.mojang.datafixers.kinds.App method_54062(Object instance, ) { return net.minecraft.block.WallBannerBlock.method_54062(instance); }

}