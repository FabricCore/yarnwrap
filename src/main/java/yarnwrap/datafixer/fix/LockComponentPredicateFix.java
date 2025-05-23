package yarnwrap.datafixer.fix;
public class LockComponentPredicateFix { public net.minecraft.datafixer.fix.LockComponentPredicateFix wrapperContained; public LockComponentPredicateFix(net.minecraft.datafixer.fix.LockComponentPredicateFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.escape.Escaper ESCAPER() { return wrapperContained.ESCAPER; }
// public void ESCAPER(com.google.common.escape.Escaper value) { wrapperContained.ESCAPER = value; }
public static com.google.common.escape.Escaper ESCAPER() { return net.minecraft.datafixer.fix.LockComponentPredicateFix.ESCAPER; }
// public static void ESCAPER(com.google.common.escape.Escaper value, ) { net.minecraft.datafixer.fix.LockComponentPredicateFix.ESCAPER = value; }

public LockComponentPredicateFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.LockComponentPredicateFix(outputSchema); }
// public com.mojang.serialization.Dynamic fixLock(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.fixLock(dynamic); }
// public static com.mojang.serialization.Dynamic fixLock(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.LockComponentPredicateFix.fixLock(dynamic); }

}