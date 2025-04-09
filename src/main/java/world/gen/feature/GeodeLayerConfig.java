package yarnwrap.world.gen.feature;
public class GeodeLayerConfig { public net.minecraft.world.gen.feature.GeodeLayerConfig wrapperContained; public GeodeLayerConfig(net.minecraft.world.gen.feature.GeodeLayerConfig wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.stateprovider.BlockStateProvider fillingProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.fillingProvider); }
public yarnwrap.world.gen.stateprovider.BlockStateProvider innerLayerProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.innerLayerProvider); }
public yarnwrap.world.gen.stateprovider.BlockStateProvider alternateInnerLayerProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.alternateInnerLayerProvider); }
public yarnwrap.world.gen.stateprovider.BlockStateProvider middleLayerProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.middleLayerProvider); }
public yarnwrap.world.gen.stateprovider.BlockStateProvider outerLayerProvider() { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.outerLayerProvider); }
public java.util.List innerBlocks() { return wrapperContained.innerBlocks; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.registry.tag.TagKey cannotReplace() { return new yarnwrap.registry.tag.TagKey(wrapperContained.cannotReplace); }
public yarnwrap.registry.tag.TagKey invalidBlocks() { return new yarnwrap.registry.tag.TagKey(wrapperContained.invalidBlocks); }

}