package yarnwrap.entity.ai.brain;
public class Memory { public net.minecraft.entity.ai.brain.Memory wrapperContained; public Memory(net.minecraft.entity.ai.brain.Memory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Object value() { return wrapperContained.value; }
// public long expiry() { return wrapperContained.expiry; }
public boolean isExpired() { return wrapperContained.isExpired(); }
public yarnwrap.entity.ai.brain.Memory timed(java.lang.Object value,long expiry) { return new yarnwrap.entity.ai.brain.Memory(wrapperContained.timed(value,expiry)); }
public java.lang.Object getValue() { return wrapperContained.getValue(); }
public void tick() { wrapperContained.tick(); }
public boolean isTimed() { return wrapperContained.isTimed(); }
public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec codec) { return wrapperContained.createCodec(codec); }
public yarnwrap.entity.ai.brain.Memory permanent(java.lang.Object value) { return new yarnwrap.entity.ai.brain.Memory(wrapperContained.permanent(value)); }
public long getExpiry() { return wrapperContained.getExpiry(); }

}