package yarnwrap.entity.effect;
public class StatusEffects { public net.minecraft.entity.effect.StatusEffects wrapperContained; public StatusEffects(net.minecraft.entity.effect.StatusEffects wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DARKNESS_PADDING_DURATION() { return wrapperContained.DARKNESS_PADDING_DURATION; }
// public void DARKNESS_PADDING_DURATION(int value) { wrapperContained.DARKNESS_PADDING_DURATION = value; }
public yarnwrap.registry.entry.RegistryEntry registerAndGetDefault(yarnwrap.registry.Registry registry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.registerAndGetDefault(registry.wrapperContained)); }
// public yarnwrap.registry.entry.RegistryEntry register(java.lang.String id,yarnwrap.entity.effect.StatusEffect statusEffect) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.register(id,statusEffect.wrapperContained)); }

}