package yarnwrap.datafixer.fix;
public class EntityZombifiedPiglinRenameFix { public net.minecraft.datafixer.fix.EntityZombifiedPiglinRenameFix wrapperContained; public EntityZombifiedPiglinRenameFix(net.minecraft.datafixer.fix.EntityZombifiedPiglinRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RENAMES() { return wrapperContained.RENAMES; }
// public void RENAMES(java.util.Map value) { wrapperContained.RENAMES = value; }
public static java.util.Map RENAMES() { return net.minecraft.datafixer.fix.EntityZombifiedPiglinRenameFix.RENAMES; }
// public static void RENAMES(java.util.Map value, ) { net.minecraft.datafixer.fix.EntityZombifiedPiglinRenameFix.RENAMES = value; }

public EntityZombifiedPiglinRenameFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityZombifiedPiglinRenameFix(outputSchema); }

}