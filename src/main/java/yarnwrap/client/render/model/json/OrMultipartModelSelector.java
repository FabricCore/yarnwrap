package yarnwrap.client.render.model.json;
public class OrMultipartModelSelector { public net.minecraft.client.render.model.json.OrMultipartModelSelector wrapperContained; public OrMultipartModelSelector(net.minecraft.client.render.model.json.OrMultipartModelSelector wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String KEY() { return wrapperContained.KEY; }
// public void KEY(java.lang.String value) { wrapperContained.KEY = value; }
// public java.lang.Iterable selectors() { return wrapperContained.selectors; }
// public void selectors(java.lang.Iterable value) { wrapperContained.selectors = value; }
public OrMultipartModelSelector(java.lang.Iterable selectors) { this.wrapperContained = new net.minecraft.client.render.model.json.OrMultipartModelSelector(selectors); }
// public boolean method_3538(java.util.List state) { return wrapperContained.method_3538(state); }
// public boolean method_3539(yarnwrap.block.BlockState predicate) { return wrapperContained.method_3539(predicate.wrapperContained); }
// public java.util.function.Predicate method_3540(yarnwrap.state.StateManager selector) { return wrapperContained.method_3540(selector.wrapperContained); }

}