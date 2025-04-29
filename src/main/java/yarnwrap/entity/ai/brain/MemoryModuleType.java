package yarnwrap.entity.ai.brain;
public class MemoryModuleType { public net.minecraft.entity.ai.brain.MemoryModuleType wrapperContained; public MemoryModuleType(net.minecraft.entity.ai.brain.MemoryModuleType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional codec() { return wrapperContained.codec; }
// public void codec(java.util.Optional value) { wrapperContained.codec = value; }
// public static java.util.Optional codec() { return net.minecraft.entity.ai.brain.MemoryModuleType.codec; }
// public static void codec(java.util.Optional value, ) { net.minecraft.entity.ai.brain.MemoryModuleType.codec = value; }

public MemoryModuleType(java.util.Optional codec) { this.wrapperContained = new net.minecraft.entity.ai.brain.MemoryModuleType(codec); }
// public yarnwrap.entity.ai.brain.MemoryModuleType register(java.lang.String id,com.mojang.serialization.Codec codec) { return new yarnwrap.entity.ai.brain.MemoryModuleType(wrapperContained.register(id,codec)); }
// public static yarnwrap.entity.ai.brain.MemoryModuleType register(java.lang.String id,com.mojang.serialization.Codec codec, ) { return new yarnwrap.entity.ai.brain.MemoryModuleType(net.minecraft.entity.ai.brain.MemoryModuleType.register(id,codec)); }
public java.util.Optional getCodec() { return wrapperContained.getCodec(); }
// public static java.util.Optional getCodec() { return net.minecraft.entity.ai.brain.MemoryModuleType.getCodec(); }
// public yarnwrap.entity.ai.brain.MemoryModuleType register(java.lang.String id) { return new yarnwrap.entity.ai.brain.MemoryModuleType(wrapperContained.register(id)); }
// public static yarnwrap.entity.ai.brain.MemoryModuleType register(java.lang.String id, ) { return new yarnwrap.entity.ai.brain.MemoryModuleType(net.minecraft.entity.ai.brain.MemoryModuleType.register(id)); }

}