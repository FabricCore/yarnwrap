package yarnwrap.world.gen.stateprovider;
public class PillarBlockStateProvider { public net.minecraft.world.gen.stateprovider.PillarBlockStateProvider wrapperContained; public PillarBlockStateProvider(net.minecraft.world.gen.stateprovider.PillarBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}