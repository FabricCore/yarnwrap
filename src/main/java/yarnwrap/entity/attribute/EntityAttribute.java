package yarnwrap.entity.attribute;
public class EntityAttribute { public net.minecraft.entity.attribute.EntityAttribute wrapperContained; public EntityAttribute(net.minecraft.entity.attribute.EntityAttribute wrapperContained) { this.wrapperContained = wrapperContained; }

// public double fallback() { return wrapperContained.fallback; }
// public void fallback(double value) { wrapperContained.fallback = value; }
// public static double fallback() { return net.minecraft.entity.attribute.EntityAttribute.fallback; }
// public static void fallback(double value, ) { net.minecraft.entity.attribute.EntityAttribute.fallback = value; }

// public boolean tracked() { return wrapperContained.tracked; }
// public void tracked(boolean value) { wrapperContained.tracked = value; }
// public static boolean tracked() { return net.minecraft.entity.attribute.EntityAttribute.tracked; }
// public static void tracked(boolean value, ) { net.minecraft.entity.attribute.EntityAttribute.tracked = value; }

// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public static java.lang.String translationKey() { return net.minecraft.entity.attribute.EntityAttribute.translationKey; }
// public static void translationKey(java.lang.String value, ) { net.minecraft.entity.attribute.EntityAttribute.translationKey = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.attribute.EntityAttribute.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.attribute.EntityAttribute.CODEC = value; }

// public Object category() { return wrapperContained.category; }
// // public void category(Object value) { wrapperContained.category = value; }
// // public static Object category() { return net.minecraft.entity.attribute.EntityAttribute.category; }
// // public static void category(Object value, ) { net.minecraft.entity.attribute.EntityAttribute.category = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.attribute.EntityAttribute.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.attribute.EntityAttribute.PACKET_CODEC = value.wrapperContained; }

// public EntityAttribute(java.lang.String translationKey,double fallback) { this.wrapperContained = new net.minecraft.entity.attribute.EntityAttribute(translationKey,fallback); }
public double clamp(double value) { return wrapperContained.clamp(value); }
// public static double clamp(double value, ) { return net.minecraft.entity.attribute.EntityAttribute.clamp(value); }
public boolean isTracked() { return wrapperContained.isTracked(); }
// public static boolean isTracked() { return net.minecraft.entity.attribute.EntityAttribute.isTracked(); }
public double getDefaultValue() { return wrapperContained.getDefaultValue(); }
// public static double getDefaultValue() { return net.minecraft.entity.attribute.EntityAttribute.getDefaultValue(); }
public yarnwrap.entity.attribute.EntityAttribute setTracked(boolean tracked) { return new yarnwrap.entity.attribute.EntityAttribute(wrapperContained.setTracked(tracked)); }
// public static yarnwrap.entity.attribute.EntityAttribute setTracked(boolean tracked, ) { return new yarnwrap.entity.attribute.EntityAttribute(net.minecraft.entity.attribute.EntityAttribute.setTracked(tracked)); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public static java.lang.String getTranslationKey() { return net.minecraft.entity.attribute.EntityAttribute.getTranslationKey(); }
// public yarnwrap.entity.attribute.EntityAttribute setCategory(Object category) { return new yarnwrap.entity.attribute.EntityAttribute(wrapperContained.setCategory(category)); }
// public static yarnwrap.entity.attribute.EntityAttribute setCategory(Object category, ) { return new yarnwrap.entity.attribute.EntityAttribute(net.minecraft.entity.attribute.EntityAttribute.setCategory(category)); }
public yarnwrap.util.Formatting getFormatting(boolean addition) { return new yarnwrap.util.Formatting(wrapperContained.getFormatting(addition)); }
// public static yarnwrap.util.Formatting getFormatting(boolean addition, ) { return new yarnwrap.util.Formatting(net.minecraft.entity.attribute.EntityAttribute.getFormatting(addition)); }

}