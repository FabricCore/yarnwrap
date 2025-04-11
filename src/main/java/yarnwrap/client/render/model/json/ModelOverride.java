package yarnwrap.client.render.model.json;
public class ModelOverride { public net.minecraft.client.render.model.json.ModelOverride wrapperContained; public ModelOverride(net.minecraft.client.render.model.json.ModelOverride wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier modelId() { return new yarnwrap.util.Identifier(wrapperContained.modelId); }
// public void modelId(yarnwrap.util.Identifier value) { wrapperContained.modelId = value.wrapperContained; }
// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
public java.util.stream.Stream streamConditions() { return wrapperContained.streamConditions(); }
public yarnwrap.util.Identifier getModelId() { return new yarnwrap.util.Identifier(wrapperContained.getModelId()); }

}