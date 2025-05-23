package yarnwrap.world.gen.root;
public class MangroveRootPlacer { public net.minecraft.world.gen.root.MangroveRootPlacer wrapperContained; public MangroveRootPlacer(net.minecraft.world.gen.root.MangroveRootPlacer wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.root.MangroveRootPlacer.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.root.MangroveRootPlacer.CODEC = value; }

// public yarnwrap.world.gen.root.MangroveRootPlacement mangroveRootPlacement() { return new yarnwrap.world.gen.root.MangroveRootPlacement(wrapperContained.mangroveRootPlacement); }
// public void mangroveRootPlacement(yarnwrap.world.gen.root.MangroveRootPlacement value) { wrapperContained.mangroveRootPlacement = value.wrapperContained; }
// public static yarnwrap.world.gen.root.MangroveRootPlacement mangroveRootPlacement() { return new yarnwrap.world.gen.root.MangroveRootPlacement(net.minecraft.world.gen.root.MangroveRootPlacer.mangroveRootPlacement); }
// public static void mangroveRootPlacement(yarnwrap.world.gen.root.MangroveRootPlacement value, ) { net.minecraft.world.gen.root.MangroveRootPlacer.mangroveRootPlacement = value.wrapperContained; }

public MangroveRootPlacer(yarnwrap.util.math.intprovider.IntProvider trunkOffsetY,yarnwrap.world.gen.stateprovider.BlockStateProvider rootProvider,java.util.Optional aboveRootPlacement,yarnwrap.world.gen.root.MangroveRootPlacement mangroveRootPlacement) { this.wrapperContained = new net.minecraft.world.gen.root.MangroveRootPlacer(trunkOffsetY.wrapperContained,rootProvider.wrapperContained,aboveRootPlacement,mangroveRootPlacement.wrapperContained); }
// public boolean canGrow(yarnwrap.world.TestableWorld world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.util.math.BlockPos origin,java.util.List offshootPositions,int rootLength) { return wrapperContained.canGrow(world.wrapperContained,random.wrapperContained,pos.wrapperContained,direction.wrapperContained,origin.wrapperContained,offshootPositions,rootLength); }
// public static boolean canGrow(yarnwrap.world.TestableWorld world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.util.math.BlockPos origin,java.util.List offshootPositions,int rootLength, ) { return net.minecraft.world.gen.root.MangroveRootPlacer.canGrow(world.wrapperContained,random.wrapperContained,pos.wrapperContained,direction.wrapperContained,origin.wrapperContained,offshootPositions,rootLength); }
// public boolean method_43169(yarnwrap.block.BlockState state) { return wrapperContained.method_43169(state.wrapperContained); }
// public static boolean method_43169(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.root.MangroveRootPlacer.method_43169(state.wrapperContained); }
// public java.util.List getOffshootPositions(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos origin) { return wrapperContained.getOffshootPositions(pos.wrapperContained,direction.wrapperContained,random.wrapperContained,origin.wrapperContained); }
// public static java.util.List getOffshootPositions(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos origin, ) { return net.minecraft.world.gen.root.MangroveRootPlacer.getOffshootPositions(pos.wrapperContained,direction.wrapperContained,random.wrapperContained,origin.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_43173(Object instance) { return wrapperContained.method_43173(instance); }
// public static com.mojang.datafixers.kinds.App method_43173(Object instance, ) { return net.minecraft.world.gen.root.MangroveRootPlacer.method_43173(instance); }
// public boolean method_43174(yarnwrap.block.BlockState state) { return wrapperContained.method_43174(state.wrapperContained); }
// public static boolean method_43174(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.root.MangroveRootPlacer.method_43174(state.wrapperContained); }
// public yarnwrap.world.gen.root.MangroveRootPlacement method_43180(yarnwrap.world.gen.root.MangroveRootPlacer rootPlacer) { return new yarnwrap.world.gen.root.MangroveRootPlacement(wrapperContained.method_43180(rootPlacer.wrapperContained)); }
// public static yarnwrap.world.gen.root.MangroveRootPlacement method_43180(yarnwrap.world.gen.root.MangroveRootPlacer rootPlacer, ) { return new yarnwrap.world.gen.root.MangroveRootPlacement(net.minecraft.world.gen.root.MangroveRootPlacer.method_43180(rootPlacer.wrapperContained)); }

}