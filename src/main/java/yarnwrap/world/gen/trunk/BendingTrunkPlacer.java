package yarnwrap.world.gen.trunk;
public class BendingTrunkPlacer { public net.minecraft.world.gen.trunk.BendingTrunkPlacer wrapperContained; public BendingTrunkPlacer(net.minecraft.world.gen.trunk.BendingTrunkPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.trunk.BendingTrunkPlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.trunk.BendingTrunkPlacer.CODEC = value; }

// public int minHeightForLeaves() { return wrapperContained.minHeightForLeaves; }
// public void minHeightForLeaves(int value) { wrapperContained.minHeightForLeaves = value; }
// public static int minHeightForLeaves() { return net.minecraft.world.gen.trunk.BendingTrunkPlacer.minHeightForLeaves; }
// public static void minHeightForLeaves(int value, ) { net.minecraft.world.gen.trunk.BendingTrunkPlacer.minHeightForLeaves = value; }

// public yarnwrap.util.math.intprovider.IntProvider bendLength() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.bendLength); }
// public void bendLength(yarnwrap.util.math.intprovider.IntProvider value) { wrapperContained.bendLength = value.wrapperContained; }
// public static yarnwrap.util.math.intprovider.IntProvider bendLength() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.trunk.BendingTrunkPlacer.bendLength); }
// public static void bendLength(yarnwrap.util.math.intprovider.IntProvider value, ) { net.minecraft.world.gen.trunk.BendingTrunkPlacer.bendLength = value.wrapperContained; }

public BendingTrunkPlacer(int baseHeight,int firstRandomHeight,int secondRandomHeight,int minHeightForLeaves,yarnwrap.util.math.intprovider.IntProvider bendLength) { this.wrapperContained = new net.minecraft.world.gen.trunk.BendingTrunkPlacer(baseHeight,firstRandomHeight,secondRandomHeight,minHeightForLeaves,bendLength.wrapperContained); }
// public yarnwrap.util.math.intprovider.IntProvider method_34372(yarnwrap.world.gen.trunk.BendingTrunkPlacer placer) { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.method_34372(placer.wrapperContained)); }
// public static yarnwrap.util.math.intprovider.IntProvider method_34372(yarnwrap.world.gen.trunk.BendingTrunkPlacer placer, ) { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.gen.trunk.BendingTrunkPlacer.method_34372(placer.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_34373(Object instance) { return wrapperContained.method_34373(instance); }
// public static com.mojang.datafixers.kinds.App method_34373(Object instance, ) { return net.minecraft.world.gen.trunk.BendingTrunkPlacer.method_34373(instance); }
// public java.lang.Integer method_34374(yarnwrap.world.gen.trunk.BendingTrunkPlacer placer) { return wrapperContained.method_34374(placer.wrapperContained); }
// public static java.lang.Integer method_34374(yarnwrap.world.gen.trunk.BendingTrunkPlacer placer, ) { return net.minecraft.world.gen.trunk.BendingTrunkPlacer.method_34374(placer.wrapperContained); }

}