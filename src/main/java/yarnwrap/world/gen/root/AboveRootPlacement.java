package yarnwrap.world.gen.root;
public class AboveRootPlacement { public net.minecraft.world.gen.root.AboveRootPlacement wrapperContained; public AboveRootPlacement(net.minecraft.world.gen.root.AboveRootPlacement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.lang.Float method_43299(yarnwrap.world.gen.root.AboveRootPlacement aboveRootPlacement) { return wrapperContained.method_43299(aboveRootPlacement.wrapperContained); }
// public yarnwrap.world.gen.stateprovider.BlockStateProvider method_43300(yarnwrap.world.gen.root.AboveRootPlacement aboveRootPlacement) { return new yarnwrap.world.gen.stateprovider.BlockStateProvider(wrapperContained.method_43300(aboveRootPlacement.wrapperContained)); }

}