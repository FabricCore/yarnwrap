package yarnwrap.item.map;
public class MapDecorationTypes { public net.minecraft.item.map.MapDecorationTypes wrapperContained; public MapDecorationTypes(net.minecraft.item.map.MapDecorationTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public int TRIAL_CHAMBERS_MAP_COLOR() { return wrapperContained.TRIAL_CHAMBERS_MAP_COLOR; }
// public yarnwrap.registry.entry.RegistryEntry register(java.lang.String id,java.lang.String assetId,boolean showOnItemFrame,int mapColor,boolean trackCount,boolean explorationMapElement) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id,assetId,showOnItemFrame,mapColor,trackCount,explorationMapElement)); }
// public yarnwrap.registry.entry.RegistryEntry register(java.lang.String id,java.lang.String assetId,boolean showOnItemFrame,boolean trackCount) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id,assetId,showOnItemFrame,trackCount)); }
public yarnwrap.registry.entry.RegistryEntry getDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getDefault(registry.wrapperContained)); }

}