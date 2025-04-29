package yarnwrap.client.render.model;
public class MultipartUnbakedModel { public net.minecraft.client.render.model.MultipartUnbakedModel wrapperContained; public MultipartUnbakedModel(net.minecraft.client.render.model.MultipartUnbakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.StateManager stateFactory() { return new yarnwrap.state.StateManager(wrapperContained.stateFactory); }
// public void stateFactory(yarnwrap.state.StateManager value) { wrapperContained.stateFactory = value.wrapperContained; }
// public static yarnwrap.state.StateManager stateFactory() { return new yarnwrap.state.StateManager(net.minecraft.client.render.model.MultipartUnbakedModel.stateFactory); }
// public static void stateFactory(yarnwrap.state.StateManager value, ) { net.minecraft.client.render.model.MultipartUnbakedModel.stateFactory = value.wrapperContained; }

// public java.util.List components() { return wrapperContained.components; }
// public void components(java.util.List value) { wrapperContained.components = value; }
// public static java.util.List components() { return net.minecraft.client.render.model.MultipartUnbakedModel.components; }
// public static void components(java.util.List value, ) { net.minecraft.client.render.model.MultipartUnbakedModel.components = value; }

public MultipartUnbakedModel(yarnwrap.state.StateManager stateFactory,java.util.List components) { this.wrapperContained = new net.minecraft.client.render.model.MultipartUnbakedModel(stateFactory.wrapperContained,components); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.render.model.MultipartUnbakedModel.equals(o); }
// public java.util.stream.Stream method_3518(yarnwrap.client.render.model.json.MultipartModelComponent component) { return wrapperContained.method_3518(component.wrapperContained); }
// public static java.util.stream.Stream method_3518(yarnwrap.client.render.model.json.MultipartModelComponent component, ) { return net.minecraft.client.render.model.MultipartUnbakedModel.method_3518(component.wrapperContained); }
public java.util.List getComponents() { return wrapperContained.getComponents(); }
// public static java.util.List getComponents() { return net.minecraft.client.render.model.MultipartUnbakedModel.getComponents(); }
public java.util.Set getModels() { return wrapperContained.getModels(); }
// public static java.util.Set getModels() { return net.minecraft.client.render.model.MultipartUnbakedModel.getModels(); }
// public void method_45789(java.util.function.Function component) { wrapperContained.method_45789(component); }
// public static void method_45789(java.util.function.Function component, ) { net.minecraft.client.render.model.MultipartUnbakedModel.method_45789(component); }

}