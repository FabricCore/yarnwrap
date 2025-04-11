package yarnwrap.client.item;
public class ModelPredicateProviderRegistry { public net.minecraft.client.item.ModelPredicateProviderRegistry wrapperContained; public ModelPredicateProviderRegistry(net.minecraft.client.item.ModelPredicateProviderRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map GLOBAL() { return wrapperContained.GLOBAL; }
// public void GLOBAL(java.util.Map value) { wrapperContained.GLOBAL = value; }
// public yarnwrap.util.Identifier DAMAGED_ID() { return new yarnwrap.util.Identifier(wrapperContained.DAMAGED_ID); }
// public void DAMAGED_ID(yarnwrap.util.Identifier value) { wrapperContained.DAMAGED_ID = value.wrapperContained; }
// public yarnwrap.util.Identifier DAMAGE_ID() { return new yarnwrap.util.Identifier(wrapperContained.DAMAGE_ID); }
// public void DAMAGE_ID(yarnwrap.util.Identifier value) { wrapperContained.DAMAGE_ID = value.wrapperContained; }
// public yarnwrap.client.item.ClampedModelPredicateProvider DAMAGED_PROVIDER() { return new yarnwrap.client.item.ClampedModelPredicateProvider(wrapperContained.DAMAGED_PROVIDER); }
// public void DAMAGED_PROVIDER(yarnwrap.client.item.ClampedModelPredicateProvider value) { wrapperContained.DAMAGED_PROVIDER = value.wrapperContained; }
// public yarnwrap.client.item.ClampedModelPredicateProvider DAMAGE_PROVIDER() { return new yarnwrap.client.item.ClampedModelPredicateProvider(wrapperContained.DAMAGE_PROVIDER); }
// public void DAMAGE_PROVIDER(yarnwrap.client.item.ClampedModelPredicateProvider value) { wrapperContained.DAMAGE_PROVIDER = value.wrapperContained; }
// public java.util.Map ITEM_SPECIFIC() { return wrapperContained.ITEM_SPECIFIC; }
// public void ITEM_SPECIFIC(java.util.Map value) { wrapperContained.ITEM_SPECIFIC = value; }
public yarnwrap.client.item.ModelPredicateProvider get(yarnwrap.item.ItemStack stack,yarnwrap.util.Identifier id) { return new yarnwrap.client.item.ModelPredicateProvider(wrapperContained.get(stack.wrapperContained,id.wrapperContained)); }
// public void register(yarnwrap.item.Item item,yarnwrap.util.Identifier id,yarnwrap.client.item.ClampedModelPredicateProvider provider) { wrapperContained.register(item.wrapperContained,id.wrapperContained,provider.wrapperContained); }
// public yarnwrap.client.item.ClampedModelPredicateProvider register(yarnwrap.util.Identifier id,yarnwrap.client.item.ClampedModelPredicateProvider provider) { return new yarnwrap.client.item.ClampedModelPredicateProvider(wrapperContained.register(id.wrapperContained,provider.wrapperContained)); }
// public void registerCustomModelData(yarnwrap.client.item.ModelPredicateProvider provider) { wrapperContained.registerCustomModelData(provider.wrapperContained); }

}