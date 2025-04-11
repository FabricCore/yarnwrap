package yarnwrap.structure.pool.alias;
public class StructurePoolAliasLookup { public net.minecraft.structure.pool.alias.StructurePoolAliasLookup wrapperContained; public StructurePoolAliasLookup(net.minecraft.structure.pool.alias.StructurePoolAliasLookup wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.pool.alias.StructurePoolAliasLookup EMPTY() { return new yarnwrap.structure.pool.alias.StructurePoolAliasLookup(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.structure.pool.alias.StructurePoolAliasLookup value) { wrapperContained.EMPTY = value.wrapperContained; }

}