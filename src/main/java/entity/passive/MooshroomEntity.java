package yarnwrap.entity.passive;
public class MooshroomEntity { public net.minecraft.entity.passive.MooshroomEntity wrapperContained; public MooshroomEntity(net.minecraft.entity.passive.MooshroomEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TYPE); }
// public java.util.UUID lightningId() { return wrapperContained.lightningId; }
// public int MUTATION_CHANCE() { return wrapperContained.MUTATION_CHANCE; }
// public java.lang.String STEW_EFFECTS_NBT_KEY() { return wrapperContained.STEW_EFFECTS_NBT_KEY; }
// public yarnwrap.component.type.SuspiciousStewEffectsComponent stewEffects() { return new yarnwrap.component.type.SuspiciousStewEffectsComponent(wrapperContained.stewEffects); }
// public Object chooseBabyType(yarnwrap.entity.passive.MooshroomEntity mooshroom) { return wrapperContained.chooseBabyType(mooshroom.wrapperContained); }
// public java.util.Optional getStewEffectFrom(yarnwrap.item.ItemStack flower) { return wrapperContained.getStewEffectFrom(flower.wrapperContained); }
public boolean canSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason spawnReason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canSpawn(type.wrapperContained,world.wrapperContained,spawnReason.wrapperContained,pos.wrapperContained,random.wrapperContained); }

}