package yarnwrap.client.render.model.json;
public class ModelOverrideList { public net.minecraft.client.render.model.json.ModelOverrideList wrapperContained; public ModelOverrideList(net.minecraft.client.render.model.json.ModelOverrideList wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object overrides() { return wrapperContained.overrides; }
// // public void overrides(Object value) { wrapperContained.overrides = value; }
// // public static Object overrides() { return net.minecraft.client.render.model.json.ModelOverrideList.overrides; }
// // public static void overrides(Object value, ) { net.minecraft.client.render.model.json.ModelOverrideList.overrides = value; }

// public net.minecraft.util.Identifier[] conditionTypes() { return wrapperContained.conditionTypes; }
// public void conditionTypes(net.minecraft.util.Identifier[] value) { wrapperContained.conditionTypes = value; }
// public static net.minecraft.util.Identifier[] conditionTypes() { return net.minecraft.client.render.model.json.ModelOverrideList.conditionTypes; }
// public static void conditionTypes(net.minecraft.util.Identifier[] value, ) { net.minecraft.client.render.model.json.ModelOverrideList.conditionTypes = value; }

// public yarnwrap.client.render.model.json.ModelOverrideList EMPTY() { return new yarnwrap.client.render.model.json.ModelOverrideList(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.render.model.json.ModelOverrideList value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.render.model.json.ModelOverrideList EMPTY() { return new yarnwrap.client.render.model.json.ModelOverrideList(net.minecraft.client.render.model.json.ModelOverrideList.EMPTY); }
// public static void EMPTY(yarnwrap.client.render.model.json.ModelOverrideList value, ) { net.minecraft.client.render.model.json.ModelOverrideList.EMPTY = value.wrapperContained; }

public ModelOverrideList(yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.json.JsonUnbakedModel parent,java.util.List overrides) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelOverrideList(baker.wrapperContained,parent.wrapperContained,overrides); }
// public yarnwrap.client.render.model.BakedModel bakeOverridingModel(yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.json.JsonUnbakedModel parent,yarnwrap.client.render.model.json.ModelOverride override) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.bakeOverridingModel(baker.wrapperContained,parent.wrapperContained,override.wrapperContained)); }
// public static yarnwrap.client.render.model.BakedModel bakeOverridingModel(yarnwrap.client.render.model.Baker baker,yarnwrap.client.render.model.json.JsonUnbakedModel parent,yarnwrap.client.render.model.json.ModelOverride override, ) { return new yarnwrap.client.render.model.BakedModel(net.minecraft.client.render.model.json.ModelOverrideList.bakeOverridingModel(baker.wrapperContained,parent.wrapperContained,override.wrapperContained)); }
// public Object method_33696(it.unimi.dsi.fastutil.objects.Object2IntMap map,Object condition) { return wrapperContained.method_33696(map,condition); }
// public static Object method_33696(it.unimi.dsi.fastutil.objects.Object2IntMap map,Object condition, ) { return net.minecraft.client.render.model.json.ModelOverrideList.method_33696(map,condition); }
public yarnwrap.client.render.model.BakedModel apply(yarnwrap.client.render.model.BakedModel model,yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity entity,int seed) { return new yarnwrap.client.render.model.BakedModel(wrapperContained.apply(model.wrapperContained,stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed)); }
// public static yarnwrap.client.render.model.BakedModel apply(yarnwrap.client.render.model.BakedModel model,yarnwrap.item.ItemStack stack,yarnwrap.client.world.ClientWorld world,yarnwrap.entity.LivingEntity entity,int seed, ) { return new yarnwrap.client.render.model.BakedModel(net.minecraft.client.render.model.json.ModelOverrideList.apply(model.wrapperContained,stack.wrapperContained,world.wrapperContained,entity.wrapperContained,seed)); }

}