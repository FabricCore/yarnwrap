package yarnwrap.structure.pool.alias;
public class StructurePoolAliasBinding { public net.minecraft.structure.pool.alias.StructurePoolAliasBinding wrapperContained; public StructurePoolAliasBinding(net.minecraft.structure.pool.alias.StructurePoolAliasBinding wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public java.util.stream.Stream streamTargets() { return wrapperContained.streamTargets(); }
public void forEach(yarnwrap.util.math.random.Random random,java.util.function.BiConsumer aliasConsumer) { wrapperContained.forEach(random.wrapperContained,aliasConsumer); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public yarnwrap.structure.pool.alias.DirectStructurePoolAliasBinding direct(yarnwrap.registry.RegistryKey alias,yarnwrap.registry.RegistryKey target) { return new yarnwrap.structure.pool.alias.DirectStructurePoolAliasBinding(wrapperContained.direct(alias.wrapperContained,target.wrapperContained)); }
// public yarnwrap.structure.pool.alias.RandomStructurePoolAliasBinding random(yarnwrap.registry.RegistryKey alias,yarnwrap.util.collection.DataPool targets) { return new yarnwrap.structure.pool.alias.RandomStructurePoolAliasBinding(wrapperContained.random(alias.wrapperContained,targets.wrapperContained)); }
// public yarnwrap.structure.pool.alias.RandomGroupStructurePoolAliasBinding randomGroup(yarnwrap.util.collection.DataPool groups) { return new yarnwrap.structure.pool.alias.RandomGroupStructurePoolAliasBinding(wrapperContained.randomGroup(groups.wrapperContained)); }
// public yarnwrap.structure.pool.alias.RandomStructurePoolAliasBinding random(java.lang.String alias,yarnwrap.util.collection.DataPool targets) { return new yarnwrap.structure.pool.alias.RandomStructurePoolAliasBinding(wrapperContained.random(alias,targets.wrapperContained)); }
// public yarnwrap.structure.pool.alias.DirectStructurePoolAliasBinding direct(java.lang.String alias,java.lang.String target) { return new yarnwrap.structure.pool.alias.DirectStructurePoolAliasBinding(wrapperContained.direct(alias,target)); }

}