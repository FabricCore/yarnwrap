package yarnwrap.client.render.model.json;
public class ModelOverrideList { public net.minecraft.client.render.model.json.ModelOverrideList wrapperContained; public ModelOverrideList(net.minecraft.client.render.model.json.ModelOverrideList wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object overrides() { return wrapperContained.overrides; }
// // public void overrides(Object value) { wrapperContained.overrides = value; }
// public net.minecraft.util.Identifier[] conditionTypes() { return wrapperContained.conditionTypes; }
// public void conditionTypes(net.minecraft.util.Identifier[] value) { wrapperContained.conditionTypes = value; }
public yarnwrap.client.render.model.json.ModelOverrideList EMPTY() { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.render.model.json.ModelOverrideList value) { wrapperContained.EMPTY = value.wrapperContained; }
// public yarnwrap.client.render.model.BakedModel bakeOverridingModel(yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.json.JsonUnbakedModel parent,yarnwrap.client.render.model.json.ModelOverride override) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.bakeOverridingModel(baker.wrapperContained,parent.wrapperContained,override.wrapperContained)); }
public yarnwrap.client.render.model.BakedModel apply(yarnwrap.client.render.model.BakedModel model,yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity entity,int seed) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.apply(model.wrapperContained,stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed)); }

}