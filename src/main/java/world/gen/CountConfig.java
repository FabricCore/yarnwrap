package yarnwrap.world.gen;
public class CountConfig { public net.minecraft.world.gen.CountConfig wrapperContained; public CountConfig(net.minecraft.world.gen.CountConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.intprovider.IntProvider count() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.count); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.util.math.intprovider.IntProvider getCount() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.getCount()); }

}