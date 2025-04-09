package yarnwrap.datafixer.fix;
public class EntityCodSalmonFix { public net.minecraft.datafixer.fix.EntityCodSalmonFix wrapperContained; public EntityCodSalmonFix(net.minecraft.datafixer.fix.EntityCodSalmonFix wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map ENTITIES() { return wrapperContained.ENTITIES; }
public java.util.Map SPAWN_EGGS() { return wrapperContained.SPAWN_EGGS; }

}