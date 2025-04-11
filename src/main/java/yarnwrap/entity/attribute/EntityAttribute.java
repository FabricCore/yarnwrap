package yarnwrap.entity.attribute;
public class EntityAttribute { public net.minecraft.entity.attribute.EntityAttribute wrapperContained; public EntityAttribute(net.minecraft.entity.attribute.EntityAttribute wrapperContained) { this.wrapperContained = wrapperContained; }

// public double fallback() { return wrapperContained.fallback; }
// public void fallback(double value) { wrapperContained.fallback = value; }
// public boolean tracked() { return wrapperContained.tracked; }
// public void tracked(boolean value) { wrapperContained.tracked = value; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public Object category() { return wrapperContained.category; }
// // public void category(Object value) { wrapperContained.category = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.entity.attribute.EntityAttribute setTracked(boolean tracked) { return new yarnwrap.entity.attribute.EntityAttribute(wrapperContained.setTracked(tracked)); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public yarnwrap.entity.attribute.EntityAttribute setCategory(Object category) { return new yarnwrap.entity.attribute.EntityAttribute(wrapperContained.setCategory(category)); }
public yarnwrap.util.Formatting getFormatting(boolean addition) { return new yarnwrap.util.Formatting(wrapperContained.getFormatting(addition)); }
public double clamp(double value) { return wrapperContained.clamp(value); }
public boolean isTracked() { return wrapperContained.isTracked(); }
public double getDefaultValue() { return wrapperContained.getDefaultValue(); }

}