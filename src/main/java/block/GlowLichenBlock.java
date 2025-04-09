package yarnwrap.block;
public class GlowLichenBlock { public net.minecraft.block.GlowLichenBlock wrapperContained; public GlowLichenBlock(net.minecraft.block.GlowLichenBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public yarnwrap.block.LichenGrower grower() { return new yarnwrap.block.LichenGrower(wrapperContained.grower); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public java.util.function.ToIntFunction getLuminanceSupplier(int luminance) { return wrapperContained.getLuminanceSupplier(luminance); }

}