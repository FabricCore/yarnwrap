package yarnwrap.advancement;
public class AdvancementRequirements { public net.minecraft.advancement.AdvancementRequirements wrapperContained; public AdvancementRequirements(net.minecraft.advancement.AdvancementRequirements wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.advancement.AdvancementRequirements EMPTY() { return new yarnwrap.advancement.AdvancementRequirements(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.advancement.AdvancementRequirements value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.advancement.AdvancementRequirements EMPTY() { return new yarnwrap.advancement.AdvancementRequirements(net.minecraft.advancement.AdvancementRequirements.EMPTY); }
// public static void EMPTY(yarnwrap.advancement.AdvancementRequirements value, ) { net.minecraft.advancement.AdvancementRequirements.EMPTY = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.advancement.AdvancementRequirements.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.AdvancementRequirements.CODEC = value; }

public AdvancementRequirements(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.advancement.AdvancementRequirements(buf.wrapperContained); }
public int getLength() { return wrapperContained.getLength(); }
// public static int getLength() { return net.minecraft.advancement.AdvancementRequirements.getLength(); }
// public yarnwrap.advancement.AdvancementRequirements allOf(java.util.Collection requirements) { return new yarnwrap.advancement.AdvancementRequirements(wrapperContained.allOf(requirements)); }
// public static yarnwrap.advancement.AdvancementRequirements allOf(java.util.Collection requirements, ) { return new yarnwrap.advancement.AdvancementRequirements(net.minecraft.advancement.AdvancementRequirements.allOf(requirements)); }
public boolean matches(java.util.function.Predicate predicate) { return wrapperContained.matches(predicate); }
// public static boolean matches(java.util.function.Predicate predicate, ) { return net.minecraft.advancement.AdvancementRequirements.matches(predicate); }
public void writeRequirements(yarnwrap.network.PacketByteBuf buf) { wrapperContained.writeRequirements(buf.wrapperContained); }
// public static void writeRequirements(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.advancement.AdvancementRequirements.writeRequirements(buf.wrapperContained); }
// public boolean anyMatch(java.util.List requirements,java.util.function.Predicate predicate) { return wrapperContained.anyMatch(requirements,predicate); }
// public static boolean anyMatch(java.util.List requirements,java.util.function.Predicate predicate, ) { return net.minecraft.advancement.AdvancementRequirements.anyMatch(requirements,predicate); }
// public yarnwrap.advancement.AdvancementRequirements anyOf(java.util.Collection requirements) { return new yarnwrap.advancement.AdvancementRequirements(wrapperContained.anyOf(requirements)); }
// public static yarnwrap.advancement.AdvancementRequirements anyOf(java.util.Collection requirements, ) { return new yarnwrap.advancement.AdvancementRequirements(net.minecraft.advancement.AdvancementRequirements.anyOf(requirements)); }
public int countMatches(java.util.function.Predicate predicate) { return wrapperContained.countMatches(predicate); }
// public static int countMatches(java.util.function.Predicate predicate, ) { return net.minecraft.advancement.AdvancementRequirements.countMatches(predicate); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.advancement.AdvancementRequirements.isEmpty(); }
public java.util.Set getNames() { return wrapperContained.getNames(); }
// public static java.util.Set getNames() { return net.minecraft.advancement.AdvancementRequirements.getNames(); }
public com.mojang.serialization.DataResult validate(java.util.Set requirements) { return wrapperContained.validate(requirements); }
// public static com.mojang.serialization.DataResult validate(java.util.Set requirements, ) { return net.minecraft.advancement.AdvancementRequirements.validate(requirements); }
// public void method_54927(yarnwrap.network.PacketByteBuf bufx,java.util.List requirements) { wrapperContained.method_54927(bufx.wrapperContained,requirements); }
// public static void method_54927(yarnwrap.network.PacketByteBuf bufx,java.util.List requirements, ) { net.minecraft.advancement.AdvancementRequirements.method_54927(bufx.wrapperContained,requirements); }
// public java.util.List method_54928(yarnwrap.network.PacketByteBuf bufx) { return wrapperContained.method_54928(bufx.wrapperContained); }
// public static java.util.List method_54928(yarnwrap.network.PacketByteBuf bufx, ) { return net.minecraft.advancement.AdvancementRequirements.method_54928(bufx.wrapperContained); }

}