package yarnwrap.world.gen.feature.size;
public class FeatureSize { public net.minecraft.world.gen.feature.size.FeatureSize wrapperContained; public FeatureSize(net.minecraft.world.gen.feature.size.FeatureSize wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.OptionalInt minClippedHeight() { return wrapperContained.minClippedHeight; }
public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
public java.util.OptionalInt getMinClippedHeight() { return wrapperContained.getMinClippedHeight(); }
public int getRadius(int height,int y) { return wrapperContained.getRadius(height,y); }
// public com.mojang.serialization.codecs.RecordCodecBuilder createCodec() { return wrapperContained.createCodec(); }
// public yarnwrap.world.gen.feature.size.FeatureSizeType getType() { return new yarnwrap.world.gen.feature.size.FeatureSizeType(wrapperContained.getType()); }

}