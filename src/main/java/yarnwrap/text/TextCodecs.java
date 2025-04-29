package yarnwrap.text;
public class TextCodecs { public net.minecraft.text.TextCodecs wrapperContained; public TextCodecs(net.minecraft.text.TextCodecs wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.text.TextCodecs.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.text.TextCodecs.CODEC = value; }

// public com.mojang.serialization.Codec STRINGIFIED_CODEC() { return wrapperContained.STRINGIFIED_CODEC; }
// public void STRINGIFIED_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STRINGIFIED_CODEC = value; }
public static com.mojang.serialization.Codec STRINGIFIED_CODEC() { return net.minecraft.text.TextCodecs.STRINGIFIED_CODEC; }
// public static void STRINGIFIED_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.text.TextCodecs.STRINGIFIED_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec REGISTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.REGISTRY_PACKET_CODEC); }
// public void REGISTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.REGISTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec REGISTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.text.TextCodecs.REGISTRY_PACKET_CODEC); }
// public static void REGISTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.text.TextCodecs.REGISTRY_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_PACKET_CODEC); }
// public void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec OPTIONAL_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.text.TextCodecs.OPTIONAL_PACKET_CODEC); }
// public static void OPTIONAL_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.text.TextCodecs.OPTIONAL_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec UNLIMITED_REGISTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.UNLIMITED_REGISTRY_PACKET_CODEC); }
// public void UNLIMITED_REGISTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.UNLIMITED_REGISTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec UNLIMITED_REGISTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.text.TextCodecs.UNLIMITED_REGISTRY_PACKET_CODEC); }
// public static void UNLIMITED_REGISTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.text.TextCodecs.UNLIMITED_REGISTRY_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec OPTIONAL_UNLIMITED_REGISTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_UNLIMITED_REGISTRY_PACKET_CODEC); }
// public void OPTIONAL_UNLIMITED_REGISTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_UNLIMITED_REGISTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec OPTIONAL_UNLIMITED_REGISTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.text.TextCodecs.OPTIONAL_UNLIMITED_REGISTRY_PACKET_CODEC); }
// public static void OPTIONAL_UNLIMITED_REGISTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.text.TextCodecs.OPTIONAL_UNLIMITED_REGISTRY_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.text.TextCodecs.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.text.TextCodecs.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.text.Text method_54165(com.mojang.datafixers.util.Either either) { return new yarnwrap.text.Text(wrapperContained.method_54165(either)); }
// public static yarnwrap.text.Text method_54165(com.mojang.datafixers.util.Either either, ) { return new yarnwrap.text.Text(net.minecraft.text.TextCodecs.method_54165(either)); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec selfCodec) { return wrapperContained.createCodec(selfCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec selfCodec, ) { return net.minecraft.text.TextCodecs.createCodec(selfCodec); }
// public com.mojang.datafixers.kinds.App method_54167(com.mojang.serialization.MapCodec instance) { return wrapperContained.method_54167(instance); }
// public static com.mojang.datafixers.kinds.App method_54167(com.mojang.serialization.MapCodec instance, ) { return net.minecraft.text.TextCodecs.method_54167(instance); }
// public yarnwrap.text.MutableText combine(java.util.List texts) { return new yarnwrap.text.MutableText(wrapperContained.combine(texts)); }
// public static yarnwrap.text.MutableText combine(java.util.List texts, ) { return new yarnwrap.text.MutableText(net.minecraft.text.TextCodecs.combine(texts)); }
// public com.mojang.serialization.MapEncoder method_54171(java.util.function.Function object) { return wrapperContained.method_54171(object); }
// public static com.mojang.serialization.MapEncoder method_54171(java.util.function.Function object, ) { return net.minecraft.text.TextCodecs.method_54171(object); }
// public com.mojang.datafixers.util.Either method_54172(yarnwrap.text.Text text) { return wrapperContained.method_54172(text.wrapperContained); }
// public static com.mojang.datafixers.util.Either method_54172(yarnwrap.text.Text text, ) { return net.minecraft.text.TextCodecs.method_54172(text.wrapperContained); }
// public com.mojang.serialization.MapCodec dispatchingCodec(net.minecraft.util.StringIdentifiable[] types,java.util.function.Function typeToCodec,java.util.function.Function valueToType,java.lang.String dispatchingKey) { return wrapperContained.dispatchingCodec(types,typeToCodec,valueToType,dispatchingKey); }
// public static com.mojang.serialization.MapCodec dispatchingCodec(net.minecraft.util.StringIdentifiable[] types,java.util.function.Function typeToCodec,java.util.function.Function valueToType,java.lang.String dispatchingKey, ) { return net.minecraft.text.TextCodecs.dispatchingCodec(types,typeToCodec,valueToType,dispatchingKey); }
// public yarnwrap.text.Text method_54175(com.mojang.datafixers.util.Either either2) { return new yarnwrap.text.Text(wrapperContained.method_54175(either2)); }
// public static yarnwrap.text.Text method_54175(com.mojang.datafixers.util.Either either2, ) { return new yarnwrap.text.Text(net.minecraft.text.TextCodecs.method_54175(either2)); }
// public yarnwrap.text.Text method_54177(yarnwrap.text.Text text) { return new yarnwrap.text.Text(wrapperContained.method_54177(text.wrapperContained)); }
// public static yarnwrap.text.Text method_54177(yarnwrap.text.Text text, ) { return new yarnwrap.text.Text(net.minecraft.text.TextCodecs.method_54177(text.wrapperContained)); }
// public com.mojang.serialization.Codec codec(int maxSerializedLength) { return wrapperContained.codec(maxSerializedLength); }
// public static com.mojang.serialization.Codec codec(int maxSerializedLength, ) { return net.minecraft.text.TextCodecs.codec(maxSerializedLength); }

}