package yarnwrap.client.render.model.json;
public class AndMultipartModelSelector { public net.minecraft.client.render.model.json.AndMultipartModelSelector wrapperContained; public AndMultipartModelSelector(net.minecraft.client.render.model.json.AndMultipartModelSelector wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String KEY() { return wrapperContained.KEY; }
// public void KEY(java.lang.String value) { wrapperContained.KEY = value; }
// public java.lang.Iterable selectors() { return wrapperContained.selectors; }
// public void selectors(java.lang.Iterable value) { wrapperContained.selectors = value; }
public AndMultipartModelSelector(java.lang.Iterable selectors) { this.wrapperContained = new net.minecraft.client.render.model.json.AndMultipartModelSelector(selectors); }
// public boolean method_3506(java.util.List state) { return wrapperContained.method_3506(state); }
// public boolean method_3507(yarnwrap.block.BlockState predicate) { return wrapperContained.method_3507(predicate.wrapperContained); }
// public java.util.function.Predicate method_3508(yarnwrap.state.StateManager selector) { return wrapperContained.method_3508(selector.wrapperContained); }

}