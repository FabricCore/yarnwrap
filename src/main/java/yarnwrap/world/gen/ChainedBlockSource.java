package yarnwrap.world.gen;
public class ChainedBlockSource { public net.minecraft.world.gen.ChainedBlockSource wrapperContained; public ChainedBlockSource(net.minecraft.world.gen.ChainedBlockSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List samplers() { return wrapperContained.samplers; }
// public void samplers(java.util.List value) { wrapperContained.samplers = value; }
// public static java.util.List samplers() { return net.minecraft.world.gen.ChainedBlockSource.samplers; }
// public static void samplers(java.util.List value, ) { net.minecraft.world.gen.ChainedBlockSource.samplers = value; }

public ChainedBlockSource(java.util.List samplers) { this.wrapperContained = new net.minecraft.world.gen.ChainedBlockSource(samplers); }
// public java.util.List samplers() { return wrapperContained.samplers(); }
// // public static java.util.List samplers() { return net.minecraft.world.gen.ChainedBlockSource.samplers(); }

}