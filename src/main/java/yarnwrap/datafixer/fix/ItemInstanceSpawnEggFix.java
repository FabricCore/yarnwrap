package yarnwrap.datafixer.fix;
public class ItemInstanceSpawnEggFix { public net.minecraft.datafixer.fix.ItemInstanceSpawnEggFix wrapperContained; public ItemInstanceSpawnEggFix(net.minecraft.datafixer.fix.ItemInstanceSpawnEggFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String spawnEggId() { return wrapperContained.spawnEggId; }
// public void spawnEggId(java.lang.String value) { wrapperContained.spawnEggId = value; }
// public static java.lang.String spawnEggId() { return net.minecraft.datafixer.fix.ItemInstanceSpawnEggFix.spawnEggId; }
// public static void spawnEggId(java.lang.String value, ) { net.minecraft.datafixer.fix.ItemInstanceSpawnEggFix.spawnEggId = value; }

// public java.util.Map ENTITY_SPAWN_EGGS() { return wrapperContained.ENTITY_SPAWN_EGGS; }
// public void ENTITY_SPAWN_EGGS(java.util.Map value) { wrapperContained.ENTITY_SPAWN_EGGS = value; }
// public static java.util.Map ENTITY_SPAWN_EGGS() { return net.minecraft.datafixer.fix.ItemInstanceSpawnEggFix.ENTITY_SPAWN_EGGS; }
// public static void ENTITY_SPAWN_EGGS(java.util.Map value, ) { net.minecraft.datafixer.fix.ItemInstanceSpawnEggFix.ENTITY_SPAWN_EGGS = value; }

public ItemInstanceSpawnEggFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType,java.lang.String spawnEggId) { this.wrapperContained = new net.minecraft.datafixer.fix.ItemInstanceSpawnEggFix(outputSchema,changesType,spawnEggId); }
// public com.mojang.datafixers.Typed method_5046(com.mojang.datafixers.OpticFinder stack) { return wrapperContained.method_5046(stack); }
// public static com.mojang.datafixers.Typed method_5046(com.mojang.datafixers.OpticFinder stack, ) { return net.minecraft.datafixer.fix.ItemInstanceSpawnEggFix.method_5046(stack); }
// public void method_5047(java.util.HashMap map) { wrapperContained.method_5047(map); }
// public static void method_5047(java.util.HashMap map, ) { net.minecraft.datafixer.fix.ItemInstanceSpawnEggFix.method_5047(map); }

}