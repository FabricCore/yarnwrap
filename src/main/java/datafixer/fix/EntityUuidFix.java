package yarnwrap.datafixer.fix;
public class EntityUuidFix { public net.minecraft.datafixer.fix.EntityUuidFix wrapperContained; public EntityUuidFix(net.minecraft.datafixer.fix.EntityUuidFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set RIDEABLE_TAMEABLES() { return wrapperContained.RIDEABLE_TAMEABLES; }
// public java.util.Set TAMEABLE_PETS() { return wrapperContained.TAMEABLE_PETS; }
// public java.util.Set BREEDABLES() { return wrapperContained.BREEDABLES; }
// public java.util.Set LEASHABLES() { return wrapperContained.LEASHABLES; }
// public java.util.Set OTHER_LIVINGS() { return wrapperContained.OTHER_LIVINGS; }
// public java.util.Set PROJECTILES() { return wrapperContained.PROJECTILES; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public com.mojang.serialization.Dynamic updateAngryAtMemory() { return wrapperContained.updateAngryAtMemory(); }
// public com.mojang.serialization.Dynamic updateEvokerFangs() { return wrapperContained.updateEvokerFangs(); }
// public com.mojang.serialization.Dynamic updateZombieVillager() { return wrapperContained.updateZombieVillager(); }
// public com.mojang.serialization.Dynamic updateAreaEffectCloud() { return wrapperContained.updateAreaEffectCloud(); }
// public com.mojang.serialization.Dynamic updateShulkerBullet() { return wrapperContained.updateShulkerBullet(); }
// public com.mojang.serialization.Dynamic updateItemEntity() { return wrapperContained.updateItemEntity(); }
// public com.mojang.serialization.Dynamic updateFox() { return wrapperContained.updateFox(); }
// public com.mojang.serialization.Dynamic updateZombifiedPiglin() { return wrapperContained.updateZombifiedPiglin(); }
// public com.mojang.serialization.Dynamic updateTameable() { return wrapperContained.updateTameable(); }
// public com.mojang.serialization.Dynamic updateBreedable() { return wrapperContained.updateBreedable(); }
// public com.mojang.serialization.Dynamic updateLeashable() { return wrapperContained.updateLeashable(); }
// public com.mojang.serialization.Dynamic updateLiving() { return wrapperContained.updateLiving(); }
// public com.mojang.serialization.Dynamic updateProjectile() { return wrapperContained.updateProjectile(); }
public com.mojang.serialization.Dynamic updateSelfUuid(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.updateSelfUuid(entityDynamic); }

}