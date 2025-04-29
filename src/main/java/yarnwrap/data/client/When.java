package yarnwrap.data.client;
public class When { public net.minecraft.data.client.When wrapperContained; public When(net.minecraft.data.client.When wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object create() { return wrapperContained.create(); }
public static Object create() { return net.minecraft.data.client.When.create(); }
public void validate(yarnwrap.state.StateManager stateManager) { wrapperContained.validate(stateManager.wrapperContained); }
// public static void validate(yarnwrap.state.StateManager stateManager, ) { net.minecraft.data.client.When.validate(stateManager.wrapperContained); }
// public yarnwrap.data.client.When anyOf(net.minecraft.data.client.When[] conditions) { return new yarnwrap.data.client.When(wrapperContained.anyOf(conditions)); }
// public static yarnwrap.data.client.When anyOf(net.minecraft.data.client.When[] conditions, ) { return new yarnwrap.data.client.When(net.minecraft.data.client.When.anyOf(conditions)); }
// public yarnwrap.data.client.When allOf(net.minecraft.data.client.When[] conditions) { return new yarnwrap.data.client.When(wrapperContained.allOf(conditions)); }
// public static yarnwrap.data.client.When allOf(net.minecraft.data.client.When[] conditions, ) { return new yarnwrap.data.client.When(net.minecraft.data.client.When.allOf(conditions)); }

}