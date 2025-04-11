package yarnwrap.datafixer.fix;
public class EntityProjectileOwnerFix { public net.minecraft.datafixer.fix.EntityProjectileOwnerFix wrapperContained; public EntityProjectileOwnerFix(net.minecraft.datafixer.fix.EntityProjectileOwnerFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityProjectileOwnerFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityProjectileOwnerFix(outputSchema); }
// public int[] makeUuidArray(long most,long least) { return wrapperContained.makeUuidArray(most,least); }
// public com.mojang.serialization.Dynamic moveFlatOwnerMostLeastToArray(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.moveFlatOwnerMostLeastToArray(entityDynamic); }
// public com.mojang.serialization.Dynamic insertOwnerUuidArray(com.mojang.serialization.Dynamic entityDynamic,long most,long least) { return wrapperContained.insertOwnerUuidArray(entityDynamic,most,least); }
// public com.mojang.datafixers.Typed fixEntities(com.mojang.datafixers.Typed entityTyped) { return wrapperContained.fixEntities(entityTyped); }
// public com.mojang.datafixers.Typed update(com.mojang.datafixers.Typed entityTyped,java.lang.String matchId,java.util.function.Function fixer) { return wrapperContained.update(entityTyped,matchId,fixer); }
// public com.mojang.serialization.Dynamic moveNestedOwnerMostLeastToArray(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.moveNestedOwnerMostLeastToArray(entityDynamic); }
// public com.mojang.serialization.Dynamic renamePotionToItem(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.renamePotionToItem(entityDynamic); }
// public com.mojang.serialization.Dynamic moveOwnerToArray(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.moveOwnerToArray(entityDynamic); }

}