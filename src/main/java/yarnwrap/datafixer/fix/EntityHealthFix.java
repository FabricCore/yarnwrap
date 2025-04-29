package yarnwrap.datafixer.fix;
public class EntityHealthFix { public net.minecraft.datafixer.fix.EntityHealthFix wrapperContained; public EntityHealthFix(net.minecraft.datafixer.fix.EntityHealthFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set ENTITIES() { return wrapperContained.ENTITIES; }
// public void ENTITIES(java.util.Set value) { wrapperContained.ENTITIES = value; }
// public static java.util.Set ENTITIES() { return net.minecraft.datafixer.fix.EntityHealthFix.ENTITIES; }
// public static void ENTITIES(java.util.Set value, ) { net.minecraft.datafixer.fix.EntityHealthFix.ENTITIES = value; }

public EntityHealthFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityHealthFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic fixHealth(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.fixHealth(entityDynamic); }
// public static com.mojang.serialization.Dynamic fixHealth(com.mojang.serialization.Dynamic entityDynamic, ) { return net.minecraft.datafixer.fix.EntityHealthFix.fixHealth(entityDynamic); }
// public com.mojang.datafixers.Typed method_15705(com.mojang.datafixers.Typed entityTyped) { return wrapperContained.method_15705(entityTyped); }
// public static com.mojang.datafixers.Typed method_15705(com.mojang.datafixers.Typed entityTyped, ) { return net.minecraft.datafixer.fix.EntityHealthFix.method_15705(entityTyped); }

}