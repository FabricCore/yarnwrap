package yarnwrap.block;
public class GlowLichenBlock { public net.minecraft.block.GlowLichenBlock wrapperContained; public GlowLichenBlock(net.minecraft.block.GlowLichenBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.MultifaceGrower grower() { return new yarnwrap.block.MultifaceGrower(wrapperContained.grower); }
// public void grower(yarnwrap.block.MultifaceGrower value) { wrapperContained.grower = value.wrapperContained; }
// public static yarnwrap.block.MultifaceGrower grower() { return new yarnwrap.block.MultifaceGrower(net.minecraft.block.GlowLichenBlock.grower); }
// public static void grower(yarnwrap.block.MultifaceGrower value, ) { net.minecraft.block.GlowLichenBlock.grower = value.wrapperContained; }

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