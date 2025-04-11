package yarnwrap.client.render.model;
public class MultipartUnbakedModel { public net.minecraft.client.render.model.MultipartUnbakedModel wrapperContained; public MultipartUnbakedModel(net.minecraft.client.render.model.MultipartUnbakedModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.StateManager stateFactory() { return new yarnwrap.state.StateManager(wrapperContained.stateFactory); }
// public void stateFactory(yarnwrap.state.StateManager value) { wrapperContained.stateFactory = value.wrapperContained; }
// public java.util.List components() { return wrapperContained.components; }
// public void components(java.util.List value) { wrapperContained.components = value; }
public java.util.List getComponents() { return wrapperContained.getComponents(); }
public java.util.Set getModels() { return wrapperContained.getModels(); }

}