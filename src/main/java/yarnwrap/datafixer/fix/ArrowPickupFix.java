package yarnwrap.datafixer.fix;
public class ArrowPickupFix { public net.minecraft.datafixer.fix.ArrowPickupFix wrapperContained; public ArrowPickupFix(net.minecraft.datafixer.fix.ArrowPickupFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ArrowPickupFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ArrowPickupFix(outputSchema); }
// public com.mojang.datafixers.Typed update(com.mojang.datafixers.Typed typed) { return wrapperContained.update(typed); }
// public static com.mojang.datafixers.Typed update(com.mojang.datafixers.Typed typed, ) { return net.minecraft.datafixer.fix.ArrowPickupFix.update(typed); }
// public com.mojang.datafixers.Typed updateEntity(com.mojang.datafixers.Typed typed,java.lang.String choiceName,java.util.function.Function updater) { return wrapperContained.updateEntity(typed,choiceName,updater); }
// public static com.mojang.datafixers.Typed updateEntity(com.mojang.datafixers.Typed typed,java.lang.String choiceName,java.util.function.Function updater, ) { return net.minecraft.datafixer.fix.ArrowPickupFix.updateEntity(typed,choiceName,updater); }
// public com.mojang.serialization.Dynamic update(com.mojang.serialization.Dynamic arrowData) { return wrapperContained.update(arrowData); }
// public static com.mojang.serialization.Dynamic update(com.mojang.serialization.Dynamic arrowData, ) { return net.minecraft.datafixer.fix.ArrowPickupFix.update(arrowData); }
// public com.mojang.datafixers.Typed method_34687(java.util.function.Function t) { return wrapperContained.method_34687(t); }
// public static com.mojang.datafixers.Typed method_34687(java.util.function.Function t, ) { return net.minecraft.datafixer.fix.ArrowPickupFix.method_34687(t); }

}