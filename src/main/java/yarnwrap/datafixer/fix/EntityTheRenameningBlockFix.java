package yarnwrap.datafixer.fix;
public class EntityTheRenameningBlockFix { public net.minecraft.datafixer.fix.EntityTheRenameningBlockFix wrapperContained; public EntityTheRenameningBlockFix(net.minecraft.datafixer.fix.EntityTheRenameningBlockFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String BRED_PREFIX() { return wrapperContained.BRED_PREFIX; }
// public void BRED_PREFIX(java.lang.String value) { wrapperContained.BRED_PREFIX = value; }
// public static java.lang.String BRED_PREFIX() { return net.minecraft.datafixer.fix.EntityTheRenameningBlockFix.BRED_PREFIX; }
// public static void BRED_PREFIX(java.lang.String value, ) { net.minecraft.datafixer.fix.EntityTheRenameningBlockFix.BRED_PREFIX = value; }

// public java.util.Map ENTITIES() { return wrapperContained.ENTITIES; }
// public void ENTITIES(java.util.Map value) { wrapperContained.ENTITIES = value; }
public static java.util.Map ENTITIES() { return net.minecraft.datafixer.fix.EntityTheRenameningBlockFix.ENTITIES; }
// public static void ENTITIES(java.util.Map value, ) { net.minecraft.datafixer.fix.EntityTheRenameningBlockFix.ENTITIES = value; }

// public java.util.Map BLOCKS() { return wrapperContained.BLOCKS; }
// public void BLOCKS(java.util.Map value) { wrapperContained.BLOCKS = value; }
public static java.util.Map BLOCKS() { return net.minecraft.datafixer.fix.EntityTheRenameningBlockFix.BLOCKS; }
// public static void BLOCKS(java.util.Map value, ) { net.minecraft.datafixer.fix.EntityTheRenameningBlockFix.BLOCKS = value; }

// public java.util.Map ITEMS() { return wrapperContained.ITEMS; }
// public void ITEMS(java.util.Map value) { wrapperContained.ITEMS = value; }
public static java.util.Map ITEMS() { return net.minecraft.datafixer.fix.EntityTheRenameningBlockFix.ITEMS; }
// public static void ITEMS(java.util.Map value, ) { net.minecraft.datafixer.fix.EntityTheRenameningBlockFix.ITEMS = value; }

public EntityTheRenameningBlockFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityTheRenameningBlockFix(outputSchema,changesType); }

}