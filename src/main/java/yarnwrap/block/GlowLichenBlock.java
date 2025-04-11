package yarnwrap.block;
public class GlowLichenBlock { public net.minecraft.block.GlowLichenBlock wrapperContained; public GlowLichenBlock(net.minecraft.block.GlowLichenBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public yarnwrap.block.LichenGrower grower() { return new yarnwrap.block.LichenGrower(wrapperContained.grower); }
// public void grower(yarnwrap.block.LichenGrower value) { wrapperContained.grower = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public java.util.function.ToIntFunction getLuminanceSupplier(int luminance) { return wrapperContained.getLuminanceSupplier(luminance); }

}