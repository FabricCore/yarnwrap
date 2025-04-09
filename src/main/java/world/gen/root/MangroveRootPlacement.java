package yarnwrap.world.gen.root;
public class MangroveRootPlacement { public net.minecraft.world.gen.root.MangroveRootPlacement wrapperContained; public MangroveRootPlacement(net.minecraft.world.gen.root.MangroveRootPlacement wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}