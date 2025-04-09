package yarnwrap.predicate.item;
public class ItemSubPredicateTypes { public net.minecraft.predicate.item.ItemSubPredicateTypes wrapperContained; public ItemSubPredicateTypes(net.minecraft.predicate.item.ItemSubPredicateTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object register(java.lang.String id,com.mojang.serialization.Codec codec) { return wrapperContained.register(id,codec); }
public Object getDefault(yarnwrap.registry.Registry registry) { return wrapperContained.getDefault(registry.wrapperContained); }

}