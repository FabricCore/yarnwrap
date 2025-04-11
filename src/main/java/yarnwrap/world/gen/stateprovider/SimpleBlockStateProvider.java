package yarnwrap.world.gen.stateprovider;
public class SimpleBlockStateProvider { public net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider wrapperContained; public SimpleBlockStateProvider(net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState state() { return new yarnwrap.block.BlockState(wrapperContained.state); }
// public void state(yarnwrap.block.BlockState value) { wrapperContained.state = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}