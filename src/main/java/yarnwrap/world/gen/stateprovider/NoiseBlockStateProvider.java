package yarnwrap.world.gen.stateprovider;
public class NoiseBlockStateProvider { public net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider wrapperContained; public NoiseBlockStateProvider(net.minecraft.world.gen.stateprovider.NoiseBlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.List states() { return wrapperContained.states; }
// public void states(java.util.List value) { wrapperContained.states = value; }
// public yarnwrap.block.BlockState getStateAtValue(java.util.List states,double value) { return new yarnwrap.block.BlockState(wrapperContained.getStateAtValue(states,value)); }
// public yarnwrap.block.BlockState getStateFromList(java.util.List states,yarnwrap.util.math.BlockPos pos,double scale) { return new yarnwrap.block.BlockState(wrapperContained.getStateFromList(states,pos.wrapperContained,scale)); }
// public Object fillNoiseCodecFields(Object instance) { return wrapperContained.fillNoiseCodecFields(instance); }

}