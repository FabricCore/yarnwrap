package yarnwrap.entity.ai.brain;
public class Memory { public net.minecraft.entity.ai.brain.Memory wrapperContained; public Memory(net.minecraft.entity.ai.brain.Memory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object value() { return wrapperContained.value; }
// public void value(java.lang.Object value) { wrapperContained.value = value; }
// // public static java.lang.Object value() { return net.minecraft.entity.ai.brain.Memory.value; }
// public static void value(java.lang.Object value, ) { net.minecraft.entity.ai.brain.Memory.value = value; }

// public long expiry() { return wrapperContained.expiry; }
// public void expiry(long value) { wrapperContained.expiry = value; }
// public static long expiry() { return net.minecraft.entity.ai.brain.Memory.expiry; }
// public static void expiry(long value, ) { net.minecraft.entity.ai.brain.Memory.expiry = value; }

public Memory(java.lang.Object value,long expiry) { this.wrapperContained = new net.minecraft.entity.ai.brain.Memory(value,expiry); }
public boolean isExpired() { return wrapperContained.isExpired(); }
// public static boolean isExpired() { return net.minecraft.entity.ai.brain.Memory.isExpired(); }
// public yarnwrap.entity.ai.brain.Memory timed(java.lang.Object value,long expiry) { return new yarnwrap.entity.ai.brain.Memory(wrapperContained.timed(value,expiry)); }
// public static yarnwrap.entity.ai.brain.Memory timed(java.lang.Object value,long expiry, ) { return new yarnwrap.entity.ai.brain.Memory(net.minecraft.entity.ai.brain.Memory.timed(value,expiry)); }
public java.lang.Object getValue() { return wrapperContained.getValue(); }
// public static java.lang.Object getValue() { return net.minecraft.entity.ai.brain.Memory.getValue(); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.entity.ai.brain.Memory.tick(); }
public boolean isTimed() { return wrapperContained.isTimed(); }
// public static boolean isTimed() { return net.minecraft.entity.ai.brain.Memory.isTimed(); }
// public java.util.Optional method_28352(yarnwrap.entity.ai.brain.Memory memory) { return wrapperContained.method_28352(memory.wrapperContained); }
// public static java.util.Optional method_28352(yarnwrap.entity.ai.brain.Memory memory, ) { return net.minecraft.entity.ai.brain.Memory.method_28352(memory.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec codec) { return wrapperContained.createCodec(codec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec codec, ) { return net.minecraft.entity.ai.brain.Memory.createCodec(codec); }
// public com.mojang.datafixers.kinds.App method_28354(com.mojang.serialization.Codec instance) { return wrapperContained.method_28354(instance); }
// public static com.mojang.datafixers.kinds.App method_28354(com.mojang.serialization.Codec instance, ) { return net.minecraft.entity.ai.brain.Memory.method_28354(instance); }
// public yarnwrap.entity.ai.brain.Memory permanent(java.lang.Object value) { return new yarnwrap.entity.ai.brain.Memory(wrapperContained.permanent(value)); }
// public static yarnwrap.entity.ai.brain.Memory permanent(java.lang.Object value, ) { return new yarnwrap.entity.ai.brain.Memory(net.minecraft.entity.ai.brain.Memory.permanent(value)); }
// public yarnwrap.entity.ai.brain.Memory method_28356(java.lang.Object value,java.util.Optional expiry) { return new yarnwrap.entity.ai.brain.Memory(wrapperContained.method_28356(value,expiry)); }
// public static yarnwrap.entity.ai.brain.Memory method_28356(java.lang.Object value,java.util.Optional expiry, ) { return new yarnwrap.entity.ai.brain.Memory(net.minecraft.entity.ai.brain.Memory.method_28356(value,expiry)); }
// public java.lang.Object method_28357(yarnwrap.entity.ai.brain.Memory memory) { return wrapperContained.method_28357(memory.wrapperContained); }
// public static java.lang.Object method_28357(yarnwrap.entity.ai.brain.Memory memory, ) { return net.minecraft.entity.ai.brain.Memory.method_28357(memory.wrapperContained); }
public long getExpiry() { return wrapperContained.getExpiry(); }
// public static long getExpiry() { return net.minecraft.entity.ai.brain.Memory.getExpiry(); }

}