package yarnwrap.world.gen;
public class ChainedBlockSource { public net.minecraft.world.gen.ChainedBlockSource wrapperContained; public ChainedBlockSource(net.minecraft.world.gen.ChainedBlockSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object samplers() { return wrapperContained.samplers; }
// // public void samplers(Object value) { wrapperContained.samplers = value; }
// // public static Object samplers() { return net.minecraft.world.gen.ChainedBlockSource.samplers; }
// // public static void samplers(Object value, ) { net.minecraft.world.gen.ChainedBlockSource.samplers = value; }

// public Object samplers() { return wrapperContained.samplers(); }
// // public static Object samplers() { return net.minecraft.world.gen.ChainedBlockSource.samplers(); }

}