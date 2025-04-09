package yarnwrap.client.render.model.json;
public class ModelOverride { public net.minecraft.client.render.model.json.ModelOverride wrapperContained; public ModelOverride(net.minecraft.client.render.model.json.ModelOverride wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier modelId() { return new yarnwrap.util.Identifier(wrapperContained.modelId); }
// public java.util.List conditions() { return wrapperContained.conditions; }
public java.util.stream.Stream streamConditions() { return wrapperContained.streamConditions(); }
public yarnwrap.util.Identifier getModelId() { return new yarnwrap.util.Identifier(wrapperContained.getModelId()); }

}