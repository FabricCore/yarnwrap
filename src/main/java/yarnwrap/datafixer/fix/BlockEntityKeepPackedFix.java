package yarnwrap.datafixer.fix;
public class BlockEntityKeepPackedFix { public net.minecraft.datafixer.fix.BlockEntityKeepPackedFix wrapperContained; public BlockEntityKeepPackedFix(net.minecraft.datafixer.fix.BlockEntityKeepPackedFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockEntityKeepPackedFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityKeepPackedFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic keepPacked() { return wrapperContained.keepPacked(); }
// public static com.mojang.serialization.Dynamic keepPacked() { return net.minecraft.datafixer.fix.BlockEntityKeepPackedFix.keepPacked(); }

}