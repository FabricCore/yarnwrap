package yarnwrap.block;
public class GlowLichenBlock { public net.minecraft.block.GlowLichenBlock wrapperContained; public GlowLichenBlock(net.minecraft.block.GlowLichenBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.GlowLichenBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.GlowLichenBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.block.LichenGrower grower() { return new yarnwrap.block.LichenGrower(wrapperContained.grower); }
// public void grower(yarnwrap.block.LichenGrower value) { wrapperContained.grower = value.wrapperContained; }
// public static yarnwrap.block.LichenGrower grower() { return new yarnwrap.block.LichenGrower(net.minecraft.block.GlowLichenBlock.grower); }
// public static void grower(yarnwrap.block.LichenGrower value, ) { net.minecraft.block.GlowLichenBlock.grower = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.GlowLichenBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.GlowLichenBlock.CODEC = value; }

// public boolean method_34727(yarnwrap.block.BlockState direction) { return wrapperContained.method_34727(direction.wrapperContained); }
// public static boolean method_34727(yarnwrap.block.BlockState direction, ) { return net.minecraft.block.GlowLichenBlock.method_34727(direction.wrapperContained); }
// public int method_37363(int state) { return wrapperContained.method_37363(state); }
// public static int method_37363(int state, ) { return net.minecraft.block.GlowLichenBlock.method_37363(state); }
// public java.util.function.ToIntFunction getLuminanceSupplier(int luminance) { return wrapperContained.getLuminanceSupplier(luminance); }
// public static java.util.function.ToIntFunction getLuminanceSupplier(int luminance, ) { return net.minecraft.block.GlowLichenBlock.getLuminanceSupplier(luminance); }

}