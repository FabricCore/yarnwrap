package yarnwrap.client.render.model.json;
public class MultipartModelSelector { public net.minecraft.client.render.model.json.MultipartModelSelector wrapperContained; public MultipartModelSelector(net.minecraft.client.render.model.json.MultipartModelSelector wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.model.json.MultipartModelSelector TRUE() { return new yarnwrap.client.render.model.json.MultipartModelSelector(wrapperContained.TRUE); }
// public void TRUE(yarnwrap.client.render.model.json.MultipartModelSelector value) { wrapperContained.TRUE = value.wrapperContained; }
public yarnwrap.client.render.model.json.MultipartModelSelector FALSE() { return new yarnwrap.client.render.model.json.MultipartModelSelector(wrapperContained.FALSE); }
// public void FALSE(yarnwrap.client.render.model.json.MultipartModelSelector value) { wrapperContained.FALSE = value.wrapperContained; }
public java.util.function.Predicate getPredicate(yarnwrap.state.StateManager stateFactory) { return wrapperContained.getPredicate(stateFactory.wrapperContained); }
// public java.util.function.Predicate method_16808(yarnwrap.state.StateManager stateFactory) { return wrapperContained.method_16808(stateFactory.wrapperContained); }
// public boolean method_16809(yarnwrap.block.BlockState state) { return wrapperContained.method_16809(state.wrapperContained); }
// public java.util.function.Predicate method_16810(yarnwrap.state.StateManager stateFactory) { return wrapperContained.method_16810(stateFactory.wrapperContained); }
// public boolean method_16811(yarnwrap.block.BlockState state) { return wrapperContained.method_16811(state.wrapperContained); }

}