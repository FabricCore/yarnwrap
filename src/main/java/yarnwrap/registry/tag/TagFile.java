package yarnwrap.registry.tag;
public class TagFile { public net.minecraft.registry.tag.TagFile wrapperContained; public TagFile(net.minecraft.registry.tag.TagFile wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.kinds.App method_43950(Object instance) { return wrapperContained.method_43950(instance); }

}