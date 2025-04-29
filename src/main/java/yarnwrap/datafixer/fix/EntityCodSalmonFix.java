package yarnwrap.datafixer.fix;
public class EntityCodSalmonFix { public net.minecraft.datafixer.fix.EntityCodSalmonFix wrapperContained; public EntityCodSalmonFix(net.minecraft.datafixer.fix.EntityCodSalmonFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map ENTITIES() { return wrapperContained.ENTITIES; }
// public void ENTITIES(java.util.Map value) { wrapperContained.ENTITIES = value; }
public static java.util.Map ENTITIES() { return net.minecraft.datafixer.fix.EntityCodSalmonFix.ENTITIES; }
// public static void ENTITIES(java.util.Map value, ) { net.minecraft.datafixer.fix.EntityCodSalmonFix.ENTITIES = value; }

// public java.util.Map SPAWN_EGGS() { return wrapperContained.SPAWN_EGGS; }
// public void SPAWN_EGGS(java.util.Map value) { wrapperContained.SPAWN_EGGS = value; }
public static java.util.Map SPAWN_EGGS() { return net.minecraft.datafixer.fix.EntityCodSalmonFix.SPAWN_EGGS; }
// public static void SPAWN_EGGS(java.util.Map value, ) { net.minecraft.datafixer.fix.EntityCodSalmonFix.SPAWN_EGGS = value; }

public EntityCodSalmonFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityCodSalmonFix(outputSchema,changesType); }

}