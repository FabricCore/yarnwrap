package yarnwrap.client.item;
public class ModelPredicateProviderRegistry { public net.minecraft.client.item.ModelPredicateProviderRegistry wrapperContained; public ModelPredicateProviderRegistry(net.minecraft.client.item.ModelPredicateProviderRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map GLOBAL() { return wrapperContained.GLOBAL; }
// public yarnwrap.util.Identifier DAMAGED_ID() { return new yarnwrap.util.Identifier(wrapperContained.DAMAGED_ID); }
// public yarnwrap.util.Identifier DAMAGE_ID() { return new yarnwrap.util.Identifier(wrapperContained.DAMAGE_ID); }
// public yarnwrap.client.item.ClampedModelPredicateProvider DAMAGED_PROVIDER() { return new yarnwrap.client.item.ClampedModelPredicateProvider(wrapperContained.DAMAGED_PROVIDER); }
// public yarnwrap.client.item.ClampedModelPredicateProvider DAMAGE_PROVIDER() { return new yarnwrap.client.item.ClampedModelPredicateProvider(wrapperContained.DAMAGE_PROVIDER); }
// public java.util.Map ITEM_SPECIFIC() { return wrapperContained.ITEM_SPECIFIC; }
public yarnwrap.client.item.ModelPredicateProvider get(yarnwrap.item.ItemStack stack,yarnwrap.util.Identifier id) { return new yarnwrap.client.item.ModelPredicateProvider(wrapperContained.get(stack.wrapperContained,id.wrapperContained)); }
// public void register(yarnwrap.item.Item item,yarnwrap.util.Identifier id,yarnwrap.client.item.ClampedModelPredicateProvider provider) { wrapperContained.register(item.wrapperContained,id.wrapperContained,provider.wrapperContained); }
// public yarnwrap.client.item.ClampedModelPredicateProvider register(yarnwrap.util.Identifier id,yarnwrap.client.item.ClampedModelPredicateProvider provider) { return new yarnwrap.client.item.ClampedModelPredicateProvider(wrapperContained.register(id.wrapperContained,provider.wrapperContained)); }
// public void registerCustomModelData(yarnwrap.client.item.ModelPredicateProvider provider) { wrapperContained.registerCustomModelData(provider.wrapperContained); }

}