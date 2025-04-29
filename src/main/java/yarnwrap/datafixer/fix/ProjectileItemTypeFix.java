package yarnwrap.datafixer.fix;
public class ProjectileItemTypeFix { public net.minecraft.datafixer.fix.ProjectileItemTypeFix wrapperContained; public ProjectileItemTypeFix(net.minecraft.datafixer.fix.ProjectileItemTypeFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String EMPTY_ID() { return wrapperContained.EMPTY_ID; }
// public void EMPTY_ID(java.lang.String value) { wrapperContained.EMPTY_ID = value; }
// public static java.lang.String EMPTY_ID() { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.EMPTY_ID; }
// public static void EMPTY_ID(java.lang.String value, ) { net.minecraft.datafixer.fix.ProjectileItemTypeFix.EMPTY_ID = value; }

public ProjectileItemTypeFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.ProjectileItemTypeFix(outputSchema); }
// public com.mojang.datafixers.Typed fixArrow(com.mojang.datafixers.Typed typed,com.mojang.datafixers.types.Type type) { return wrapperContained.fixArrow(typed,type); }
// public static com.mojang.datafixers.Typed fixArrow(com.mojang.datafixers.Typed typed,com.mojang.datafixers.types.Type type, ) { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.fixArrow(typed,type); }
// public java.lang.String getArrowId(com.mojang.serialization.Dynamic arrowData) { return wrapperContained.getArrowId(arrowData); }
// public static java.lang.String getArrowId(com.mojang.serialization.Dynamic arrowData, ) { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.getArrowId(arrowData); }
// public com.mojang.serialization.Dynamic createStack(com.mojang.serialization.Dynamic projectileData,java.lang.String id) { return wrapperContained.createStack(projectileData,id); }
// public static com.mojang.serialization.Dynamic createStack(com.mojang.serialization.Dynamic projectileData,java.lang.String id, ) { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.createStack(projectileData,id); }
// public java.util.function.Function createFixApplier(java.lang.String id,Object fixer) { return wrapperContained.createFixApplier(id,fixer); }
// public static java.util.function.Function createFixApplier(java.lang.String id,Object fixer, ) { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.createFixApplier(id,fixer); }
// public java.util.function.Function createFixApplier(java.lang.String id,Object fixer,com.mojang.datafixers.types.Type inputType,com.mojang.datafixers.types.Type outputType) { return wrapperContained.createFixApplier(id,fixer,inputType,outputType); }
// public static java.util.function.Function createFixApplier(java.lang.String id,Object fixer,com.mojang.datafixers.types.Type inputType,com.mojang.datafixers.types.Type outputType, ) { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.createFixApplier(id,fixer,inputType,outputType); }
// public com.mojang.datafixers.Typed fixSpectralArrow(com.mojang.datafixers.Typed typed,com.mojang.datafixers.types.Type type) { return wrapperContained.fixSpectralArrow(typed,type); }
// public static com.mojang.datafixers.Typed fixSpectralArrow(com.mojang.datafixers.Typed typed,com.mojang.datafixers.types.Type type, ) { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.fixSpectralArrow(typed,type); }
// public com.mojang.serialization.Dynamic method_54738(com.mojang.serialization.Dynamic data) { return wrapperContained.method_54738(data); }
// public static com.mojang.serialization.Dynamic method_54738(com.mojang.serialization.Dynamic data, ) { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.method_54738(data); }
// public com.mojang.datafixers.Typed fixTrident(com.mojang.datafixers.Typed typed,com.mojang.datafixers.types.Type type) { return wrapperContained.fixTrident(typed,type); }
// public static com.mojang.datafixers.Typed fixTrident(com.mojang.datafixers.Typed typed,com.mojang.datafixers.types.Type type, ) { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.fixTrident(typed,type); }
// public com.mojang.serialization.Dynamic method_54741(com.mojang.serialization.Dynamic data) { return wrapperContained.method_54741(data); }
// public static com.mojang.serialization.Dynamic method_54741(com.mojang.serialization.Dynamic data, ) { return net.minecraft.datafixer.fix.ProjectileItemTypeFix.method_54741(data); }

}