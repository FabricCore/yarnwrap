package yarnwrap.world.gen.stateprovider;
public class SimpleBlockStateProvider { public net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider wrapperContained; public SimpleBlockStateProvider(net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}