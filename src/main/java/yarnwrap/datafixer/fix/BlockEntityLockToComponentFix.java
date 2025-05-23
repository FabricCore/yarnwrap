package yarnwrap.datafixer.fix;
public class BlockEntityLockToComponentFix { public net.minecraft.datafixer.fix.BlockEntityLockToComponentFix wrapperContained; public BlockEntityLockToComponentFix(net.minecraft.datafixer.fix.BlockEntityLockToComponentFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BlockEntityLockToComponentFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.BlockEntityLockToComponentFix(outputSchema); }
// public com.mojang.datafixers.Typed method_65334(com.mojang.datafixers.Typed typed) { return wrapperContained.method_65334(typed); }
// public static com.mojang.datafixers.Typed method_65334(com.mojang.datafixers.Typed typed, ) { return net.minecraft.datafixer.fix.BlockEntityLockToComponentFix.method_65334(typed); }
// public com.mojang.serialization.Dynamic method_65335(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_65335(dynamic); }
// public static com.mojang.serialization.Dynamic method_65335(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.BlockEntityLockToComponentFix.method_65335(dynamic); }

}