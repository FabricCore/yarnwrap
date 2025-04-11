package yarnwrap.entity.passive;
public class MooshroomEntity { public net.minecraft.entity.passive.MooshroomEntity wrapperContained; public MooshroomEntity(net.minecraft.entity.passive.MooshroomEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.entity.data.TrackedData value) { wrapperContained.TYPE = value.wrapperContained; }
// public java.util.UUID lightningId() { return wrapperContained.lightningId; }
// public void lightningId(java.util.UUID value) { wrapperContained.lightningId = value; }
// public int MUTATION_CHANCE() { return wrapperContained.MUTATION_CHANCE; }
// public void MUTATION_CHANCE(int value) { wrapperContained.MUTATION_CHANCE = value; }
// public java.lang.String STEW_EFFECTS_NBT_KEY() { return wrapperContained.STEW_EFFECTS_NBT_KEY; }
// public void STEW_EFFECTS_NBT_KEY(java.lang.String value) { wrapperContained.STEW_EFFECTS_NBT_KEY = value; }
// public yarnwrap.component.type.SuspiciousStewEffectsComponent stewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.stewEffects); }
// public void stewEffects(yarnwrap.component.type.SuspiciousStewEffectsComponent value) { wrapperContained.stewEffects = value.wrapperContained; }
// public Object chooseBabyType(yarnwrap.entity.passive.MooshroomEntity mooshroom) { return wrapperContained.chooseBabyType(mooshroom.wrapperContained); }
// public java.util.Optional getStewEffectFrom(yarnwrap.item.ItemStack flower) { return wrapperContained.getStewEffectFrom(flower.wrapperContained); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}