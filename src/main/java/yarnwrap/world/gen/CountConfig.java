package yarnwrap.world.gen;
public class CountConfig { public net.minecraft.world.gen.CountConfig wrapperContained; public CountConfig(net.minecraft.world.gen.CountConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider count() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.count); }
// public void count(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.count = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.util.math.intprovider.IntProvider getCount() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getCount()); }

}