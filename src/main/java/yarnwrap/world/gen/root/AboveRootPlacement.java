package yarnwrap.world.gen.root;
public class AboveRootPlacement { public net.minecraft.world.gen.root.AboveRootPlacement wrapperContained; public AboveRootPlacement(net.minecraft.world.gen.root.AboveRootPlacement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}