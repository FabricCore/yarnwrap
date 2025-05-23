package yarnwrap.datafixer.fix;
public class ContainerBlockEntityLockPredicateFix { public net.minecraft.datafixer.fix.ContainerBlockEntityLockPredicateFix wrapperContained; public ContainerBlockEntityLockPredicateFix(net.minecraft.datafixer.fix.ContainerBlockEntityLockPredicateFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ContainerBlockEntityLockPredicateFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ContainerBlockEntityLockPredicateFix(outputSchema); }
// public com.mojang.datafixers.Typed fixLock(com.mojang.datafixers.Typed typed) { return wrapperContained.fixLock(typed); }
// public static com.mojang.datafixers.Typed fixLock(com.mojang.datafixers.Typed typed, ) { return net.minecraft.datafixer.fix.ContainerBlockEntityLockPredicateFix.fixLock(typed); }
// public com.mojang.serialization.Dynamic method_64410(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.method_64410(dynamic); }
// public static com.mojang.serialization.Dynamic method_64410(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.ContainerBlockEntityLockPredicateFix.method_64410(dynamic); }

}