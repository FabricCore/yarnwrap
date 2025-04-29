package yarnwrap.datafixer.fix;
public class EmptyItemInHotbarFix { public net.minecraft.datafixer.fix.EmptyItemInHotbarFix wrapperContained; public EmptyItemInHotbarFix(net.minecraft.datafixer.fix.EmptyItemInHotbarFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EmptyItemInHotbarFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EmptyItemInHotbarFix(outputSchema); }
// public com.mojang.datafixers.Typed method_57205(com.mojang.datafixers.OpticFinder hotbarTyped) { return wrapperContained.method_57205(hotbarTyped); }
// public static com.mojang.datafixers.Typed method_57205(com.mojang.datafixers.OpticFinder hotbarTyped, ) { return net.minecraft.datafixer.fix.EmptyItemInHotbarFix.method_57205(hotbarTyped); }

}