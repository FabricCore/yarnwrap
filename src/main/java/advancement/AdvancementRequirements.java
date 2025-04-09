package yarnwrap.advancement;
public class AdvancementRequirements { public net.minecraft.advancement.AdvancementRequirements wrapperContained; public AdvancementRequirements(net.minecraft.advancement.AdvancementRequirements wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.advancement.AdvancementRequirements EMPTY() { return new yarnwrap.advancement.AdvancementRequirements(wrapperContained.EMPTY); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public int getLength() { return wrapperContained.getLength(); }
public yarnwrap.advancement.AdvancementRequirements allOf(java.util.Collection requirements) { return new yarnwrap.advancement.AdvancementRequirements(wrapperContained.allOf(requirements)); }
public boolean matches(java.util.function.Predicate predicate) { return wrapperContained.matches(predicate); }
public void writeRequirements(yarnwrap.network.PacketByteBuf buf) { wrapperContained.writeRequirements(buf.wrapperContained); }
// public boolean anyMatch(java.util.List requirements,java.util.function.Predicate predicate) { return wrapperContained.anyMatch(requirements,predicate); }
public yarnwrap.advancement.AdvancementRequirements anyOf(java.util.Collection requirements) { return new yarnwrap.advancement.AdvancementRequirements(wrapperContained.anyOf(requirements)); }
public int countMatches(java.util.function.Predicate predicate) { return wrapperContained.countMatches(predicate); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public java.util.Set getNames() { return wrapperContained.getNames(); }
public com.mojang.serialization.DataResult validate(java.util.Set requirements) { return wrapperContained.validate(requirements); }

}