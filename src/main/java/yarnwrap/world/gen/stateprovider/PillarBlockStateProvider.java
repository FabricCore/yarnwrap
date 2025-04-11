package yarnwrap.world.gen.stateprovider;
public class PillarBlockStateProvider { public net.minecraft.world.gen.stateprovider.PillarBlockStateProvider wrapperContained; public PillarBlockStateProvider(net.minecraft.world.gen.stateprovider.PillarBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}