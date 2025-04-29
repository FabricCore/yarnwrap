package yarnwrap.client.render.model.json;
public class ModelOverride { public net.minecraft.client.render.model.json.ModelOverride wrapperContained; public ModelOverride(net.minecraft.client.render.model.json.ModelOverride wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier modelId() { return new yarnwrap.util.Identifier(wrapperContained.modelId); }
// public void modelId(yarnwrap.util.Identifier value) { wrapperContained.modelId = value.wrapperContained; }
// public static yarnwrap.util.Identifier modelId() { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.json.ModelOverride.modelId); }
// public static void modelId(yarnwrap.util.Identifier value, ) { net.minecraft.client.render.model.json.ModelOverride.modelId = value.wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
// public static java.util.List conditions() { return net.minecraft.client.render.model.json.ModelOverride.conditions; }
// public static void conditions(java.util.List value, ) { net.minecraft.client.render.model.json.ModelOverride.conditions = value; }

public ModelOverride(yarnwrap.util.Identifier modelId,java.util.List conditions) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelOverride(modelId.wrapperContained,conditions); }
public java.util.stream.Stream streamConditions() { return wrapperContained.streamConditions(); }
// public static java.util.stream.Stream streamConditions() { return net.minecraft.client.render.model.json.ModelOverride.streamConditions(); }
public yarnwrap.util.Identifier getModelId() { return new yarnwrap.util.Identifier(wrapperContained.getModelId()); }
// public static yarnwrap.util.Identifier getModelId() { return new yarnwrap.util.Identifier(net.minecraft.client.render.model.json.ModelOverride.getModelId()); }

}