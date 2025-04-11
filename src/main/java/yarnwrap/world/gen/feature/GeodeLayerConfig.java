package yarnwrap.world.gen.feature;
public class GeodeLayerConfig { public net.minecraft.world.gen.feature.GeodeLayerConfig wrapperContained; public GeodeLayerConfig(net.minecraft.world.gen.feature.GeodeLayerConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider fillingProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.fillingProvider); }
// public void fillingProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.fillingProvider = value.wrapperContained; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider innerLayerProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.innerLayerProvider); }
// public void innerLayerProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.innerLayerProvider = value.wrapperContained; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider alternateInnerLayerProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.alternateInnerLayerProvider); }
// public void alternateInnerLayerProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.alternateInnerLayerProvider = value.wrapperContained; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider middleLayerProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.middleLayerProvider); }
// public void middleLayerProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.middleLayerProvider = value.wrapperContained; }
public yarnwrap.world.gen.stateprovider.BlockStateProvider outerLayerProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.outerLayerProvider); }
// public void outerLayerProvider(yarnwrap.world.gen.stateprovider.BlockStateProvider value) { wrapperContained.outerLayerProvider = value.wrapperContained; }
public java.util.List innerBlocks() { return wrapperContained.innerBlocks; }
// public void innerBlocks(java.util.List value) { wrapperContained.innerBlocks = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.registry.tag.TagKey cannotReplace() { return new yarnwrap.registry.tag.TagKey(wrapperContained.cannotReplace); }
// public void cannotReplace(yarnwrap.registry.tag.TagKey value) { wrapperContained.cannotReplace = value.wrapperContained; }
public yarnwrap.registry.tag.TagKey invalidBlocks() { return new yarnwrap.registry.tag.TagKey(wrapperContained.invalidBlocks); }
// public void invalidBlocks(yarnwrap.registry.tag.TagKey value) { wrapperContained.invalidBlocks = value.wrapperContained; }
public GeodeLayerConfig(yarnwrap.world.gen.stateprovider.BlockStateProvider fillingProvider,yarnwrap.world.gen.stateprovider.BlockStateProvider innerLayerProvider,yarnwrap.world.gen.stateprovider.BlockStateProvider alternateInnerLayerProvider,yarnwrap.world.gen.stateprovider.BlockStateProvider middleLayerProvider,yarnwrap.world.gen.stateprovider.BlockStateProvider outerLayerProvider,java.util.List innerBlocks,yarnwrap.registry.tag.TagKey cannotReplace,yarnwrap.registry.tag.TagKey invalidBlocks) { this.wrapperContained = new net.minecraft.world.gen.feature.GeodeLayerConfig(fillingProvider.wrapperContained,innerLayerProvider.wrapperContained,alternateInnerLayerProvider.wrapperContained,middleLayerProvider.wrapperContained,outerLayerProvider.wrapperContained,innerBlocks,cannotReplace.wrapperContained,invalidBlocks.wrapperContained); }
// public java.util.List method_31886(yarnwrap.world.gen.feature.GeodeLayerConfig config) { return wrapperContained.method_31886(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_31887(Object instance) { return wrapperContained.method_31887(instance); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_31888(yarnwrap.world.gen.feature.GeodeLayerConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_31888(config.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_31889(yarnwrap.world.gen.feature.GeodeLayerConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_31889(config.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_31890(yarnwrap.world.gen.feature.GeodeLayerConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_31890(config.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_31891(yarnwrap.world.gen.feature.GeodeLayerConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_31891(config.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_31892(yarnwrap.world.gen.feature.GeodeLayerConfig config) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_31892(config.wrapperContained)); }
// public yarnwrap.registry.tag.TagKey method_36995(yarnwrap.world.gen.feature.GeodeLayerConfig config) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_36995(config.wrapperContained)); }
// public yarnwrap.registry.tag.TagKey method_37255(yarnwrap.world.gen.feature.GeodeLayerConfig config) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_37255(config.wrapperContained)); }

}