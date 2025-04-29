package yarnwrap.client.render.model.json;
public class MultipartModelComponent { public net.minecraft.client.render.model.json.MultipartModelComponent wrapperContained; public MultipartModelComponent(net.minecraft.client.render.model.json.MultipartModelComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.model.json.MultipartModelSelector selector() { return new yarnwrap.client.render.model.json.MultipartModelSelector(wrapperContained.selector); }
// public void selector(yarnwrap.client.render.model.json.MultipartModelSelector value) { wrapperContained.selector = value.wrapperContained; }
// public static yarnwrap.client.render.model.json.MultipartModelSelector selector() { return new yarnwrap.client.render.model.json.MultipartModelSelector(net.minecraft.client.render.model.json.MultipartModelComponent.selector); }
// public static void selector(yarnwrap.client.render.model.json.MultipartModelSelector value, ) { net.minecraft.client.render.model.json.MultipartModelComponent.selector = value.wrapperContained; }

// public yarnwrap.client.render.model.json.WeightedUnbakedModel model() { return new yarnwrap.client.render.model.json.WeightedUnbakedModel(wrapperContained.model); }
// public void model(yarnwrap.client.render.model.json.WeightedUnbakedModel value) { wrapperContained.model = value.wrapperContained; }
// public static yarnwrap.client.render.model.json.WeightedUnbakedModel model() { return new yarnwrap.client.render.model.json.WeightedUnbakedModel(net.minecraft.client.render.model.json.MultipartModelComponent.model); }
// public static void model(yarnwrap.client.render.model.json.WeightedUnbakedModel value, ) { net.minecraft.client.render.model.json.MultipartModelComponent.model = value.wrapperContained; }

public MultipartModelComponent(yarnwrap.client.render.model.json.MultipartModelSelector selector,yarnwrap.client.render.model.json.WeightedUnbakedModel model) { this.wrapperContained = new net.minecraft.client.render.model.json.MultipartModelComponent(selector.wrapperContained,model.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.json.MultipartModelComponent.equals(o); }
public yarnwrap.client.render.model.json.WeightedUnbakedModel getModel() { return new yarnwrap.client.render.model.json.WeightedUnbakedModel(wrapperContained.getModel()); }
// public static yarnwrap.client.render.model.json.WeightedUnbakedModel getModel() { return new yarnwrap.client.render.model.json.WeightedUnbakedModel(net.minecraft.client.render.model.json.MultipartModelComponent.getModel()); }
public java.util.function.Predicate getPredicate(yarnwrap.state.StateManager stateFactory) { return wrapperContained.getPredicate(stateFactory.wrapperContained); }
// public static java.util.function.Predicate getPredicate(yarnwrap.state.StateManager stateFactory, ) { return net.minecraft.client.render.model.json.MultipartModelComponent.getPredicate(stateFactory.wrapperContained); }

}