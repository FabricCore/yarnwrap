package yarnwrap.datafixer.fix;
public class ArrowStoredWeaponFix { public net.minecraft.datafixer.fix.ArrowStoredWeaponFix wrapperContained; public ArrowStoredWeaponFix(net.minecraft.datafixer.fix.ArrowStoredWeaponFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ArrowStoredWeaponFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ArrowStoredWeaponFix(outputSchema); }
// public java.util.function.Function fixFor(java.lang.String entityId) { return wrapperContained.fixFor(entityId); }
// public java.util.function.Function method_59912(java.lang.String name) { return wrapperContained.method_59912(name); }

}