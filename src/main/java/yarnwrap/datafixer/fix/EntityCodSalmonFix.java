package yarnwrap.datafixer.fix;
public class EntityCodSalmonFix { public net.minecraft.datafixer.fix.EntityCodSalmonFix wrapperContained; public EntityCodSalmonFix(net.minecraft.datafixer.fix.EntityCodSalmonFix wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map ENTITIES() { return wrapperContained.ENTITIES; }
// public void ENTITIES(java.util.Map value) { wrapperContained.ENTITIES = value; }
public java.util.Map SPAWN_EGGS() { return wrapperContained.SPAWN_EGGS; }
// public void SPAWN_EGGS(java.util.Map value) { wrapperContained.SPAWN_EGGS = value; }

}