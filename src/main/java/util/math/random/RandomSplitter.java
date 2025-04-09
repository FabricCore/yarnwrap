package yarnwrap.util.math.random;
public class RandomSplitter { public net.minecraft.util.math.random.RandomSplitter wrapperContained; public RandomSplitter(net.minecraft.util.math.random.RandomSplitter wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.random.Random split(int x,int y,int z) { return new yarnwrap.util.math.random.Random(wrapperContained.split(x,y,z)); }
public yarnwrap.util.math.random.Random split(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.random.Random(wrapperContained.split(pos.wrapperContained)); }
public yarnwrap.util.math.random.Random split(java.lang.String seed) { return new yarnwrap.util.math.random.Random(wrapperContained.split(seed)); }
public yarnwrap.util.math.random.Random split(yarnwrap.util.Identifier seed) { return new yarnwrap.util.math.random.Random(wrapperContained.split(seed.wrapperContained)); }
public void addDebugInfo(java.lang.StringBuilder info) { wrapperContained.addDebugInfo(info); }
public yarnwrap.util.math.random.Random split(long seed) { return new yarnwrap.util.math.random.Random(wrapperContained.split(seed)); }

}