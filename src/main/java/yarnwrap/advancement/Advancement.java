package yarnwrap.advancement;
public class Advancement { public net.minecraft.advancement.Advancement wrapperContained; public Advancement(net.minecraft.advancement.Advancement wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.advancement.Advancement.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.Advancement.CODEC = value; }

// public com.mojang.serialization.Codec CRITERIA_CODEC() { return wrapperContained.CRITERIA_CODEC; }
// public void CRITERIA_CODEC(com.mojang.serialization.Codec value) { wrapperContained.CRITERIA_CODEC = value; }
// public static com.mojang.serialization.Codec CRITERIA_CODEC() { return net.minecraft.advancement.Advancement.CRITERIA_CODEC; }
// public static void CRITERIA_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.Advancement.CRITERIA_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.advancement.Advancement.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.advancement.Advancement.PACKET_CODEC = value.wrapperContained; }

public Advancement(java.util.Optional parent,java.util.Optional display,yarnwrap.advancement.AdvancementRewards rewards,java.util.Map criteria,yarnwrap.advancement.AdvancementRequirements requirements,boolean sendsTelemetryEvent) { this.wrapperContained = new net.minecraft.advancement.Advancement(parent,display,rewards.wrapperContained,criteria,requirements.wrapperContained,sendsTelemetryEvent); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.advancement.Advancement.equals(o); }
// public yarnwrap.text.Text getNameFromIdentity(yarnwrap.advancement.AdvancementEntry identifiedAdvancement) { return new yarnwrap.text.Text(wrapperContained.getNameFromIdentity(identifiedAdvancement.wrapperContained)); }
// public static yarnwrap.text.Text getNameFromIdentity(yarnwrap.advancement.AdvancementEntry identifiedAdvancement, ) { return new yarnwrap.text.Text(net.minecraft.advancement.Advancement.getNameFromIdentity(identifiedAdvancement.wrapperContained)); }
// public yarnwrap.text.Text createNameFromDisplay(yarnwrap.advancement.AdvancementDisplay display) { return new yarnwrap.text.Text(wrapperContained.createNameFromDisplay(display.wrapperContained)); }
// public static yarnwrap.text.Text createNameFromDisplay(yarnwrap.advancement.AdvancementDisplay display, ) { return new yarnwrap.text.Text(net.minecraft.advancement.Advancement.createNameFromDisplay(display.wrapperContained)); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.advancement.Advancement.write(buf.wrapperContained); }
// public yarnwrap.text.Style method_53629(yarnwrap.text.Text style) { return new yarnwrap.text.Style(wrapperContained.method_53629(style.wrapperContained)); }
// public static yarnwrap.text.Style method_53629(yarnwrap.text.Text style, ) { return new yarnwrap.text.Style(net.minecraft.advancement.Advancement.method_53629(style.wrapperContained)); }
public boolean isRoot() { return wrapperContained.isRoot(); }
// public static boolean isRoot() { return net.minecraft.advancement.Advancement.isRoot(); }
// public yarnwrap.advancement.Advancement read(yarnwrap.network.RegistryByteBuf buf) { return new yarnwrap.advancement.Advancement(wrapperContained.read(buf.wrapperContained)); }
// public static yarnwrap.advancement.Advancement read(yarnwrap.network.RegistryByteBuf buf, ) { return new yarnwrap.advancement.Advancement(net.minecraft.advancement.Advancement.read(buf.wrapperContained)); }
// public com.mojang.serialization.DataResult validate(yarnwrap.advancement.Advancement advancement) { return wrapperContained.validate(advancement.wrapperContained); }
// public static com.mojang.serialization.DataResult validate(yarnwrap.advancement.Advancement advancement, ) { return net.minecraft.advancement.Advancement.validate(advancement.wrapperContained); }
// public yarnwrap.advancement.Advancement method_54911(yarnwrap.advancement.Advancement validated) { return new yarnwrap.advancement.Advancement(wrapperContained.method_54911(validated.wrapperContained)); }
// public static yarnwrap.advancement.Advancement method_54911(yarnwrap.advancement.Advancement validated, ) { return new yarnwrap.advancement.Advancement(net.minecraft.advancement.Advancement.method_54911(validated.wrapperContained)); }
// public void validate(yarnwrap.util.ErrorReporter errorReporter,Object lookup) { wrapperContained.validate(errorReporter.wrapperContained,lookup); }
// public static void validate(yarnwrap.util.ErrorReporter errorReporter,Object lookup, ) { net.minecraft.advancement.Advancement.validate(errorReporter.wrapperContained,lookup); }
// public void method_54913(yarnwrap.util.ErrorReporter name,Object criterion) { wrapperContained.method_54913(name.wrapperContained,criterion); }
// public static void method_54913(yarnwrap.util.ErrorReporter name,Object criterion, ) { net.minecraft.advancement.Advancement.method_54913(name.wrapperContained,criterion); }
// public com.mojang.datafixers.kinds.App method_54914(Object instance) { return wrapperContained.method_54914(instance); }
// public static com.mojang.datafixers.kinds.App method_54914(Object instance, ) { return net.minecraft.advancement.Advancement.method_54914(instance); }
// public yarnwrap.advancement.Advancement method_54916(java.util.Optional parent,java.util.Optional display,yarnwrap.advancement.AdvancementRewards rewards,java.util.Map criteria,java.util.Optional requirements,java.lang.Boolean sendsTelemetryEvent) { return new yarnwrap.advancement.Advancement(wrapperContained.method_54916(parent,display,rewards.wrapperContained,criteria,requirements,sendsTelemetryEvent)); }
// public static yarnwrap.advancement.Advancement method_54916(java.util.Optional parent,java.util.Optional display,yarnwrap.advancement.AdvancementRewards rewards,java.util.Map criteria,java.util.Optional requirements,java.lang.Boolean sendsTelemetryEvent, ) { return new yarnwrap.advancement.Advancement(net.minecraft.advancement.Advancement.method_54916(parent,display,rewards.wrapperContained,criteria,requirements,sendsTelemetryEvent)); }
// public java.util.Optional method_54917(yarnwrap.advancement.Advancement advancement) { return wrapperContained.method_54917(advancement.wrapperContained); }
// public static java.util.Optional method_54917(yarnwrap.advancement.Advancement advancement, ) { return net.minecraft.advancement.Advancement.method_54917(advancement.wrapperContained); }
// public com.mojang.serialization.DataResult method_54918(java.util.Map criteria) { return wrapperContained.method_54918(criteria); }
// public static com.mojang.serialization.DataResult method_54918(java.util.Map criteria, ) { return net.minecraft.advancement.Advancement.method_54918(criteria); }

}