package yarnwrap.world.gen.feature.size;
public class FeatureSize { public net.minecraft.world.gen.feature.size.FeatureSize wrapperContained; public FeatureSize(net.minecraft.world.gen.feature.size.FeatureSize wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.OptionalInt minClippedHeight() { return wrapperContained.minClippedHeight; }
// public void minClippedHeight(java.util.OptionalInt value) { wrapperContained.minClippedHeight = value; }
public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
// public FeatureSize(java.util.OptionalInt minClippedHeight) { this.wrapperContained = new net.minecraft.world.gen.feature.size.FeatureSize(minClippedHeight); }
public java.util.OptionalInt getMinClippedHeight() { return wrapperContained.getMinClippedHeight(); }
public int getRadius(int height,int y) { return wrapperContained.getRadius(height,y); }
// public com.mojang.serialization.codecs.RecordCodecBuilder createCodec() { return wrapperContained.createCodec(); }
// public java.util.OptionalInt method_28822(java.util.Optional minClippedHeight) { return wrapperContained.method_28822(minClippedHeight); }
// public java.util.Optional method_28823(java.util.OptionalInt minClippedHeight) { return wrapperContained.method_28823(minClippedHeight); }
// public yarnwrap.world.gen.feature.size.FeatureSizeType getType() { return new yarnwrap.world.gen.feature.size.FeatureSizeType(wrapperContained.getType()); }

}